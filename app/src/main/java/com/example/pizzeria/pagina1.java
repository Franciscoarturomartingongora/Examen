package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pagina1 extends AppCompatActivity {
    private TextView bienvenido;
    private ImageView logo2,logo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina1);

        bienvenido=(TextView)findViewById(R.id.bienvenido);
        logo2=(ImageView)findViewById(R.id.logo2);
        logo3=(ImageView)findViewById(R.id.logo3);

        String username = getIntent().getStringExtra("user");
        String message = "Hola amigo " + username + " Ordene su pedido";
        bienvenido.setText(message);

        logo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pagina1.this, pagina2.class));

            }
        });

                logo3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(pagina1.this, pagina3.class));

            }

        });
    }
}








