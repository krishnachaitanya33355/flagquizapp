package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level2q6 extends AppCompatActivity {

    AlphaAnimation twosixclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2q6);
    }



    public void butt261(View v) {
        v.startAnimation(twosixclick);
        Button but261 = (Button) findViewById(R.id.button261);
        but261.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu261 = new Intent();
        bu261.setClass(this, level2q7.class);
        startActivity(bu261);
        finish();
    }

    public void butt262(View v) {
        v.startAnimation(twosixclick);
        Button but262 = (Button) findViewById(R.id.button262);
        but262.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu262 = new Intent();
        bu262.setClass(this, level2q7.class);
        startActivity(bu262);
        finish();
    }

    public void butt263(View v) {
        v.startAnimation(twosixclick);
        Button but263 = (Button) findViewById(R.id.button263);
        but263.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu263 = new Intent();
        bu263.setClass(this, level2q7.class);
        startActivity(bu263);
        finish();
    }

    public void butt264(View v) {
        v.startAnimation(twosixclick);
        Button but264 = (Button) findViewById(R.id.button264);
        but264.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu264 = new Intent();
        bu264.setClass(this, level2q7.class);
        startActivity(bu264);
        finish();
    }

}
