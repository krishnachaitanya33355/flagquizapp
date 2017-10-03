package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level2q4 extends AppCompatActivity {

    AlphaAnimation twofourclick =new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2q4);
    }



    public void butt241(View v) {
        v.startAnimation(twofourclick);
        Button but241 = (Button) findViewById(R.id.button241);
        but241.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu241 = new Intent();
        bu241.setClass(this, level2q5.class);
        startActivity(bu241);
        finish();
    }

    public void butt242(View v) {
        v.startAnimation(twofourclick);
        Button but242 = (Button) findViewById(R.id.button242);
        but242.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu242 = new Intent();
        bu242.setClass(this, level2q5.class);
        startActivity(bu242);
        finish();
    }

    public void butt243(View v) {
        v.startAnimation(twofourclick);
        Button but243 = (Button) findViewById(R.id.button243);
        but243.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu243 = new Intent();
        bu243.setClass(this, level2q5.class);
        startActivity(bu243);
        finish();
    }

    public void butt244(View v) {
        v.startAnimation(twofourclick);
        Button but244 = (Button) findViewById(R.id.button244);
        but244.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu244 = new Intent();
        bu244.setClass(this, level2q5.class);
        startActivity(bu244);
        finish();
    }





}
