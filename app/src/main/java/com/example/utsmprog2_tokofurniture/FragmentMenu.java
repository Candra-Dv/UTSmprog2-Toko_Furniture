package com.example.utsmprog2_tokofurniture;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FragmentMenu extends Fragment {

    public Intent in;
    LinearLayout barang;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_menu, container, false);

        barang = rootView.findViewById(R.id.menu1);
        barang.setOnClickListener(v -> {
            in = new Intent(getActivity(), DetailBarang.class);
            startActivity(in);
        });

        return rootView;

    }
}