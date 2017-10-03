package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level3q10 extends AppCompatActivity {

    AlphaAnimation threetenclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3q10);
    }


    public void butt3101(View v) {
        v.startAnimation(threetenclick);
        Button but3101 = (Button) findViewById(R.id.button3101);
        but3101.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu3101 = new Intent();
        bu3101.setClass(this, Main2Activity.class);
        startActivity(bu3101);
        finish();
    }

    public void butt3102(View v) {
        v.startAnimation(threetenclick);
        Button but3102 = (Button) findViewById(R.id.button3102);
        but3102.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu3102 = new Intent();
        bu3102.setClass(this, Main2Activity.class);
        startActivity(bu3102);
        finish();
    }

    public void butt3103(View v) {
        v.startAnimation(threetenclick);
        Button but3103 = (Button) findViewById(R.id.button3103);
        but3103.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu3103 = new Intent();
        bu3103.setClass(this, Main2Activity.class);
        startActivity(bu3103);
        finish();
    }

    public void butt3104(View v) {
        v.startAnimation(threetenclick);
        Button but3104 = (Button) findViewById(R.id.button3104);
        but3104.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu3104 = new Intent();
        bu3104.setClass(this, Main2Activity.class);
        startActivity(bu3104);
        finish();
    }



}
