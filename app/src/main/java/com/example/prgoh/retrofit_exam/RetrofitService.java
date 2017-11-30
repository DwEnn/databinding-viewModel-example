package com.example.prgoh.retrofit_exam;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by prgoh on 2017-09-10.
 */

public interface RetrofitService {
    @GET("{what}/{num}")
    Call<List<Item>> data(
            @Path("what") String what,
            @Path("num") String num
    );
}











