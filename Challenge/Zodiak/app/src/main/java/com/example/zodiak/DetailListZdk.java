package com.example.zodiak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListZdk extends AppCompatActivity {
    private int zdk_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Zdk> listZdk = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_zdk);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        zdk_id = getIntent().getIntExtra("zdk_id",0);
        tvName = findViewById(R.id.nama_zdk);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);
        listZdk.addAll(ZdkData.getListData());
        getSupportActionBar().setTitle(listZdk.get(zdk_id).getName());
        setLayout();
    }

    private void setLayout() {
        tvName.setText(listZdk.get(zdk_id).getName());
        tvDesc.setText(listZdk.get(zdk_id).getDescription());
        Glide.with(this)
                .load(listZdk.get(zdk_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
