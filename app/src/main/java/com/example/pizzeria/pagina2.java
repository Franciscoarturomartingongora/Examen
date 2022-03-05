package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class pagina2 extends AppCompatActivity {
   private Button boton2,boton3;
   private CheckBox pizza1hawa;
   private CheckBox pizza1sala;
   private CheckBox pizza1que;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);
        boton2=(Button)findViewById(R.id.boton2);
        boton3=(Button)findViewById(R.id.boton3);
        pizza1hawa=(CheckBox)findViewById(R.id.pizza1hawa);
        pizza1sala=(CheckBox)findViewById(R.id.pizz1sala);
        pizza1que=(CheckBox)findViewById(R.id.pizza1que);

        boton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pagina2.this, pagina4.class);
                i.putExtra("numero", "   total 150");
                startActivity(i);





            }
        });
       boton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
          public void onClick(View view) {
               startActivity(new Intent(pagina2.this, pagina3.class));



            }

       });
    }
}
