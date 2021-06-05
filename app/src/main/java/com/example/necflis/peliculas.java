package com.example.necflis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class peliculas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas);
    }

    public void busqueda(View view){
        Intent siguiente = new Intent(this, busqueda.class);
        startActivity(siguiente);
    }
    public void usuario(View view){
        Intent siguiente = new Intent(this, cuenta.class);
        startActivity(siguiente);
    }
    public void casa(View view){
        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);
    }


}