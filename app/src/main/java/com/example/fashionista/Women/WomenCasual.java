package com.example.fashionista.Women;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fashionista.Men.MenBottomCasualActivity;
import com.example.fashionista.Men.MenCasual;
import com.example.fashionista.Men.MenTopCasualActivity;
import com.example.fashionista.R;

public class WomenCasual extends AppCompatActivity {

    private ImageView top;
    private ImageView bottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.womens_casuals);

        top = (ImageView) findViewById(R.id.top1);
        bottom = (ImageView) findViewById(R.id.bottom1);

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(WomenCasual.this, WomenCasualTopActivity.class));
            }
        });

        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WomenCasual.this, WomenCasualBottomActivity.class));
            }
        });

    }
}