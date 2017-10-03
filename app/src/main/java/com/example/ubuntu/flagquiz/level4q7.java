package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level4q7 extends AppCompatActivity {

    AlphaAnimation foursevenclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4q7);
    }

    public void butt471(View v) {
        v.startAnimation(foursevenclick);
        Button but471 = (Button) findViewById(R.id.button471);
        but471.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu471 = new Intent();
        bu471.setClass(this, level4q8.class);
        startActivity(bu471);
        finish();
    }

    public void butt472(View v) {
        v.startAnimation(foursevenclick);
        Button but472 = (Button) findViewById(R.id.button472);
        but472.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu472 = new Intent();
        bu472.setClass(this, level4q8.class);
        startActivity(bu472);
        finish();
    }

    public void butt473(View v) {
        v.startAnimation(foursevenclick);
        Button but473 = (Button) findViewById(R.id.button473);
        but473.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu473 = new Intent();
        bu473.setClass(this, level4q8.class);
        startActivity(bu473);
        finish();
    }

    public void butt474(View v) {
        v.startAnimation(foursevenclick);
        Button but474 = (Button) findViewById(R.id.button474);
        but474.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu474 = new Intent();
        bu474.setClass(this, level4q8.class);
        startActivity(bu474);
        finish();
    }



}


