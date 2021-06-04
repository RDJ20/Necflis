package com.example.necflis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class emailcontrasena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emailcontrasena);
    }

    public void Siguiente(View view){
        Intent siguiente = new Intent(this, datospersonales.class);
        startActivity(siguiente);
    }
}