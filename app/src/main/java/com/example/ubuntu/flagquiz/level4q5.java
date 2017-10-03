package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level4q5 extends AppCompatActivity {

    AlphaAnimation fourfiveclick = new AlphaAnimation(1.0F,0.0F);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4q5);
    }




    public void butt451(View v) {
        v.startAnimation(fourfiveclick);
        Button but451 = (Button) findViewById(R.id.button451);
        but451.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu451 = new Intent();
        bu451.setClass(this, level4q6.class);
        startActivity(bu451);
        finish();
    }

    public void butt452(View v) {
        v.startAnimation(fourfiveclick);
        Button but452 = (Button) findViewById(R.id.button452);
        but452.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu452 = new Intent();
        bu452.setClass(this, level4q6.class);
        startActivity(bu452);
        finish();
    }

    public void butt453(View v) {
        v.startAnimation(fourfiveclick);
        Button but453 = (Button) findViewById(R.id.button453);
        but453.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu453 = new Intent();
        bu453.setClass(this, level4q6.class);
        startActivity(bu453);
        finish();
    }

    public void butt454(View v) {
        v.startAnimation(fourfiveclick);
        Button but454 = (Button) findViewById(R.id.button454);
        but454.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu454 = new Intent();
        bu454.setClass(this, level4q6.class);
        startActivity(bu454);
        finish();
    }



}
