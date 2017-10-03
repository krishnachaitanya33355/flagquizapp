package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level3q6 extends AppCompatActivity {

    AlphaAnimation threesixclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3q6);
    }


    public void butt361(View v) {
        v.startAnimation(threesixclick);
        Button but361 = (Button) findViewById(R.id.button361);
        but361.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu361 = new Intent();
        bu361.setClass(this, level3q7.class);
        startActivity(bu361);
        finish();
    }

    public void butt362(View v) {
        v.startAnimation(threesixclick);
        Button but362 = (Button) findViewById(R.id.button362);
        but362.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu362 = new Intent();
        bu362.setClass(this, level3q7.class);
        startActivity(bu362);
        finish();
    }

    public void butt363(View v) {
        v.startAnimation(threesixclick);
        Button but363 = (Button) findViewById(R.id.button363);
        but363.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu363 = new Intent();
        bu363.setClass(this, level3q7.class);
        startActivity(bu363);
        finish();
    }

    public void butt364(View v) {
        v.startAnimation(threesixclick);
        Button but364 = (Button) findViewById(R.id.button364);
        but364.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu364 = new Intent();
        bu364.setClass(this, level3q7.class);
        startActivity(bu364);
        finish();
    }



}
