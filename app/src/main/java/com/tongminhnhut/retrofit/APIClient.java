package com.tongminhnhut.retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.lang.reflect.Type;

public interface APIClient {
    
    @POST("/login")
    @FormUrlEncoded
    Call<DataRespone> login (@Field("username") String username, @Field("password") String password) ;
    
}
