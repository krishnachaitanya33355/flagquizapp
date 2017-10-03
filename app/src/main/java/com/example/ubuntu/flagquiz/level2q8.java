package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level2q8 extends AppCompatActivity {


    AlphaAnimation twoeightclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2q8);
    }





    public void butt281(View v) {
        v.startAnimation(twoeightclick);
        Button but281 = (Button) findViewById(R.id.button281);
        but281.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu281 = new Intent();
        bu281.setClass(this, level2q9.class);
        startActivity(bu281);
        finish();
    }

    public void butt282(View v) {
        v.startAnimation(twoeightclick);
        Button but282 = (Button) findViewById(R.id.button282);
        but282.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu282 = new Intent();
        bu282.setClass(this, level2q9.class);
        startActivity(bu282);
        finish();
    }

    public void butt283(View v) {
        v.startAnimation(twoeightclick);
        Button but283 = (Button) findViewById(R.id.button283);
        but283.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu283 = new Intent();
        bu283.setClass(this, level2q9.class);
        startActivity(bu283);
        finish();
    }

    public void butt284(View v) {
        v.startAnimation(twoeightclick);
        Button but284 = (Button) findViewById(R.id.button284);
        but284.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu284 = new Intent();
        bu284.setClass(this, level2q9.class);
        startActivity(bu284);
        finish();
    }



}
