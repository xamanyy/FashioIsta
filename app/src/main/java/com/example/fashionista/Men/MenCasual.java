package com.example.fashionista.Men;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fashionista.R;

public class MenCasual extends AppCompatActivity {

    private ImageView top;
    private ImageView bottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mens_casuals);

        top = (ImageView) findViewById(R.id.top);
        bottom = (ImageView) findViewById(R.id.bottom);

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MenCasual.this, MenTopCasual.class));
            }
        });

        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenCasual.this, MenBottomCasualActivity.class));
            }
        });
    }
}
