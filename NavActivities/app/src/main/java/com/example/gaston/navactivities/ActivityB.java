package com.example.gaston.navactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    private Button buttonC;
    private Button buttonD;
    private Button buttonE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button buttonC = (Button) findViewById(R.id.button);
        Button buttonD = (Button) findViewById(R.id.button2);
        Button buttonE = (Button) findViewById(R.id.button3);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    protected void navActivityC (View v){
        Intent IntentC = new Intent(this, ActivityC.class);
        startActivity(IntentC);
    }

    protected void navActivityD (View v){
        Intent IntentD = new Intent(this, ActivityD.class);
        startActivity(IntentD);
    }

    protected void navActivityE (View v){
        Intent IntentC = new Intent(this, ActivityE.class);
        startActivity(IntentC);
    }

}
