package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level5q7 extends AppCompatActivity {

    AlphaAnimation fivesevenclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5q7);
    }



    public void butt571(View v) {
        v.startAnimation(fivesevenclick);
        Button but571 = (Button) findViewById(R.id.button571);
        but571.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu571 = new Intent();
        bu571.setClass(this, level5q8.class);
        startActivity(bu571);
        finish();
    }

    public void butt572(View v) {
        v.startAnimation(fivesevenclick);
        Button but572 = (Button) findViewById(R.id.button572);
        but572.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu572 = new Intent();
        bu572.setClass(this, level5q8.class);
        startActivity(bu572);
        finish();
    }

    public void butt573(View v) {
        v.startAnimation(fivesevenclick);
        Button but573 = (Button) findViewById(R.id.button573);
        but573.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu573 = new Intent();
        bu573.setClass(this, level5q8.class);
        startActivity(bu573);
        finish();
    }

    public void butt574(View v) {
        v.startAnimation(fivesevenclick);
        Button but574 = (Button) findViewById(R.id.button574);
        but574.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu574 = new Intent();
        bu574.setClass(this, level5q8.class);
        startActivity(bu574);
        finish();
    }


}
