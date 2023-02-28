package com.example.calculadoratarea1;

import static com.example.calculadoratarea1.R.id.Respuesta;
import static com.example.calculadoratarea1.R.id.btn_restar;
import static com.example.calculadoratarea1.R.id.btn_sumar;

import androidx.appcompat.app.AppCompatActivity;
import com.example.calculadoratarea1.Result;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

     EditText num_uno, num_dos;
     TextView respuesta;
     Button btn_sumar, btn_restar, btn_dividir, btn_multiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_uno = (EditText) findViewById(R.id.num_uno);
        num_dos = (EditText) findViewById(R.id.num_dos);

        //respuesta = (TextView) findViewById(Respuesta);

        btn_sumar = (Button) findViewById(R.id.btn_sumar);
        btn_restar = (Button) findViewById(R.id.btn_restar);
        btn_dividir = (Button) findViewById(R.id.btn_dividir);
        btn_multiplicar = (Button) findViewById(R.id.btn_multiplicar);

        private void suma(View view) {
            Integer respuestaNum = Integer.parseInt(num_uno.getText().toString()) + Integer.parseInt(num_dos.getText().toString());
            Intent intent = new Intent(this, Result.class);
            intent.putExtra("RESPUESTA", String.valueOf(respuestaNum));
            startActivity(intent);

        };

        public void resta(View v) {
            Integer respuestaNum = Integer.parseInt(num_uno.getText().toString()) + Integer.parseInt(num_dos.getText().toString());
            Intent intent = new Intent(this, Result.class);
            intent.putExtra("RESPUESTA", String.valueOf(respuestaNum));
            startActivity(intent);
        };

        public void multiplica(View v) {
            Integer respuestaNum = Integer.parseInt(num_uno.getText().toString()) + Integer.parseInt(num_dos.getText().toString());
            Intent intent = new Intent(this, Result.class);
            intent.putExtra("RESPUESTA", String.valueOf(respuestaNum));
            startActivity(intent);
        };

        public void divide(View v) {
            Integer respuestaNum = Integer.parseInt(num_uno.getText().toString()) + Integer.parseInt(num_dos.getText().toString());
            Intent intent = new Intent(this, Result.class);
            intent.putExtra("RESPUESTA", String.valueOf(respuestaNum));
            startActivity(intent);
        };



    }
}
