package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level5q5 extends AppCompatActivity {

    AlphaAnimation fivefiveclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5q5);
    }


    public void butt551(View v) {
        v.startAnimation(fivefiveclick);
        Button but551 = (Button) findViewById(R.id.button551);
        but551.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu551 = new Intent();
        bu551.setClass(this, level5q6.class);
        startActivity(bu551);
        finish();
    }

    public void butt552(View v) {
        v.startAnimation(fivefiveclick);
        Button but552 = (Button) findViewById(R.id.button552);
        but552.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu552 = new Intent();
        bu552.setClass(this, level5q6.class);
        startActivity(bu552);
        finish();
    }

    public void butt553(View v) {
        v.startAnimation(fivefiveclick);
        Button but553 = (Button) findViewById(R.id.button553);
        but553.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu553 = new Intent();
        bu553.setClass(this, level5q6.class);
        startActivity(bu553);
        finish();
    }

    public void butt554(View v) {
        v.startAnimation(fivefiveclick);
        Button but554 = (Button) findViewById(R.id.button554);
        but554.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu554 = new Intent();
        bu554.setClass(this, level5q6.class);
        startActivity(bu554);
        finish();
    }




}

