package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level1q3 extends AppCompatActivity {
    private AlphaAnimation threeoneclick = new AlphaAnimation(1F, 0.0F);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1q3);

    }




    public void butt31(View v) {
        v.startAnimation(threeoneclick);
        Button but31 = (Button) findViewById(R.id.button31);
        but31.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu31 = new Intent();
        bu31.setClass(this, level1q4.class);
        startActivity(bu31);
        finish();
    }

    public void butt32(View v) {
        v.startAnimation(threeoneclick);
        Button but32 = (Button) findViewById(R.id.button32);
        but32.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu32 = new Intent();
        bu32.setClass(this, level1q4.class);
        startActivity(bu32);
        finish();



    }

    public void butt33(View v) {
        v.startAnimation(threeoneclick);
        Button but33 = (Button) findViewById(R.id.button33);
        but33.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu33 = new Intent();
        bu33.setClass(this, level1q4.class);
        startActivity(bu33);
        finish();
    }

    public void butt34(View v) {
        v.startAnimation(threeoneclick);
        Button but34 = (Button) findViewById(R.id.button34);
        but34.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu34 = new Intent();
        bu34.setClass(this, level1q4.class);
        startActivity(bu34);
        finish();
    }







}
