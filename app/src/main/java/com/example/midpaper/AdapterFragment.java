package com.example.midpaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterFragment extends RecyclerView.Adapter<AdapterFragment.ViewHolder> {
    List<Model> List;
    Context context;
    public AdapterFragment(List<Model> List, Context context){
        this.List=List;
        this.context=context;
    }

    @NonNull
    @Override
    public AdapterFragment.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(context).inflate(R.layout.frame_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterFragment.ViewHolder holder, int position) {
        holder.img.setImageResource(List.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        CardView card;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            card = itemView.findViewById(R.id.card);

        }
    }
}
