package com.example.utsmprog2_tokofurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HalBayar extends AppCompatActivity {

    public Intent in;
    Button btn_pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_bayar);

        btn_pay = findViewById(R.id.btn_cash);
        btn_pay.setOnClickListener(v -> {
            in = new Intent(this, Pembayaran.class);
            startActivity(in);
        });
    }
}