package com.example.fashionista.Men;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fashionista.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MenTopCasualActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    CasualTopItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_top_formal);

        recyclerView = findViewById(R.id.rv);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<CasualTopItem> options
                = new FirebaseRecyclerOptions.Builder<CasualTopItem>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("MenCasualTop"), CasualTopItem.class)
                .build();

        adapter = new CasualTopItemAdapter(options);
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