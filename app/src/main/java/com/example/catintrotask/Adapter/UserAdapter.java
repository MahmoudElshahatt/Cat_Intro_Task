package com.example.catintrotask.Adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.catintrotask.Data.User;
import com.example.catintrotask.R;
import com.example.catintrotask.UI.DataFragment;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewAdapter> {
    private List<User> list;
    private onClickUser clickUser;

    public UserAdapter(List<User> list) {
        this.list = list;
    }

    public UserAdapter(List<User> list, onClickUser clickUser) {
        this.list = list;
        this.clickUser = clickUser;
    }

    @NonNull
    @Override
    public UserAdapter.MyViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.MyViewAdapter holder, int position) {
        holder.Binddata(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewAdapter extends RecyclerView.ViewHolder {
        ImageView userimage;
        TextView id, name;

        public MyViewAdapter(@NonNull View itemView) {
            super(itemView);
            userimage = itemView.findViewById(R.id.userImage);
            id = itemView.findViewById(R.id.idUser);
            name = itemView.findViewById(R.id.userName);
        }

        public void Binddata(User user) {
            userimage.setImageResource(user.getImage());
            id.setText(String.valueOf(user.getId()));
            name.setText(user.getName());
            itemView.setOnClickListener(v -> {
                clickUser.onClick(user);
            });
        }

    }

    public interface onClickUser {
        public void onClick(User user);
    }
}
