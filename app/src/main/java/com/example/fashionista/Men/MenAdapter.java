package com.example.fashionista.Men;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fashionista.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MenAdapter extends FirebaseRecyclerAdapter<
        Items, MenAdapter.MenViewholder> {

    public MenAdapter(@NonNull FirebaseRecyclerOptions<Items> options)
    {
        super(options);
    }


    @Override
    protected void onBindViewHolder(@NonNull MenViewholder holder, int position, @NonNull Items model)
    {

        holder.name.setText(model.getItemName());

        holder.stock.setText(model.getStock());
//        holder.rating.setText(model.getRating());
        Glide.with(holder.img.getContext()).load(model.getImageUrl()).into(holder.img);
    }

    @NonNull
    @Override
    public MenViewholder onCreateViewHolder(@NonNull ViewGroup parent,int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item, parent, false);
        return new MenViewholder(view);
    }


    class MenViewholder extends RecyclerView.ViewHolder {
        TextView name, stock, rating;
        ImageView img;
        public MenViewholder(@NonNull View itemView)
        {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.img);
            name = (TextView) itemView.findViewById(R.id.name);
            stock = (TextView) itemView.findViewById(R.id.stock);
            rating = (TextView) itemView.findViewById(R.id.rating);
        }
    }
}