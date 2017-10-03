package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level1q8 extends AppCompatActivity {

    AlphaAnimation eightoneclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1q8);
    }

    public void butt81(View v) {
        v.startAnimation(eightoneclick);
        Button but81 = (Button) findViewById(R.id.button81);
        but81.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu81 = new Intent();
        bu81.setClass(this, level1q9.class);
        startActivity(bu81);
        finish();




    }


    public void butt82(View v) {
        v.startAnimation(eightoneclick);
        Button but82 = (Button) findViewById(R.id.button82);
        but82.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu82 = new Intent();
        bu82.setClass(this, level1q9.class);
        startActivity(bu82);
        finish();
    }

    public void butt83(View v) {
        v.startAnimation(eightoneclick);
        Button but83 = (Button) findViewById(R.id.button83);
        but83.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu83 = new Intent();
        bu83.setClass(this, level1q9.class);
        startActivity(bu83);
        finish();
    }

    public void butt84(View v) {
        v.startAnimation(eightoneclick);
        Button but84 = (Button) findViewById(R.id.button84);
        but84.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu84 = new Intent();
        bu84.setClass(this, level1q9.class);
        startActivity(bu84);
        finish();
    }



}
