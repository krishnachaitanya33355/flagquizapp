package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level5q9 extends AppCompatActivity {

    AlphaAnimation fivenineclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5q9);
    }


    public void butt591(View v) {
        v.startAnimation(fivenineclick);
        Button but591 = (Button) findViewById(R.id.button591);
        but591.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu591 = new Intent();
        bu591.setClass(this, level5q10.class);
        startActivity(bu591);
        finish();
    }

    public void butt592(View v) {
        v.startAnimation(fivenineclick);
        Button but592 = (Button) findViewById(R.id.button592);
        but592.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu592 = new Intent();
        bu592.setClass(this, level5q10.class);
        startActivity(bu592);
        finish();
    }

    public void butt593(View v) {
        v.startAnimation(fivenineclick);
        Button but593 = (Button) findViewById(R.id.button593);
        but593.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu593 = new Intent();
        bu593.setClass(this, level5q10.class);
        startActivity(bu593);
        finish();
    }

    public void butt594(View v) {
        v.startAnimation(fivenineclick);
        Button but594 = (Button) findViewById(R.id.button594);
        but594.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu594 = new Intent();
        bu594.setClass(this, level5q10.class);
        startActivity(bu594);
        finish();
    }




}
