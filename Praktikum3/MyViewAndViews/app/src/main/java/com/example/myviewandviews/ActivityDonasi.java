package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityDonasi extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi);
        Button klik =findViewById(R.id.tahu);
        klik.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent joss =new Intent(this,MainActivity.class);
        startActivity(joss);
    }
}