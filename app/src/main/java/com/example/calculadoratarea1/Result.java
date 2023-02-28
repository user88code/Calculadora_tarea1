package com.example.calculadoratarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculadoratarea1.MainActivity;

public class Result extends AppCompatActivity {
    TextView Respuesta;
    String name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        Respuesta = findViewById(R.id.Respuesta);

        // aplicar intent get Extra
        //Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
         name = extras.getString("Respuesta");
        //name = "un texto";
         Toast.makeText(getApplicationContext(),name, Toast.LENGTH_SHORT).show();



        // respuesta
        Respuesta.setText(name);

    }
}