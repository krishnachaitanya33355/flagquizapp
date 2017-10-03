package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level3 extends AppCompatActivity {

    AlphaAnimation threeoneclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
    }

    public void butt311(View v) {
        v.startAnimation(threeoneclick);
        Button but311 = (Button) findViewById(R.id.button311);
        but311.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu311 = new Intent();
        bu311.setClass(this, level3q2.class);
        startActivity(bu311);
        finish();
    }

    public void butt312(View v) {
        v.startAnimation(threeoneclick);
        Button but312 = (Button) findViewById(R.id.button312);
        but312.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu312 = new Intent();
        bu312.setClass(this, level3q2.class);
        startActivity(bu312);
        finish();
    }

    public void butt313(View v) {
        v.startAnimation(threeoneclick);
        Button but313 = (Button) findViewById(R.id.button313);
        but313.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu313 = new Intent();
        bu313.setClass(this, level3q2.class);
        startActivity(bu313);
        finish();
    }

    public void butt314(View v) {
        v.startAnimation(threeoneclick);
        Button but314 = (Button) findViewById(R.id.button314);
        but314.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu314 = new Intent();
        bu314.setClass(this, level3q2.class);
        startActivity(bu314);
        finish();
    }




}
