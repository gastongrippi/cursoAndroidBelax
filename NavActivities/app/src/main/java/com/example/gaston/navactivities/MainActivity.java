package com.example.gaston.navactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
    private ImageButton imageButton6;
    private ImageButton imageButton7;
    private ImageButton imageButton8;
    private ImageButton imageButton9;
    private ImageButton imageButton10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
    }

    protected void navigateActivityB (View v){
        Intent intent1 = new Intent(this, ActivityB.class);
        startActivity(intent1);
    }


}
