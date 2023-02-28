package com.example.calculadoratarea1;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText numero_1;
    EditText numero_2;
     TextView respuesta;
     Button btn_sumar, btn_restar, btn_dividir, btn_multiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    numero_1 = findViewById(R.id.numero_1);
    numero_2 = findViewById(R.id.numero_2);

    }

    public void sumar(View view) {
        Integer respuestaNum = Integer.parseInt(numero_1.getText().toString()) + Integer.parseInt(numero_2.getText().toString());
        Intent intent = new Intent(getApplicationContext(), Result.class);
        String respuesta1 = String.valueOf(respuestaNum);
        intent.putExtra("RESPUESTA",respuesta1.toString() );
        startActivity(intent);
        Toast.makeText(this, respuesta1, Toast.LENGTH_SHORT).show();

    };

    public void resta(View view) {
        Integer respuestaNum = Integer.parseInt(numero_1.getText().toString()) - Integer.parseInt(numero_2.getText().toString());
        Intent intent = new Intent(getApplicationContext(), Result.class);
        intent.putExtra("RESPUESTA", String.valueOf(respuestaNum));
        startActivity(intent);
        Toast.makeText(this, String.valueOf(respuestaNum), Toast.LENGTH_SHORT).show();
    };

    public void multiplica(View view) {
        Integer respuestaNum = Integer.parseInt(numero_1.getText().toString()) * Integer.parseInt(numero_2.getText().toString());
        Intent intent = new Intent(getApplicationContext(), Result.class);
        intent.putExtra("RESPUESTA", String.valueOf(respuestaNum));
        startActivity(intent);
        Toast.makeText(this, String.valueOf(respuestaNum), Toast.LENGTH_SHORT).show();
    };

    public void divide(View view) {
        Integer respuestaNum = Integer.parseInt(numero_1.getText().toString()) / Integer.parseInt(numero_2.getText().toString());
        Intent intent = new Intent(getApplicationContext(), Result.class);
        intent.putExtra("RESPUESTA", String.valueOf(respuestaNum));
        startActivity(intent);
        Toast.makeText(this, String.valueOf(respuestaNum), Toast.LENGTH_SHORT).show();
    };


}
