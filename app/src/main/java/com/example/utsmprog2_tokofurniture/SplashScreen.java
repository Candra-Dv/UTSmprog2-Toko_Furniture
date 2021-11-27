package com.example.utsmprog2_tokofurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        btn = findViewById(R.id.btn_lnjut);

        btn.setOnClickListener(v -> {
            Intent in = new Intent(this, Login.class);
            startActivity(in);
        });
    }
}