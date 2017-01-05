package com.example.gaston.myapplication2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Gastón on 04/01/2017.
 */

public class MainActivityEjercicio2 extends Activity {
    private EditText cantidadLineas;
    private Button goBoton;
    private TextView lineas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        cantidadLineas = (EditText) findViewById(R.id.editText);
        goBoton = (Button) findViewById(R.id.button5);
        lineas = (TextView) findViewById(R.id.textView2);
    }

    protected void escribirCantidadLineas (View v){
        lineas.setText("");
        try {
            int cantLineas = Integer.parseInt(cantidadLineas.getText().toString());
            for(int i = 1; i<=cantLineas ; i++) {
                lineas.setText(lineas.getText().toString() + "\n Linea " + i) ;
            }
        }
        catch (Exception e) {
            lineas.setText("Ingrese un numero");
        }
    }
}
