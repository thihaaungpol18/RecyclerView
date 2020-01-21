package com.example.myapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * project: My Application
 * Created by : Thiha Eung
 * date : 1/21/2020
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private static final String TAG = "CustomAdapter";
    private ArrayList<ModelClass> itemLists;

    public CustomAdapter(ArrayList<ModelClass> itemLists) {
        this.itemLists = itemLists;
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView nameTv;
        CircleImageView imageView;
        CardView cardView;

        public CustomViewHolder(@NonNull View itemView) {

            super(itemView);
            cardView = itemView.findViewById(R.id.mainCardView);
            nameTv = itemView.findViewById(R.id.nameTextView);
            imageView = itemView.findViewById(R.id.circleImageView);

        }
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_layout, parent, false);
        return new CustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.cardView.setCardBackgroundColor(holder.imageView.getResources().getColor(itemLists.get(position).getmBgcolor()));
        holder.nameTv.setText(itemLists.get(position).getmName());
        holder.imageView.setImageResource(itemLists.get(position).getmImage());
    }

    @Override
    public int getItemCount() {
        return itemLists.size();
    }


}
