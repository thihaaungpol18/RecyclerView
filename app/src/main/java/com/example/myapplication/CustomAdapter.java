package com.example.myapplication;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
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
        View currentView;

        public CustomViewHolder(@NonNull View itemView) {

            super(itemView);
            cardView = itemView.findViewById(R.id.mainCardView);
            nameTv = itemView.findViewById(R.id.nameTextView);
            imageView = itemView.findViewById(R.id.circleImageView);
            currentView = itemView;

        }
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_layout, parent, false);
        return new CustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomViewHolder holder, final int position) {
        final int backgroundColor = holder.imageView.getResources().getColor(itemLists.get(position).getmBgColor());
        holder.cardView.setCardBackgroundColor(backgroundColor);
        holder.nameTv.setText(itemLists.get(position).getmName());
        holder.imageView.setImageResource(itemLists.get(position).getmImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Initializing What We Want To Use
                LayoutInflater inflater = (LayoutInflater) v.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = inflater.inflate(R.layout.popup_layout, null, false);
                PopupWindow popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setAnimationStyle(android.R.style.Animation_Translucent);
                popupWindow.setFocusable(true);
                popupWindow.setElevation(200);

                TextView nameTextView = view.findViewById(R.id.nameTextViewPopup);
                RelativeLayout relativeLayout = view.findViewById(R.id.mainRelativeLayoutPopup);
                ImageView flagImageView = view.findViewById(R.id.flagImageViewPopup);
                ImageView profileImageView = view.findViewById(R.id.circleImageViewPopup);

                relativeLayout.setBackgroundColor(backgroundColor);
                nameTextView.setText(itemLists.get(position).getmName());
                profileImageView.setImageResource(itemLists.get(position).getmImage());
                flagImageView.setImageResource(itemLists.get(position).getmFlagImage());

                popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemLists.size();
    }


}
