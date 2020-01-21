package com.thiha.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ModelClass> itemLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.mainRecyclerView);

        itemLists = new ArrayList<>();
        itemLists.add(new ModelClass("Thiha Aung", R.drawable.person_male, R.color.colorPrimary, R.drawable.england_flag));
        itemLists.add(new ModelClass("Cherry Phyu", R.drawable.person_female, android.R.color.holo_red_light, R.drawable.japan_flag));
        itemLists.add(new ModelClass("Thiri", R.drawable.person_female, android.R.color.holo_purple, R.drawable.myanmar_flag));
        itemLists.add(new ModelClass("David Kyaw", R.drawable.user_male1, android.R.color.holo_red_dark, R.drawable.russia_flag));
        itemLists.add(new ModelClass("Kyaw Gyi", R.drawable.person_male, android.R.color.holo_blue_dark, R.drawable.england_flag));
        itemLists.add(new ModelClass("Banana", R.drawable.user_male1, android.R.color.holo_green_dark, R.drawable.myanmar_flag));
        itemLists.add(new ModelClass("Kyaw Nanda", R.drawable.user_male, R.color.yellow, R.drawable.japan_flag));
        itemLists.add(new ModelClass("Thiha Aung", R.drawable.person_male, R.color.colorPrimary, R.drawable.england_flag));
        itemLists.add(new ModelClass("Cherry Phyu", R.drawable.person_female, android.R.color.holo_red_light, R.drawable.japan_flag));
        itemLists.add(new ModelClass("Thiri", R.drawable.person_female, android.R.color.holo_purple, R.drawable.myanmar_flag));
        itemLists.add(new ModelClass("David Kyaw", R.drawable.user_male1, android.R.color.holo_red_dark, R.drawable.russia_flag));
        itemLists.add(new ModelClass("Kyaw Gyi", R.drawable.person_male, android.R.color.holo_blue_dark, R.drawable.england_flag));
        itemLists.add(new ModelClass("Banana", R.drawable.user_male1, android.R.color.holo_green_dark, R.drawable.myanmar_flag));
        itemLists.add(new ModelClass("Kyaw Nanda", R.drawable.user_male, R.color.yellow, R.drawable.japan_flag));

        adapter = new CustomAdapter(itemLists);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
