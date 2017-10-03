package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level1q2 extends AppCompatActivity {
    private AlphaAnimation twooneclick = new AlphaAnimation(1F, 0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1q2);
    }


    public void butt21(View v) {
        v.startAnimation(twooneclick);
        Button but21 = (Button) findViewById(R.id.button21);
        but21.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu21 = new Intent();
        bu21.setClass(this, level1q3.class);
        startActivity(bu21);
        finish();
    }

    public void butt22(View v) {
        v.startAnimation(twooneclick);
        Button but22 = (Button) findViewById(R.id.button22);
        but22.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu22 = new Intent();
        bu22.setClass(this, level1q3.class);
        startActivity(bu22);
        finish();
    }

    public void butt23(View v) {
        v.startAnimation(twooneclick);
        Button but23 = (Button) findViewById(R.id.button23);
        but23.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu23 = new Intent();
        bu23.setClass(this, level1q3.class);
        startActivity(bu23);
        finish();
    }

    public void butt24(View v) {
        v.startAnimation(twooneclick);
        Button but24 = (Button) findViewById(R.id.button24);
        but24.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu24 = new Intent();
        bu24.setClass(this, level1q3.class);
        startActivity(bu24);
        finish();



    }


}


