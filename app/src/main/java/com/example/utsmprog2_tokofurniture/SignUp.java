package com.example.utsmprog2_tokofurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText login;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        login = findViewById(R.id.txlogin);
        btn = findViewById(R.id.btn_login);


        login.setOnClickListener(v -> {
            Intent in = new Intent(this, Login.class);
            startActivity(in);
        });

        btn.setOnClickListener(v -> {
            Intent in = new Intent(this, ProfilLengkap.class);
            startActivity(in);
        });

    }
}