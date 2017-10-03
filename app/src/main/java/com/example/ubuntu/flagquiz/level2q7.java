package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level2q7 extends AppCompatActivity {

    AlphaAnimation twosevenclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2q7);
    }




    public void butt271(View v) {
        v.startAnimation(twosevenclick);
        Button but271 = (Button) findViewById(R.id.button271);
        but271.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu271 = new Intent();
        bu271.setClass(this, level2q8.class);
        startActivity(bu271);
        finish();
    }

    public void butt272(View v) {
        v.startAnimation(twosevenclick);
        Button but272 = (Button) findViewById(R.id.button272);
        but272.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu272 = new Intent();
        bu272.setClass(this, level2q8.class);
        startActivity(bu272);
        finish();
    }

    public void butt273(View v) {
        v.startAnimation(twosevenclick);
        Button but273 = (Button) findViewById(R.id.button273);
        but273.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu273 = new Intent();
        bu273.setClass(this, level2q8.class);
        startActivity(bu273);
        finish();
    }

    public void butt274(View v) {
        v.startAnimation(twosevenclick);
        Button but274 = (Button) findViewById(R.id.button274);
        but274.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu274 = new Intent();
        bu274.setClass(this, level2q8.class);
        startActivity(bu274);
        finish();
    }




}
