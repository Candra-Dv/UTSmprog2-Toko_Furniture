package com.example.utsmprog2_tokofurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HalBeli extends AppCompatActivity {

    public Intent in;
    Button bt_beli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_beli);

        bt_beli = findViewById(R.id.btn_pembayaran);
        bt_beli.setOnClickListener(v -> {
            in = new Intent(this, HalBayar.class);
            startActivity(in);
        });
    }
}