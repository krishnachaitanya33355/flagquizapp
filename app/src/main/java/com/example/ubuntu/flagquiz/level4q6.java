package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level4q6 extends AppCompatActivity {


    AlphaAnimation foursixclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4q6);
    }



    public void butt461(View v) {
        v.startAnimation(foursixclick);
        Button but461 = (Button) findViewById(R.id.button461);
        but461.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu461 = new Intent();
        bu461.setClass(this, level4q7.class);
        startActivity(bu461);
        finish();
    }

    public void butt462(View v) {
        v.startAnimation(foursixclick);
        Button but462 = (Button) findViewById(R.id.button462);
        but462.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu462 = new Intent();
        bu462.setClass(this, level4q7.class);
        startActivity(bu462);
        finish();
    }

    public void butt463(View v) {
        v.startAnimation(foursixclick);
        Button but463 = (Button) findViewById(R.id.button463);
        but463.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu463 = new Intent();
        bu463.setClass(this, level4q7.class);
        startActivity(bu463);
        finish();
    }

    public void butt464(View v) {
        v.startAnimation(foursixclick);
        Button but464 = (Button) findViewById(R.id.button464);
        but464.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu464 = new Intent();
        bu464.setClass(this, level4q7.class);
        startActivity(bu464);
        finish();
    }



}
