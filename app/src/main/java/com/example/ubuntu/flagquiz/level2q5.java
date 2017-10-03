package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level2q5 extends AppCompatActivity {

    AlphaAnimation twofiveclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2q5);
    }



    public void butt251(View v) {
        v.startAnimation(twofiveclick);
        Button but251 = (Button) findViewById(R.id.button251);
        but251.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu251 = new Intent();
        bu251.setClass(this, level2q6.class);
        startActivity(bu251);
        finish();
    }

    public void butt252(View v) {
        v.startAnimation(twofiveclick);
        Button but252 = (Button) findViewById(R.id.button252);
        but252.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu252 = new Intent();
        bu252.setClass(this, level2q6.class);
        startActivity(bu252);
        finish();
    }

    public void butt253(View v) {
        v.startAnimation(twofiveclick);
        Button but253 = (Button) findViewById(R.id.button253);
        but253.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu253 = new Intent();
        bu253.setClass(this, level2q6.class);
        startActivity(bu253);
        finish();
    }

    public void butt254(View v) {
        v.startAnimation(twofiveclick);
        Button but254 = (Button) findViewById(R.id.button254);
        but254.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu254 = new Intent();
        bu254.setClass(this, level2q6.class);
        startActivity(bu254);
        finish();
    }




}
