package com.example.midpaper;

import android.content.Intent;
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

    ArrayList<Object> list;
    ArrayList <Object> getList(){
        list = new ArrayList<>();
        list.add(new Model(R.drawable.sci_fri,R.drawable.ic_baseline_star_rate_24,R.drawable.ic_launcher_foreground,"DUNE","Haddi","2.5","Writer","7K","This is a Description"));
        list.add(new Model(R.drawable.fantacy,R.drawable.ic_baseline_star_rate_24,R.drawable.ic_launcher_foreground,"First Bite","Haddi","2.5","Writer","7K","This is a Description"));
        list.add(new Model(R.drawable.advanture,R.drawable.ic_baseline_star_rate_24,R.drawable.ic_launcher_foreground,"The Night of Danger","Haddi","2.5","Writer","7K","This is a Description"));
        list.add(new Model(R.drawable.action,R.drawable.ic_baseline_star_rate_24,R.drawable.ic_launcher_foreground,"Targeted Killing","Haddi","2.5","Writer","7K","This is a Description"));
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