package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level4q3 extends AppCompatActivity {

    AlphaAnimation fourthreeclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4q3);
    }


    public void butt431(View v) {
        v.startAnimation(fourthreeclick);
        Button but431 = (Button) findViewById(R.id.button431);
        but431.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu431 = new Intent();
        bu431.setClass(this, level4q4.class);
        startActivity(bu431);
        finish();
    }

    public void butt432(View v) {
        v.startAnimation(fourthreeclick);
        Button but432 = (Button) findViewById(R.id.button432);
        but432.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu432 = new Intent();
        bu432.setClass(this, level4q4.class);
        startActivity(bu432);
        finish();
    }

    public void butt433(View v) {
        v.startAnimation(fourthreeclick);
        Button but433 = (Button) findViewById(R.id.button433);
        but433.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu433 = new Intent();
        bu433.setClass(this, level4q4.class);
        startActivity(bu433);
        finish();
    }

    public void butt434(View v) {
        v.startAnimation(fourthreeclick);
        Button but434 = (Button) findViewById(R.id.button434);
        but434.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu434 = new Intent();
        bu434.setClass(this, level4q4.class);
        startActivity(bu434);
        finish();
    }



}
