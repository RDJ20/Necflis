package com.example.necflis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    int contador=0;
    Button iv1 = (Button)findViewById(R.id.button2);
    Button iv2 = (Button)findViewById(R.id.button3);
    Button iv3 = (Button)findViewById(R.id.button4);
    Button iv4 = (Button)findViewById(R.id.button5);
    Button iv5 = (Button)findViewById(R.id.button6);
    TextView it1= (TextView)findViewById(R.id.textView2);
    TextView it2= (TextView)findViewById(R.id.textView3);
    TextView it3= (TextView)findViewById(R.id.textView4);
    TextView it4= (TextView)findViewById(R.id.textView5);
    TextView it5= (TextView)findViewById(R.id.textView6);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        if(contador==1)
        {
            iv1.setVisibility(View.VISIBLE);
            it1.setVisibility(View.VISIBLE);
        }
        else{
            if(contador==2)
            {
                iv2.setVisibility(View.VISIBLE);
                it2.setVisibility(View.VISIBLE);
            }
            else{
                if(contador==3)
                {
                    iv3.setVisibility(View.VISIBLE);
                    it3.setVisibility(View.VISIBLE);;
                }
                else{
                    if(contador==4)
                    {
                        iv4.setVisibility(View.VISIBLE);
                        it4.setVisibility(View.VISIBLE);
                    }
                    else{
                        if(contador==5)
                        {
                            iv5.setVisibility(View.VISIBLE);
                            it5.setVisibility(View.VISIBLE);
                        }
                        else {

                        }

                    }

                }
                }

            }
            }




    public void Siguiente(View view){
        Intent siguiente = new Intent(this, emailcontrasena.class);
        startActivity(siguiente);
        contador++;
    }
}