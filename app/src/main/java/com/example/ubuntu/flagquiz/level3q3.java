package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level3q3 extends AppCompatActivity {

    AlphaAnimation threethreeclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3q3);
    }


    public void butt331(View v) {
        v.startAnimation(threethreeclick);
        Button but331 = (Button) findViewById(R.id.button331);
        but331.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu331 = new Intent();
        bu331.setClass(this, level3q4.class);
        startActivity(bu331);
        finish();
    }

    public void butt332(View v) {
        v.startAnimation(threethreeclick);
        Button but332 = (Button) findViewById(R.id.button332);
        but332.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu332 = new Intent();
        bu332.setClass(this, level3q4.class);
        startActivity(bu332);
        finish();
    }

    public void butt333(View v) {
        v.startAnimation(threethreeclick);
        Button but333 = (Button) findViewById(R.id.button333);
        but333.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu333 = new Intent();
        bu333.setClass(this, level3q4.class);
        startActivity(bu333);
        finish();
    }

    public void butt334(View v) {
        v.startAnimation(threethreeclick);
        Button but334 = (Button) findViewById(R.id.button334);
        but334.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu334 = new Intent();
        bu334.setClass(this, level3q4.class);
        startActivity(bu334);
        finish();
    }




}
