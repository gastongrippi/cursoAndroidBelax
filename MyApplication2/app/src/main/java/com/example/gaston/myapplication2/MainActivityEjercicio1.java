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

public class MainActivityEjercicio1 extends Activity {

    private EditText numeroMes;
    private Button goBoton;
    private TextView nombreMes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        numeroMes = (EditText) findViewById(R.id.editText2);
        goBoton = (Button) findViewById(R.id.button4);
        nombreMes = (TextView) findViewById(R.id.textView);
    }

    protected void obtenerMes(View v) {
        try {
            int numero = Integer.parseInt(numeroMes.getText().toString());
            switch (numero) {
                case 1:
                    nombreMes.setText("Enero");
                    break;
                case 2:
                    nombreMes.setText("Febrero");
                    break;
                case 3:
                    nombreMes.setText("Marzo");
                    break;
                case 4:
                    nombreMes.setText("Abril");
                    break;
                case 5:
                    nombreMes.setText("Mayo");
                    break;
                case 6:
                    nombreMes.setText("Junio");
                    break;
                case 7:
                    nombreMes.setText("Julio");
                    break;
                case 8:
                    nombreMes.setText("Agosto");
                    break;
                case 9:
                    nombreMes.setText("Septiembre");
                    break;
                case 10:
                    nombreMes.setText("Octubre");
                    break;
                case 11:
                    nombreMes.setText("Noviembre");
                    break;
                case 12:
                    nombreMes.setText("Diciembre");
                    break;
                default:
                    nombreMes.setText("No existe mes para el numero ingresado");
                    break;
            }
        }
        catch (Exception e){
            nombreMes.setText("Ingrese un numero por favor");
        }
    }
}


