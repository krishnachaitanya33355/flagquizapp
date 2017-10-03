package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level3q9 extends AppCompatActivity {

    AlphaAnimation threenineclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3q9);
    }

    public void butt391(View v) {
        v.startAnimation(threenineclick);
        Button but391 = (Button) findViewById(R.id.button391);
        but391.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu391 = new Intent();
        bu391.setClass(this, level3q10.class);
        startActivity(bu391);
        finish();
    }

    public void butt392(View v) {
        v.startAnimation(threenineclick);
        Button but392 = (Button) findViewById(R.id.button392);
        but392.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu392 = new Intent();
        bu392.setClass(this, level3q10.class);
        startActivity(bu392);
        finish();
    }

    public void butt393(View v) {
        v.startAnimation(threenineclick);
        Button but393 = (Button) findViewById(R.id.button393);
        but393.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu393 = new Intent();
        bu393.setClass(this, level3q10.class);
        startActivity(bu393);
        finish();
    }

    public void butt394(View v) {
        v.startAnimation(threenineclick);
        Button but394 = (Button) findViewById(R.id.button394);
        but394.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu394 = new Intent();
        bu394.setClass(this, level3q10.class);
        startActivity(bu394);
        finish();
    }




}

