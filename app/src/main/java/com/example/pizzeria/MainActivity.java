package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button boton1;
    private EditText user;
    private String nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1=(Button) findViewById(R.id.boton1);
        user=(EditText) findViewById(R.id.editusuario);


        boton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, pagina1.class);
                nombre=user.getText().toString();
                intent.putExtra("user",nombre);
                startActivity(intent);




            }
        });

        }
    }

