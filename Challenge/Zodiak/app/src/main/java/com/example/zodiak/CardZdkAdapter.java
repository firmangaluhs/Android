package com.example.zodiak;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardZdkAdapter extends RecyclerView.Adapter<CardZdkAdapter.ListViewHolder> {
    private ArrayList<Zdk> listZdk;
    private Context context;
    public CardZdkAdapter(Context context, ArrayList<Zdk> listZdk){
        this.listZdk = listZdk;
        this.context = context;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int
            viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_zdk, parent, false);
        return new ListViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position)
    {
        final Zdk zdk = listZdk.get(position);
        Glide.with(holder.itemView.getContext())
                .load(zdk.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(zdk.getName());
        holder.tvDesc.setText(zdk.getDescription());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailZdk = new Intent(context, DetailListZdk.class);
                detailZdk.putExtra("zdk_id", zdk.getId());
                context.startActivity(detailZdk);
            }
        });
    }
    @Override
    public int getItemCount() {
        return listZdk.size();
    }
    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_zdk_list);
            tvName = itemView.findViewById(R.id.name_zdk_list);
            tvDesc = itemView.findViewById(R.id.desc_zdk_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
