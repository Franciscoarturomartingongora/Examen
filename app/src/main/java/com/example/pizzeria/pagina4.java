package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class pagina4 extends AppCompatActivity {
     private TextView pedido;
     private Button boton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina4);
     pedido=(TextView) findViewById(R.id.pedido);
     boton5=(Button)findViewById(R.id.boton5);
     String numero = getIntent().getStringExtra("numero");
     pedido.setText("Este es tu pedido de pizaa " + numero);

        boton5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pagina4.this, pagina5.class));



            }


        });

    }

}
