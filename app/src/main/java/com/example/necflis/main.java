package com.example.necflis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class main extends AppCompatActivity {



    RecyclerView verticalRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        verticalRecyclerView = (RecyclerView)findViewById(R.id.main_recycler);
        verticalRecyclerView.setHasFixedSize(true);

        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));

        // Hacer una adaptador vertical para el recyclerView
    }
}