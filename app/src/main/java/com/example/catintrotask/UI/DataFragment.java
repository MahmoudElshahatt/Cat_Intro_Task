package com.example.catintrotask.UI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.catintrotask.Adapter.UserAdapter;
import com.example.catintrotask.Data.User;
import com.example.catintrotask.R;

public class DataFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_data, container, false);
        TextView name = view.findViewById(R.id.name);
        TextView id = view.findViewById(R.id.id);
        ImageView userImage = view.findViewById(R.id.image);

        Bundle bundle = this.getArguments();

        if (bundle != null) {
            name.setText(bundle.getString("name"));
            id.setText(String.valueOf(bundle.getInt("id")));
            userImage.setImageResource(bundle.getInt("image"));
        }
        return view;
    }

}