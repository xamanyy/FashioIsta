package com.example.fashionista.Men;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fashionista.R;

public class MenFormal extends AppCompatActivity {

    private ImageView top;
    private ImageView bottom;

    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mens_formals);

        top = (ImageView) findViewById(R.id.top);
        bottom = (ImageView) findViewById(R.id.bottom);

//        top.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MenFormal.this, MenTopFormalActivity.class));
//            }
//        });

//        bottom.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MenCloth.this, MenCasual.class));
//            }
//        });

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenFormal.this, MenFormalTopActivity.class));
            }
        });

        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenFormal.this, MenFormalBottomActivity.class));
            }
        });
    }
}

