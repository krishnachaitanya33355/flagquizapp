package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level2 extends AppCompatActivity {

    AlphaAnimation twooneoneclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
    }



    public void butt211(View v) {
        v.startAnimation(twooneoneclick);
        Button but211 = (Button) findViewById(R.id.button211);
        but211.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu211 = new Intent();
        bu211.setClass(this, level2q2.class);
        startActivity(bu211);
        finish();
    }

    public void butt212(View v) {
        v.startAnimation(twooneoneclick);
        Button but212 = (Button) findViewById(R.id.button212);
        but212.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu212 = new Intent();
        bu212.setClass(this, level2q2.class);
        startActivity(bu212);
        finish();
    }

    public void butt213(View v) {
        v.startAnimation(twooneoneclick);
        Button but213 = (Button) findViewById(R.id.button213);
        but213.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu213 = new Intent();
        bu213.setClass(this, level2q2.class);
        startActivity(bu213);
        finish();
    }

    public void butt214(View v) {
        v.startAnimation(twooneoneclick);
        Button but214 = (Button) findViewById(R.id.button214);
        but214.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu214 = new Intent();
        bu214.setClass(this, level2q2.class);
        startActivity(bu214);
        finish();
    }


}
