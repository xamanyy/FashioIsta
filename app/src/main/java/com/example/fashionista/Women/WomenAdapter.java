package com.example.fashionista.Women;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fashionista.R;
import com.example.fashionista.databinding.EachItemBinding;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class WomenAdapter extends FirebaseRecyclerAdapter<WomenItems, WomenAdapter.WomenViewHolder> {


    public WomenAdapter(@NonNull FirebaseRecyclerOptions<WomenItems> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull WomenViewHolder holder, int position, @NonNull WomenItems model) {
        holder.name.setText(model.getItemName());
        holder.stock.setText(model.getStock());
        holder.rating.setText(model.getRating());
        Glide.with(holder.img.getContext()).load(model.getImageUrl()).into(holder.img);
    }

    @NonNull
    @Override
    public WomenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item, parent, false);
        return new WomenViewHolder(view);
    }

    public class WomenViewHolder extends RecyclerView.ViewHolder {

        TextView name, stock, rating;
        ImageView img;
        public WomenViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            stock = itemView.findViewById(R.id.stock);
            img = itemView.findViewById(R.id.img);
            rating = itemView.findViewById(R.id.rating);
        }
    }
}

