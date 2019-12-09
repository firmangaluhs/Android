package com.example.mylocalization;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_profile, container, false);

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_profile, null);
        TextView name = root.findViewById(R.id.nama);
        TextView alamat = root.findViewById(R.id.alamat);
        TextView hobi = root.findViewById(R.id.hobi);
        TextView quote = root.findViewById(R.id.quote);


        String nama = String.format(getResources().getString(R.string.Nama));
        name.setText(nama);
        String al= String.format(getResources().getString(R.string.Alamat));
        alamat.setText(al);
        String hob = String.format(getResources().getString(R.string.Hobi));
        hobi.setText(hob);
        String qu = String.format(getResources().getString(R.string.Quote));
        quote.setText(qu);

        return root;
    }
    }


