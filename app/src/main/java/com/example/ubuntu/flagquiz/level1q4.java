package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level1q4 extends AppCompatActivity {

    private AlphaAnimation fouroneclick = new AlphaAnimation(1F, 0.0F);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1q4);
    }




    public void butt41(View v) {
        v.startAnimation(fouroneclick);
        Button but41 = (Button) findViewById(R.id.button41);
        but41.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu41 = new Intent();
        bu41.setClass(this, level1q5.class);
        startActivity(bu41);
        finish();
    }

    public void butt42(View v) {
        v.startAnimation(fouroneclick);
        Button but42 = (Button) findViewById(R.id.button42);
        but42.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu42 = new Intent();
        bu42.setClass(this, level1q5.class);
        startActivity(bu42);
        finish();
    }

    public void butt43(View v) {
        v.startAnimation(fouroneclick);
        Button but43 = (Button) findViewById(R.id.button43);
        but43.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu43 = new Intent();
        bu43.setClass(this, level1q5.class);
        startActivity(bu43);
        finish();





    }

    public void butt44(View v) {
        v.startAnimation(fouroneclick);
        Button but44 = (Button) findViewById(R.id.button44);
        but44.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu44 = new Intent();
        bu44.setClass(this, level1q5.class);
        startActivity(bu44);
        finish();
    }





}
