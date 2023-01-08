package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostDTO {

    @GET("/posts")
    Call<List<ResponseItem>>getAllResponse();
}
