package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level5q2 extends AppCompatActivity {

    AlphaAnimation fivetwoclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5q2);
    }


    public void butt521(View v) {
        v.startAnimation(fivetwoclick);
        Button but521 = (Button) findViewById(R.id.button521);
        but521.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu521 = new Intent();
        bu521.setClass(this, level5q3.class);
        startActivity(bu521);
        finish();
    }

    public void butt522(View v) {
        v.startAnimation(fivetwoclick);
        Button but522 = (Button) findViewById(R.id.button522);
        but522.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu522 = new Intent();
        bu522.setClass(this, level5q3.class);
        startActivity(bu522);
        finish();
    }

    public void butt523(View v) {
        v.startAnimation(fivetwoclick);
        Button but523 = (Button) findViewById(R.id.button523);
        but523.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu523 = new Intent();
        bu523.setClass(this, level5q3.class);
        startActivity(bu523);
        finish();
    }

    public void butt524(View v) {
        v.startAnimation(fivetwoclick);
        Button but524 = (Button) findViewById(R.id.button524);
        but524.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu524 = new Intent();
        bu524.setClass(this, level5q3.class);
        startActivity(bu524);
        finish();
    }


}
