package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level4 extends AppCompatActivity {


    AlphaAnimation fouroneclick = new AlphaAnimation(1.0F,0.0F);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
    }

    public void butt411(View v) {
        v.startAnimation(fouroneclick);
        Button but411 = (Button) findViewById(R.id.button411);
        but411.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu411 = new Intent();
        bu411.setClass(this, level4q2.class);
        startActivity(bu411);
        finish();
    }

    public void butt412(View v) {
        v.startAnimation(fouroneclick);
        Button but412 = (Button) findViewById(R.id.button412);
        but412.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu412 = new Intent();
        bu412.setClass(this, level4q2.class);
        startActivity(bu412);
        finish();
    }

    public void butt413(View v) {
        v.startAnimation(fouroneclick);
        Button but413 = (Button) findViewById(R.id.button413);
        but413.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu413 = new Intent();
        bu413.setClass(this, level4q2.class);
        startActivity(bu413);
        finish();
    }

    public void butt414(View v) {
        v.startAnimation(fouroneclick);
        Button but414 = (Button) findViewById(R.id.button414);
        but414.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu414 = new Intent();
        bu414.setClass(this, level4q2.class);
        startActivity(bu414);
        finish();
    }





}

