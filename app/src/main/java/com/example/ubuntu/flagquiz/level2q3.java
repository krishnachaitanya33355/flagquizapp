package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level2q3 extends AppCompatActivity {

    AlphaAnimation twothreeclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2q3);
    }



    public void butt231(View v) {
        v.startAnimation(twothreeclick);
        Button but231 = (Button) findViewById(R.id.button231);
        but231.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu231 = new Intent();
        bu231.setClass(this, level2q4.class);
        startActivity(bu231);
        finish();
    }

    public void butt232(View v) {
        v.startAnimation(twothreeclick);
        Button but232 = (Button) findViewById(R.id.button232);
        but232.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu232 = new Intent();
        bu232.setClass(this, level2q4.class);
        startActivity(bu232);
        finish();
    }

    public void butt233(View v) {
        v.startAnimation(twothreeclick);
        Button but233 = (Button) findViewById(R.id.button233);
        but233.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu233 = new Intent();
        bu233.setClass(this, level2q4.class);
        startActivity(bu233);
        finish();
    }

    public void butt234(View v) {
        v.startAnimation(twothreeclick);
        Button but234 = (Button) findViewById(R.id.button234);
        but234.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu234 = new Intent();
        bu234.setClass(this, level2q4.class);
        startActivity(bu234);
        finish();
    }




}
