package com.example.midpaper;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class A_Fragment extends Fragment {



    public A_Fragment() {
        // Required empty public constructor
    }

    List<Model> list;
    List <Model> getList(){
        list = new ArrayList<>();
        list.add(new Model(R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,"Hi","Haddi","2.5","Writer","7K","This is a Description"));
        list.add(new Model(R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,"Hi","Haddi","2.5","Writer","7K","This is a Description"));
        list.add(new Model(R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,"Hi","Haddi","2.5","Writer","7K","This is a Description"));
        list.add(new Model(R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,"Hi","Haddi","2.5","Writer","7K","This is a Description"));
        return list;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_a_, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.frag);

        RecyclerView.LayoutManager manager;
        manager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(manager);
        AdapterFragment adapterFragment = new AdapterFragment(getList(),getContext());
        recyclerView.setAdapter(adapterFragment);
        recyclerView.setHasFixedSize(true);

        return view;
    }
}