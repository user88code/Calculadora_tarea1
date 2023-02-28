package com.example.calculadoratarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculadoratarea1.MainActivity;

public class Result extends AppCompatActivity {
    TextView Respuesta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // aplicar intent get Extra
        Intent intent = getIntent();
        String name = intent.getStringExtra("Respuesta");

        // respuesta
        Respuesta.setText("");

    }
}