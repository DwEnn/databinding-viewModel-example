package com.example.prgoh.retrofit_exam;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by prgoh on 2017-11-30.
 */

public class MainViewModel extends ViewModel {

    private final String URL = "http://devwon.com/andstudy/";

    public final ObservableField<String> dataText = new ObservableField<>();

    public void map(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL).addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitService retrofitService = retrofit.create(RetrofitService.class);
        Call<List<Item>> call = retrofitService.data("list", "1");
        call.enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                List<Item> datas = response.body();

                Log.e("data", ""+response.body().toString());
                Log.e("datas", ""+datas.get(0).name);

                StringBuffer buffer = new StringBuffer();
                for (Item data : datas){
                    buffer.append(data.name+" // "+data.price+"\t");
                }
                dataText.set(buffer.toString());
            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
