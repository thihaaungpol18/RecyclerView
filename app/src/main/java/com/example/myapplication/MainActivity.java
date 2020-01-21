package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
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
        itemLists.add(new ModelClass("Thiha Aung", R.drawable.person_male, R.color.colorPrimary));
        itemLists.add(new ModelClass("Cherry 1oPhyu", R.drawable.person_female, android.R.color.holo_red_light));
        itemLists.add(new ModelClass("Thiri", R.drawable.person_male, android.R.color.holo_purple));
        itemLists.add(new ModelClass("David Kyaw", R.drawable.user_male1, android.R.color.holo_red_dark));
        itemLists.add(new ModelClass("Kyaw Gyi", R.drawable.person_female, android.R.color.holo_blue_dark));
        itemLists.add(new ModelClass("Banana", R.drawable.user_male1, android.R.color.holo_green_dark));
        itemLists.add(new ModelClass("Kyaw Nanda", R.drawable.user_male, android.R.color.darker_gray));

        adapter = new CustomAdapter(itemLists);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
