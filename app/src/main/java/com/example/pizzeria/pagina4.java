package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class pagina4 extends AppCompatActivity {
     private TextView pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina4);
     pedido=(TextView) findViewById(R.id.pedido);

     String numero = getIntent().getStringExtra("numero");
     pedido.setText("Este es tu pedido de pizaa " + numero);

    }
}