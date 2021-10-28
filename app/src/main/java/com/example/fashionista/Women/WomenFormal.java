package com.example.fashionista.Women;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fashionista.R;

public class WomenFormal extends AppCompatActivity {

    private ImageView top;
    private ImageView bottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.womens_formals);

        top = (ImageView) findViewById(R.id.top2);
        bottom = (ImageView) findViewById(R.id.bottom2);

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WomenFormal.this, WomenFormalTopActivity.class));
            }
        });

        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WomenFormal.this, WomenFormalBottomActivity.class));
            }
        });

    }
}