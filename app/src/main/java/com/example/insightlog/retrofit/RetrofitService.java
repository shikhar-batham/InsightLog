package com.example.insightlog.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    Retrofit retrofit;

    public RetrofitService() {
        initializeRetrofit();
    }

    void initializeRetrofit() {

        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.43.97:8080")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
