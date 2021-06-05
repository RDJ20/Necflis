package com.example.necflis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class busqueda extends AppCompatActivity {
private ImageButton showSheet;
private BottomSheetDialog bottomSheetDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Mensaje ", "Sie");
        setContentView(R.layout.activity_busqueda);
        showSheet=findViewById(R.id.imageButton8);
        Log.d("Mensaje ", "Si");
        showSheet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("Mensaje ", "Si");
                bottomSheetDialog = new BottomSheetDialog(busqueda.this,R.style.BottomSheetTheme);
                View sheetView= LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottom_sheet_layout,
                        findViewById(R.id.bottom_sheet));
                sheetView.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bottomSheetDialog.dismiss();

                    }
                });
                sheetView.findViewById(R.id.getLink).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bottomSheetDialog.dismiss();


                    }
                });
                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();
            }
        });


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

    public void peliculas(View view){
        Intent siguiente = new Intent(this, peliculas.class);
        startActivity(siguiente);
    }
    public void series(View view){
        Intent siguiente = new Intent(this, series.class);
        startActivity(siguiente);
    }


}