package com.example.catintrotask.UI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.catintrotask.Adapter.UserAdapter;
import com.example.catintrotask.Data.User;
import com.example.catintrotask.R;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment implements UserAdapter.onClickUser {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.userslist);
        List<User> list = new ArrayList<>();
        list.add(new User("Mahmoud Elshahtt", 1, R.drawable.user));
        list.add(new User("Katty smith", 2, R.drawable.user));
        list.add(new User("Ashraff Ahmed", 3, R.drawable.user));
        list.add(new User("Abdo Saber", 4, R.drawable.user));
        list.add(new User("Ramez Elsayed", 5, R.drawable.user));
        list.add(new User("Eslam Ahmed", 6, R.drawable.user));
        list.add(new User("Mazen Eslam", 7, R.drawable.user));
        list.add(new User("Ashraff Ahmed", 3, R.drawable.user));
        list.add(new User("Abdo Saber", 4, R.drawable.user));
        list.add(new User("Ramez Elsayed", 5, R.drawable.user));
        list.add(new User("Eslam Ahmed", 6, R.drawable.user));
        list.add(new User("Mazen Eslam", 7, R.drawable.user));

        UserAdapter adapter = new UserAdapter(list, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onClick(User user) {
        Bundle bundle = new Bundle();
        bundle.putString("name", user.getName());
        bundle.putInt("id", user.getId());
        bundle.putInt("image", user.getImage());

        DataFragment fragment2 = new DataFragment();
        fragment2.setArguments(bundle);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.flfragment, fragment2)
                .addToBackStack(null)
                .commit();
    }
}