package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level5q3 extends AppCompatActivity {

    AlphaAnimation fivethreeclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5q3);
    }


    public void butt531(View v) {
        v.startAnimation(fivethreeclick);
        Button but531 = (Button) findViewById(R.id.button531);
        but531.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu531 = new Intent();
        bu531.setClass(this, level5q4.class);
        startActivity(bu531);
        finish();
    }

    public void butt532(View v) {
        v.startAnimation(fivethreeclick);
        Button but532 = (Button) findViewById(R.id.button532);
        but532.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu532 = new Intent();
        bu532.setClass(this, level5q4.class);
        startActivity(bu532);
        finish();
    }

    public void butt533(View v) {
        v.startAnimation(fivethreeclick);
        Button but533 = (Button) findViewById(R.id.button533);
        but533.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu533 = new Intent();
        bu533.setClass(this, level5q4.class);
        startActivity(bu533);
        finish();
    }

    public void butt534(View v) {
        v.startAnimation(fivethreeclick);
        Button but534 = (Button) findViewById(R.id.button534);
        but534.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu534 = new Intent();
        bu534.setClass(this, level5q4.class);
        startActivity(bu534);
        finish();
    }



}
