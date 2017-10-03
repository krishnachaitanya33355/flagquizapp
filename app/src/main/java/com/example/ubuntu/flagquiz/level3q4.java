package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level3q4 extends AppCompatActivity {

    AlphaAnimation threefourclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3q4);
    }

    public void butt341(View v) {
        v.startAnimation(threefourclick);
        Button but341 = (Button) findViewById(R.id.button341);
        but341.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu341 = new Intent();
        bu341.setClass(this, level3q5.class);
        startActivity(bu341);
        finish();
    }

    public void butt342(View v) {
        v.startAnimation(threefourclick);
        Button but342 = (Button) findViewById(R.id.button342);
        but342.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu342 = new Intent();
        bu342.setClass(this, level3q5.class);
        startActivity(bu342);
        finish();
    }

    public void butt343(View v) {
        v.startAnimation(threefourclick);
        Button but343 = (Button) findViewById(R.id.button343);
        but343.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu343 = new Intent();
        bu343.setClass(this, level3q5.class);
        startActivity(bu343);
        finish();
    }

    public void butt344(View v) {
        v.startAnimation(threefourclick);
        Button but344 = (Button) findViewById(R.id.button344);
        but344.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu344 = new Intent();
        bu344.setClass(this, level3q5.class);
        startActivity(bu344);
        finish();
    }






}
