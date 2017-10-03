package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level2q9 extends AppCompatActivity {

    AlphaAnimation twonineclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2q9);
    }



    public void butt291(View v) {
        v.startAnimation(twonineclick);
        Button but291 = (Button) findViewById(R.id.button291);
        but291.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu291 = new Intent();
        bu291.setClass(this, level2q10.class);
        startActivity(bu291);
        finish();
    }

    public void butt292(View v) {
        v.startAnimation(twonineclick);
        Button but292 = (Button) findViewById(R.id.button292);
        but292.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu292 = new Intent();
        bu292.setClass(this, level2q10.class);
        startActivity(bu292);
        finish();
    }

    public void butt293(View v) {
        v.startAnimation(twonineclick);
        Button but293 = (Button) findViewById(R.id.button293);
        but293.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu293 = new Intent();
        bu293.setClass(this, level2q10.class);
        startActivity(bu293);
        finish();
    }

    public void butt294(View v) {
        v.startAnimation(twonineclick);
        Button but294 = (Button) findViewById(R.id.button294);
        but294.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu294 = new Intent();
        bu294.setClass(this, level2q10.class);
        startActivity(bu294);
        finish();
    }





}
