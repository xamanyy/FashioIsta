package com.example.fashionista.Men;

import static androidx.core.content.ContextCompat.createDeviceProtectedStorageContext;
import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
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

        holder.comp.setText(model.getCompany());

//        holder.Url.setText(model.getUrl());
//        holder.rating.setText(model.getRating());
        Glide.with(holder.img.getContext()).load(model.getImageUrl()).into(holder.img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Context context = view.getContext();

                context.startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.myntra.com/tshirts/roadster/roadster-men-navy-blue--maroon-striped-round-neck-t-shirt/10424682/buy")));
            }
        });

    }

    @NonNull
    @Override
    public MenViewholder onCreateViewHolder(@NonNull ViewGroup parent,int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item, parent, false);
        return new MenViewholder(view);
    }


    class MenViewholder extends RecyclerView.ViewHolder {
        TextView name, comp;
        ImageView img;
        public MenViewholder(@NonNull View itemView)
        {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.img);
            name = (TextView) itemView.findViewById(R.id.name);
//            stock = (TextView) itemView.findViewById(R.id.stock);
            comp = (TextView) itemView.findViewById(R.id.com);
//            Url = (TextView) itemView.findViewById(R.id.url);

        }
    }
}