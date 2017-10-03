package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level5 extends AppCompatActivity {

    AlphaAnimation fiveoneclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
    }

    public void butt511(View v) {
        v.startAnimation(fiveoneclick);
        Button but511 = (Button) findViewById(R.id.button511);
        but511.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu511 = new Intent();
        bu511.setClass(this, level5q2.class);
        startActivity(bu511);
        finish();
    }

    public void butt512(View v) {
        v.startAnimation(fiveoneclick);
        Button but512 = (Button) findViewById(R.id.button512);
        but512.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu512 = new Intent();
        bu512.setClass(this, level5q2.class);
        startActivity(bu512);
        finish();
    }

    public void butt513(View v) {
        v.startAnimation(fiveoneclick);
        Button but513 = (Button) findViewById(R.id.button513);
        but513.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu513 = new Intent();
        bu513.setClass(this, level5q2.class);
        startActivity(bu513);
        finish();
    }

    public void butt514(View v) {
        v.startAnimation(fiveoneclick);
        Button but514 = (Button) findViewById(R.id.button514);
        but514.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu514 = new Intent();
        bu514.setClass(this, level5q2.class);
        startActivity(bu514);
        finish();
    }


}
