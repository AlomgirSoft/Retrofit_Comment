package com.example.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class User_Adapter extends RecyclerView.Adapter<UserViewHolder> {


    private Context context;
    private ArrayList<ResponseItem>responseItems;

    public User_Adapter(Context context, ArrayList<ResponseItem> responseItems) {
        this.context = context;
        this.responseItems = responseItems;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        String title,body;
        ResponseItem responseItem=responseItems.get(position);

        title=responseItem.getTitle();
        body= responseItem.getBody();
        holder.title.setText(title);
        holder.body.setText(body);


    }

    @Override
    public int getItemCount() {
        return responseItems.size();
    }
}
