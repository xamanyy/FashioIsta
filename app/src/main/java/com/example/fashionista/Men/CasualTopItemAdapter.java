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

public class CasualTopItemAdapter extends FirebaseRecyclerAdapter<
        CasualTopItem, CasualTopItemAdapter.myViewholder> {

    public CasualTopItemAdapter(@NonNull FirebaseRecyclerOptions<CasualTopItem> options)
    {
        super(options);
    }


    @Override
    protected void onBindViewHolder(@NonNull myViewholder holder, int position, @NonNull CasualTopItem model)
    {

        holder.name.setText(model.getItemName());

        holder.stock.setText(model.getStock());
        Glide.with(holder.img.getContext()).load(model.getImageUrl()).into(holder.img);
    }

    @NonNull
    @Override
    public myViewholder onCreateViewHolder(@NonNull ViewGroup parent,int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item, parent, false);
        return new myViewholder(view);
    }


    class myViewholder extends RecyclerView.ViewHolder {
        TextView name, stock;
        ImageView img;
        public myViewholder(@NonNull View itemView)
        {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.img);
            name = (TextView) itemView.findViewById(R.id.name);
            stock = (TextView) itemView.findViewById(R.id.stock);
        }
    }
}