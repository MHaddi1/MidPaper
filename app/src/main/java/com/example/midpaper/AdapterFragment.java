package com.example.midpaper;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterFragment extends RecyclerView.Adapter<AdapterFragment.ViewHolder> {
    ArrayList<Object> list;
    Context context;

    public AdapterFragment(ArrayList<Object> list, Context context){
        this.list=list;
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

       Model model = (Model) list.get(position);
       holder.img.setImageResource(model.getImage());
//       holder.title.setText(model.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,SecondScreen.class);
                i.putExtra("image", model.getImage());
                i.putExtra("title",model.getTitle());
                i.putExtra("rating",model.getRating());
                i.putExtra("Arthur",model.getArthur());
                i.putExtra("star",model.getStar());
                i.putExtra("description",model.getDescription());
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        CardView card;
//        TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            card = itemView.findViewById(R.id.card);
//            title = itemView.findViewById(R.id.title);

        }



    }

}
