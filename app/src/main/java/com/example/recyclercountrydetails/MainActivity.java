package com.example.recyclercountrydetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CountriesDetailAdapter adapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Model> contents = new ArrayList<>();
        Model obj1 = new Model();
        obj1.setName("Nepal");
        obj1.setCode("+977");
        obj1.setImage(R.drawable.nepalflag);
        contents.add(obj1);

        Model obj2 = new Model();
        obj2.setName("South Korea");
        obj2.setCode("+82");
        obj2.setImage(R.drawable.koreaflag);
        contents.add(obj2);

        Model obj3 = new Model();
        obj3.setName("Australia");
        obj3.setCode("+61");
        obj3.setImage(R.drawable.australiaflag);
        contents.add(obj3);

        Model obj4 = new Model();
        obj4.setName("Sweden");
        obj4.setCode("+46");
        obj4.setImage(R.drawable.swedenflag);
        contents.add(obj4);



        recyclerView = findViewById(R.id.recycler_view);

        adapter = new CountriesDetailAdapter(this , contents);
        linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}