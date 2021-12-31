package com.example.utsmprog2_tokofurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DetailBarang extends AppCompatActivity {

    public Intent in;
    Button membeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_barang);

        membeli = findViewById(R.id.btn_beli);
        membeli.setOnClickListener(v -> {
            in = new Intent(this, HalBeli.class);
            startActivity(in);
        });
    }
}