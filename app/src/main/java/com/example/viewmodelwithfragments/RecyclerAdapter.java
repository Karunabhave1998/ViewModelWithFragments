package com.example.viewmodelwithfragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;
    List<UserModel> userModelList = new ArrayList<>();
    UserModel userModel;

    public RecyclerAdapter(Context context, List<UserModel> userModelList) {
        this.context = context;
        this.userModelList = userModelList;
    }






    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_recycler,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

      holder.UsernameText.setText(userModelList.get(position).getName());
      holder.EmailText.setText(userModelList.get(position).getEmail());




    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView UsernameText, EmailText;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            UsernameText = itemView.findViewById(R.id.displayUsernameTxtID);
            EmailText = itemView.findViewById(R.id.displayEmailTxtID);
        }
    }
}
