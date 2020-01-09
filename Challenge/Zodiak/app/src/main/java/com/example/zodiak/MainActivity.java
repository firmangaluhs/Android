package com.example.zodiak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvZdk;
    private ArrayList<Zdk> list = new ArrayList<>();
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Ramalan Zodiak Di Tahun 2020");
        }
        rvZdk = findViewById(R.id.rv_zdk);
        rvZdk.setHasFixedSize(true);
        list.addAll(ZdkData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvZdk.setLayoutManager(new LinearLayoutManager(this));
        CardZdkAdapter cardZdkAdapter = new CardZdkAdapter(this, list);
        rvZdk.setAdapter(cardZdkAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        this.menu = menu;
        getMenuInflater().inflate(R.menu.menu, menu);
        invalidateOptionsMenu();
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        if(id == R.id.action_about){
            Intent about = new Intent(this, About.class);
            startActivity(about);
        } return super.onOptionsItemSelected(item);
    }
}
