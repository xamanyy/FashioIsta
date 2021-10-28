package com.example.fashionista.Women;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fashionista.Men.Items;
import com.example.fashionista.Men.MenAdapter;
import com.example.fashionista.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class WomenFormalBottomActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    MenAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_top_formal);

        recyclerView = findViewById(R.id.rv);

        FirebaseRecyclerOptions<Items> options =
                new FirebaseRecyclerOptions.Builder<Items>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("WomenFormalBottom"), Items.class )
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