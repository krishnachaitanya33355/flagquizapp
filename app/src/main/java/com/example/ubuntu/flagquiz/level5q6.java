package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level5q6 extends AppCompatActivity {

    AlphaAnimation fivesixclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5q6);
    }


    public void butt561(View v) {
        v.startAnimation(fivesixclick);
        Button but561 = (Button) findViewById(R.id.button561);
        but561.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu561 = new Intent();
        bu561.setClass(this, level5q7.class);
        startActivity(bu561);
        finish();
    }

    public void butt562(View v) {
        v.startAnimation(fivesixclick);
        Button but562 = (Button) findViewById(R.id.button562);
        but562.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu562 = new Intent();
        bu562.setClass(this, level5q7.class);
        startActivity(bu562);
        finish();
    }

    public void butt563(View v) {
        v.startAnimation(fivesixclick);
        Button but563 = (Button) findViewById(R.id.button563);
        but563.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu563 = new Intent();
        bu563.setClass(this, level5q7.class);
        startActivity(bu563);
        finish();
    }

    public void butt564(View v) {
        v.startAnimation(fivesixclick);
        Button but564 = (Button) findViewById(R.id.button564);
        but564.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu564 = new Intent();
        bu564.setClass(this, level5q7.class);
        startActivity(bu564);
        finish();
    }


}
