package com.example.gaston.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button botonEjercicio1;
    private Button botonEjercicio2;
    private Button botonEjercicio3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonEjercicio1 = (Button) findViewById(R.id.button);
        botonEjercicio2 = (Button) findViewById(R.id.button2);
        botonEjercicio3 = (Button) findViewById(R.id.button3);
    }

    protected void navigateEjercicio1(View v){
        Intent intent1 = new Intent(this, MainActivityEjercicio1.class);
        startActivity(intent1);
    }

    protected void navigateEjercicio2(View v){
        Intent intent2 = new Intent(this, MainActivityEjercicio2.class);
        startActivity(intent2);
    }

    protected void navigateEjercicio3(View v){
        Intent intent3 = new Intent(this, MainActivityEjercicio3.class);
        startActivity(intent3);
    }
}
