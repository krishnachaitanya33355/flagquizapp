package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level5q8 extends AppCompatActivity {

    AlphaAnimation fiveeightclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5q8);
    }



    public void butt581(View v) {
        v.startAnimation(fiveeightclick);
        Button but581 = (Button) findViewById(R.id.button581);
        but581.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu581 = new Intent();
        bu581.setClass(this, level5q9.class);
        startActivity(bu581);
        finish();
    }

    public void butt582(View v) {
        v.startAnimation(fiveeightclick);
        Button but582 = (Button) findViewById(R.id.button582);
        but582.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu582 = new Intent();
        bu582.setClass(this, level5q9.class);
        startActivity(bu582);
        finish();
    }

    public void butt583(View v) {
        v.startAnimation(fiveeightclick);
        Button but583 = (Button) findViewById(R.id.button583);
        but583.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu583 = new Intent();
        bu583.setClass(this, level5q9.class);
        startActivity(bu583);
        finish();
    }

    public void butt584(View v) {
        v.startAnimation(fiveeightclick);
        Button but584 = (Button) findViewById(R.id.button584);
        but584.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu584 = new Intent();
        bu584.setClass(this, level5q9.class);
        startActivity(bu584);
        finish();
    }

}
