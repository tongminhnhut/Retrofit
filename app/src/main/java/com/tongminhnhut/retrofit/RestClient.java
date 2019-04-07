package com.tongminhnhut.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private String BaseURL = "https://" ;


    Retrofit restClient = new Retrofit.Builder()
            .baseUrl(BaseURL)
            .client(UnsafeOkHttpClient.getUnsafeOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build() ;


}
