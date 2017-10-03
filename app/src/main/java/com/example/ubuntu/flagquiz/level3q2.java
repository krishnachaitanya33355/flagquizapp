package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level3q2 extends AppCompatActivity {

    AlphaAnimation threetwoclick = new AlphaAnimation(1.0F,0.0F);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3q2);
    }

    public void butt321(View v) {
        v.startAnimation(threetwoclick);
        Button but321 = (Button) findViewById(R.id.button321);
        but321.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu321 = new Intent();
        bu321.setClass(this, level3q3.class);
        startActivity(bu321);
        finish();
    }

    public void butt322(View v) {
        v.startAnimation(threetwoclick);
        Button but322 = (Button) findViewById(R.id.button322);
        but322.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu322 = new Intent();
        bu322.setClass(this, level3q3.class);
        startActivity(bu322);
        finish();
    }

    public void butt323(View v) {
        v.startAnimation(threetwoclick);
        Button but323 = (Button) findViewById(R.id.button323);
        but323.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu323 = new Intent();
        bu323.setClass(this, level3q3.class);
        startActivity(bu323);
        finish();
    }

    public void butt324(View v) {
        v.startAnimation(threetwoclick);
        Button but324 = (Button) findViewById(R.id.button324);
        but324.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu324 = new Intent();
        bu324.setClass(this, level3q3.class);
        startActivity(bu324);
        finish();
    }




}
