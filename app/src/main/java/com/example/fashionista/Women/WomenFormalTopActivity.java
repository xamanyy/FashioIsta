package com.example.fashionista.Women;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fashionista.Men.Items;
import com.example.fashionista.Men.MenAdapter;
import com.example.fashionista.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class WomenFormalTopActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    MenAdapter adapter;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_top_formal);

        recyclerView = findViewById(R.id.rv);

        progressBar = findViewById(R.id.progressBar);


        progressBar.setVisibility(View.VISIBLE);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.INVISIBLE);
            }
        }, 2000);

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        FirebaseRecyclerOptions<Items> options =
                new FirebaseRecyclerOptions.Builder<Items>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("WomenFormalTop"), Items.class )
                .build();

        adapter = new MenAdapter(options);
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