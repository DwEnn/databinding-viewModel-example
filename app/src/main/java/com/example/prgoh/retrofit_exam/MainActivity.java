package com.example.prgoh.retrofit_exam;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.prgoh.retrofit_exam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        binding.setViewModel(viewModel);
        viewModel.map();
    }

//    public void getList(){
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        RetrofitService retrofitService = retrofit.create(RetrofitService.class);
//        Call<RetrofitRepo> call = retrofitService.getList("1");
//        call.enqueue(new Callback<RetrofitRepo>() {
//            @Override
//            public void onResponse(Call<RetrofitRepo> call, Response<RetrofitRepo> response) {
//                RetrofitRepo repo = response.body();
//                textView.setText(repo.idx);
//                Log.e("name", ""+response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<RetrofitRepo> call, Throwable t) {
//                Log.e("onFailure()", "");
//                t.printStackTrace();
//            }
//        });
//    }

}
