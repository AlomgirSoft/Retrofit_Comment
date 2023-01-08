package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recycler);



          PostDTO dto= ResponsClient.get_retrofit_Sigle().create(PostDTO.class);

         Call<List<ResponseItem>>response =dto.getAllResponse();

         response.enqueue(new Callback<List<ResponseItem>>() {
             @Override
             public void onResponse(Call<List<ResponseItem>> call, Response<List<ResponseItem>> response) {

                 if (response.isSuccessful()){
                     Log.i("TAG", "code: "+response.code() );

                     List<ResponseItem>responseT=response.body();


                     User_Adapter adapter = new User_Adapter((Context) MainActivity.this, (ArrayList<ResponseItem>) responseT);
                     recyclerView.setAdapter(adapter);




                 }


             }

             @Override
             public void onFailure(Call<List<ResponseItem>> call, Throwable t) {

             }
         });




    }
}