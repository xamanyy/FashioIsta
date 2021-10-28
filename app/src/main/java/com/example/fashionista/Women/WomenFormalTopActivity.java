package com.example.fashionista.Women;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fashionista.Men.MenAdapter;
import com.example.fashionista.R;
import com.example.fashionista.databinding.ActivityWomenFormalTopBinding;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class WomenFormalTopActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    WomenAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_formal_top);

        recyclerView = findViewById(R.id.recylerView);

        FirebaseRecyclerOptions<WomenItems> options =
                new FirebaseRecyclerOptions.Builder<WomenItems>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("WomenFormalTop"), WomenItems.class )
                .build();

        adapter = new WomenAdapter(options);
        recyclerView.setAdapter(adapter);
    }

    @Override protected void onStart()
    {
        super.onStart();
        adapter.startListening();
    }

    @Override protected void onStop()
    {
        super.onStop();
        adapter.stopListening();
    }
}