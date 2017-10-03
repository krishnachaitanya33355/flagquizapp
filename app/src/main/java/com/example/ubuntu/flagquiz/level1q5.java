package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level1q5 extends AppCompatActivity {

    AlphaAnimation fiveoneclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1q5);
    }


    public void butt51(View v) {
        v.startAnimation(fiveoneclick);
        Button but51 = (Button) findViewById(R.id.button51);
        but51.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu51 = new Intent();
        bu51.setClass(this, level1q6.class);
        startActivity(bu51);
        finish();
    }

    public void butt52(View v) {
        v.startAnimation(fiveoneclick);
        Button but52 = (Button) findViewById(R.id.button52);
        but52.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu52 = new Intent();
        bu52.setClass(this, level1q6.class);
        startActivity(bu52);
        finish();
    }

    public void butt53(View v) {
        v.startAnimation(fiveoneclick);
        Button but53 = (Button) findViewById(R.id.button53);
        but53.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu53 = new Intent();
        bu53.setClass(this, level1q6.class);
        startActivity(bu53);
        finish();
    }

    public void butt54(View v) {
        v.startAnimation(fiveoneclick);
        Button but54 = (Button) findViewById(R.id.button54);
        but54.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu54 = new Intent();
        bu54.setClass(this, level1q6.class);
        startActivity(bu54);
        finish();


    }




}
