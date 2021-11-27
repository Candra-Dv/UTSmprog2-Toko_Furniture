package com.example.utsmprog2_tokofurniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavBottom extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bottom);

        loadFragment(new FragmentMenu());

        BottomNavigationView bottomNavigationView = findViewById(R.id.bt_Navi);
        bottomNavigationView.setOnNavigationItemSelectedListener(itemMenu -> {
            Fragment fragment;
            switch (itemMenu.getItemId()){
                case R.id.fragmentMenu:
                    fragment = new FragmentMenu();
                    loadFragment(fragment);
                    break;
                case R.id.fragmentWishlist:
                    fragment = new FragmentWishlist();
                    loadFragment(fragment);
                    break;
                case R.id.fragmentTransaksi:
                    fragment = new FragmentTransaksi();
                    loadFragment(fragment);
                    break;
                case R.id.fragmentAkun:
                    fragment = new FragmentAkun();
                    loadFragment(fragment);
                    break;
            }
            return true;
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentCV,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}