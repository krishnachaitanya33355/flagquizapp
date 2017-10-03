package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level4q4 extends AppCompatActivity {

    AlphaAnimation fourfourclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4q4);
    }


    public void butt441(View v) {
        v.startAnimation(fourfourclick);
        Button but441 = (Button) findViewById(R.id.button441);
        but441.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu441 = new Intent();
        bu441.setClass(this, level4q5.class);
        startActivity(bu441);
        finish();
    }

    public void butt442(View v) {
        v.startAnimation(fourfourclick);
        Button but442 = (Button) findViewById(R.id.button442);
        but442.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu442 = new Intent();
        bu442.setClass(this, level4q5.class);
        startActivity(bu442);
        finish();
    }

    public void butt443(View v) {
        v.startAnimation(fourfourclick);
        Button but443 = (Button) findViewById(R.id.button443);
        but443.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu443 = new Intent();
        bu443.setClass(this, level4q5.class);
        startActivity(bu443);
        finish();
    }

    public void butt444(View v) {
        v.startAnimation(fourfourclick);
        Button but444 = (Button) findViewById(R.id.button444);
        but444.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu444 = new Intent();
        bu444.setClass(this, level4q5.class);
        startActivity(bu444);
        finish();
    }





}

