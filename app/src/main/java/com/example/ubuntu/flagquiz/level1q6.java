package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level1q6 extends AppCompatActivity {


    AlphaAnimation sixoneclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1q6);
    }



    public void butt61(View v) {
        v.startAnimation(sixoneclick);
        Button but61 = (Button) findViewById(R.id.button61);
        but61.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu61 = new Intent();
        bu61.setClass(this, level1q7.class);
        startActivity(bu61);
        finish();
    }

    public void butt62(View v) {
        v.startAnimation(sixoneclick);
        Button but62 = (Button) findViewById(R.id.button62);
        but62.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu62 = new Intent();
        bu62.setClass(this, level1q7.class);
        startActivity(bu62);
        finish();
    }

    public void butt63(View v) {
        v.startAnimation(sixoneclick);
        Button but63 = (Button) findViewById(R.id.button63);
        but63.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu63 = new Intent();
        bu63.setClass(this, level1q7.class);
        startActivity(bu63);
        finish();

    }

    public void butt64(View v) {
        v.startAnimation(sixoneclick);
        Button but64 = (Button) findViewById(R.id.button64);
        but64.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu64 = new Intent();
        bu64.setClass(this, level1q7.class);
        startActivity(bu64);
        finish();
    }




}
