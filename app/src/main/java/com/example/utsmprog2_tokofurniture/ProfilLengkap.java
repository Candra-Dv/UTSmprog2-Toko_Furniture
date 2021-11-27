package com.example.utsmprog2_tokofurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ProfilLengkap extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_lengkap);

        btn = findViewById(R.id.btn_cn);

        btn.setOnClickListener(v -> {
            Intent in = new Intent(this, OTP.class);
            startActivity(in);
        });


    }
}