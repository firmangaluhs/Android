package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMove,btnData, btnCall, btnBrowser, btnInputData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btnMove);
        btnMove.setOnClickListener(this);

        btnData = findViewById(R.id.btnData);
        btnData.setOnClickListener(this);

        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(this);

        btnBrowser = findViewById(R.id.btnBrowser);
        btnBrowser.setOnClickListener(this);

        btnInputData = findViewById(R.id.btnInputData);
        btnInputData.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMove:
                Intent moveActivity = new Intent( this, MoveActivity.class);
                startActivity(moveActivity);
                break;
             case R.id.btnData:
                 Intent moveDataActivity = new Intent(this,MoveDataActivity.class);
                 moveDataActivity.putExtra(MoveDataActivity.EXTRA_NAME,"Firman Galuh Sembodo");
                 moveDataActivity.putExtra(MoveDataActivity.EXTRA_AGE, 19);
                 startActivity(moveDataActivity);
                 break;
            case R.id.btnCall:
                String phoneNumber = "085602071616";
                Intent callIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+phoneNumber));
                startActivity(callIntent);
                break;
            case R.id.btnBrowser:
                String url = "http://ittelkom-pwt.ac.id/";
                Intent intentImplicitWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intentImplicitWeb);
                break;
            case R.id.btnInputData:
                Intent intentInputData = new Intent(this, ActivityData1.class);
                startActivity(intentInputData);
                break;

        }

    }

}
