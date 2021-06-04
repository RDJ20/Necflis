package com.example.necflis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class busqueda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);

        ImageButton imageButton = findViewById(R.id.imageButton8);
       imageButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Log.d("mensaje","Hola");
               BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                       busqueda.this, R.style.BottomSheetDialogTheme
               );
               View bottomSheetView = LayoutInflater.from(getApplicationContext())
                       .inflate(
                               R.layout.layout_buttom_sheet,
                               (LinearLayout)findViewById(R.id.buttonSheetContainer)
                       );
               bottomSheetDialog.show();
           }
       });
    }
}