package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level1q7 extends AppCompatActivity {

    AlphaAnimation sevenoneclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1q7);
    }


    public void butt71(View v) {
        v.startAnimation(sevenoneclick);
        Button but71 = (Button) findViewById(R.id.button71);
        but71.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu71 = new Intent();
        bu71.setClass(this, level1q8.class);
        startActivity(bu71);
        finish();
    }

    public void butt72(View v) {
        v.startAnimation(sevenoneclick);
        Button but72 = (Button) findViewById(R.id.button72);
        but72.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu72 = new Intent();
        bu72.setClass(this, level1q8.class);
        startActivity(bu72);
        finish();


    }

    public void butt73(View v) {
        v.startAnimation(sevenoneclick);
        Button but73 = (Button) findViewById(R.id.button73);
        but73.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu73 = new Intent();
        bu73.setClass(this, level1q8.class);
        startActivity(bu73);
        finish();
    }

    public void butt74(View v) {
        v.startAnimation(sevenoneclick);
        Button but74 = (Button) findViewById(R.id.button74);
        but74.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu74 = new Intent();
        bu74.setClass(this, level1q8.class);
        startActivity(bu74);
        finish();
    }




}

