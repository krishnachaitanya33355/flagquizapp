package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;


public class level1q9 extends AppCompatActivity {

    AlphaAnimation nineoneclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1q9);
    }


    public void butt91(View v) {
        v.startAnimation(nineoneclick);
        Button but91 = (Button) findViewById(R.id.button91);
        but91.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu91 = new Intent();
        bu91.setClass(this, level1q10.class);
        startActivity(bu91);
        finish();
    }

    public void butt92(View v) {
        v.startAnimation(nineoneclick);
        Button but92 = (Button) findViewById(R.id.button92);
        but92.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu92 = new Intent();
        bu92.setClass(this, level1q10.class);
        startActivity(bu92);
        finish();

    }

    public void butt93(View v) {
        v.startAnimation(nineoneclick);
        Button but93 = (Button) findViewById(R.id.button93);
        but93.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu93 = new Intent();
        bu93.setClass(this, level1q10.class);
        startActivity(bu93);
        finish();
    }

    public void butt94(View v) {
        v.startAnimation(nineoneclick);
        Button but94 = (Button) findViewById(R.id.button94);
        but94.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu94 = new Intent();
        bu94.setClass(this, level1q10.class);
        startActivity(bu94);
        finish();
    }




}
