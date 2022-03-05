package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class pagina3 extends AppCompatActivity {
    private Button boton4;
    private CheckBox pepsi1;
    private CheckBox fanta1;
    private CheckBox coca1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina3);

        boton4=(Button)findViewById(R.id.boton4);
        pepsi1=(CheckBox)findViewById(R.id.pepsi1);
        fanta1=(CheckBox)findViewById(R.id.fanta1);
        coca1=(CheckBox)findViewById(R.id.coca1);


        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (pepsi1.isChecked()== true)  {

                    Intent i = new Intent(pagina3.this, pagina4.class);
                    i.putExtra("numero", "   total 20");
                    startActivity(i);


                }
                if (fanta1.isChecked()== true)  {

                    Intent i = new Intent(pagina3.this, pagina4.class);
                    i.putExtra("numero", "   total 15");
                    startActivity(i);
            }
                if (pepsi1.isChecked()== true)  {

                    Intent i = new Intent(pagina3.this, pagina4.class);
                    i.putExtra("numero", "   total 25");
                    startActivity(i);

                }

            }
        });
    }

}