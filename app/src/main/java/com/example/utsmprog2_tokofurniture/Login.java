package com.example.utsmprog2_tokofurniture;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {

    TextInputEditText email, password;
    Button login;
    TextView daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.txemail);
        password = findViewById(R.id.txpassword);
        login = findViewById(R.id.btn_login);
        daftar = findViewById(R.id.txdaftar);


        login.setOnClickListener(v -> {
            String usernameKey = email.getText().toString().trim();
            String passwordKey = password.getText().toString().trim();

            if (usernameKey.equals("candra@gmail.com") && passwordKey.equals("123")){
                Toast.makeText(getApplicationContext(), "Login berhasil", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(Login.this, NavBottom.class);
                Login.this.startActivity(in);
                finish();
            }else {
                AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                builder.setMessage("email atau Password Anda salah!")
                        .setNegativeButton("Retry", null).create().show();
            }
        });

        daftar.setOnClickListener(v -> {
            Intent in = new Intent(this, SignUp.class);
            startActivity(in);
        });


    }
}