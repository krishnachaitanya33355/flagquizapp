package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level5q4 extends AppCompatActivity {

    AlphaAnimation fivefourclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5q4);
    }


    public void butt541(View v) {
        v.startAnimation(fivefourclick);
        Button but541 = (Button) findViewById(R.id.button541);
        but541.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu541 = new Intent();
        bu541.setClass(this, level5q5.class);
        startActivity(bu541);
        finish();
    }

    public void butt542(View v) {
        v.startAnimation(fivefourclick);
        Button but542 = (Button) findViewById(R.id.button542);
        but542.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu542 = new Intent();
        bu542.setClass(this, level5q5.class);
        startActivity(bu542);
        finish();
    }

    public void butt543(View v) {
        v.startAnimation(fivefourclick);
        Button but543 = (Button) findViewById(R.id.button543);
        but543.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu543 = new Intent();
        bu543.setClass(this, level5q5.class);
        startActivity(bu543);
        finish();
    }

    public void butt544(View v) {
        v.startAnimation(fivefourclick);
        Button but544 = (Button) findViewById(R.id.button544);
        but544.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu544 = new Intent();
        bu544.setClass(this, level5q5.class);
        startActivity(bu544);
        finish();
    }



}

