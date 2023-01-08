package com.example.retrofit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView title,body;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        title=itemView.findViewById(R.id.titleText);
        body=itemView.findViewById(R.id.bodytext);

    }
}
