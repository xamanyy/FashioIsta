package com.example.fashionista.Women;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fashionista.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class WomenCasualBottomActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    WomenAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_casual_bottom);

        recyclerView = findViewById(R.id.recylerView);

        FirebaseRecyclerOptions<WomenItems> options =
                new FirebaseRecyclerOptions.Builder<WomenItems>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("WomenCasualBottom"), WomenItems.class )
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