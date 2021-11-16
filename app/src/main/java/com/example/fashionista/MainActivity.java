package com.example.fashionista;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

//        if(Utility.isNetworkConnected(this))
//        {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Write whatever to want to do after delay specified (1 sec)
                startActivity(new Intent(MainActivity.this, LoginPage.class));
//                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, 3000);

    }
//        else if(!Utility.isNetworkConnected(this))
//            Utility.showAlert(this,"Internet Connection Not Present.","Network Error!");

}





