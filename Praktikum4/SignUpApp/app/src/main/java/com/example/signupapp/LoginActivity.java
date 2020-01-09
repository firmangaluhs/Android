package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button jancu = findViewById(R.id.Btrcokks);
        jancu.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent Kintil=new Intent(LoginActivity.this,MainActivity.class);
        startActivity(Kintil);
    }
}
