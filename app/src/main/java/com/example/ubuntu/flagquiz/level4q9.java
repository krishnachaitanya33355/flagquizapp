package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level4q9 extends AppCompatActivity {

    AlphaAnimation fournineclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4q9);
    }

    public void butt491(View v) {
        v.startAnimation(fournineclick);
        Button but491 = (Button) findViewById(R.id.button491);
        but491.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu491 = new Intent();
        bu491.setClass(this, level4q10.class);
        startActivity(bu491);
        finish();
    }

    public void butt492(View v) {
        v.startAnimation(fournineclick);
        Button but492 = (Button) findViewById(R.id.button492);
        but492.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu492 = new Intent();
        bu492.setClass(this, level4q10.class);
        startActivity(bu492);
        finish();
    }

    public void butt493(View v) {
        v.startAnimation(fournineclick);
        Button but493 = (Button) findViewById(R.id.button493);
        but493.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu493 = new Intent();
        bu493.setClass(this, level4q10.class);
        startActivity(bu493);
        finish();
    }

    public void butt494(View v) {
        v.startAnimation(fournineclick);
        Button but494 = (Button) findViewById(R.id.button494);
        but494.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu494 = new Intent();
        bu494.setClass(this, level4q10.class);
        startActivity(bu494);
        finish();
    }



}
