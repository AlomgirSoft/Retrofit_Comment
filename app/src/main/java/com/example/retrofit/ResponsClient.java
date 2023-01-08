package com.example.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ResponsClient {


 public static Retrofit retrofit= null;

 public static Retrofit get_retrofit_Sigle(){

     if (retrofit==null){
         retrofit=new Retrofit.Builder()
                 .baseUrl(BaseUri.BASE_URI)
                 .addConverterFactory(GsonConverterFactory.create())
                 .build();
     }

     return retrofit;
 }





}
