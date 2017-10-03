package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;




public class level3q5 extends AppCompatActivity {


    AlphaAnimation threefiveclick = new AlphaAnimation(1.0F,0.0F);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3q5);
    }

    public void butt351(View v) {
        v.startAnimation(threefiveclick);
        Button but351 = (Button) findViewById(R.id.button351);
        but351.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu351 = new Intent();
        bu351.setClass(this, level3q6.class);
        startActivity(bu351);
        finish();
    }

    public void butt352(View v) {
        v.startAnimation(threefiveclick);
        Button but352 = (Button) findViewById(R.id.button352);
        but352.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu352 = new Intent();
        bu352.setClass(this, level3q6.class);
        startActivity(bu352);
        finish();
    }

    public void butt353(View v) {
        v.startAnimation(threefiveclick);
        Button but353 = (Button) findViewById(R.id.button353);
        but353.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu353 = new Intent();
        bu353.setClass(this, level3q6.class);
        startActivity(bu353);
        finish();
    }

    public void butt354(View v) {
        v.startAnimation(threefiveclick);
        Button but354 = (Button) findViewById(R.id.button354);
        but354.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu354 = new Intent();
        bu354.setClass(this, level3q6.class);
        startActivity(bu354);
        finish();
    }




}
