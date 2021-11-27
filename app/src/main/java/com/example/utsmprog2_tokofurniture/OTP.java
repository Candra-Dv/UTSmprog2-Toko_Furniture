package com.example.utsmprog2_tokofurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class OTP extends AppCompatActivity {

    EditText otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        otp = findViewById(R.id.otp);

        otp.setOnClickListener(v -> {
            Intent in = new Intent(this, NavBottom.class);
            startActivity(in);
        });
    }
}