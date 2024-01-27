package com.example.insightlog.apiService;

import com.example.insightlog.modelDto.LoginDto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginService {

    @POST("/api/v1/login/")
    Call<LoginDto> createLogin(@Body LoginDto loginDto);
}
