package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;

public class Main2Activity extends AppCompatActivity {

    private AlphaAnimation levelclick = new AlphaAnimation(1F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void leone(View v) {
        v.startAnimation(levelclick);
        Intent lev1 = new Intent();
        lev1.setClass(this, level1.class);
        startActivity(lev1);
    }

    public void letwo(View v) {
        v.startAnimation(levelclick);
        Intent lev2 = new Intent();
        lev2.setClass(this, level2.class);
        startActivity(lev2);
    }

    public void lethree(View v) {
        v.startAnimation(levelclick);
        Intent lev3 = new Intent();
        lev3.setClass(this, level3.class);
        startActivity(lev3);
    }

    public void lefour(View v) {
        v.startAnimation(levelclick);
        Intent lev4 = new Intent();
        lev4.setClass(this, level4.class);
        startActivity(lev4);
    }

    public void lefive(View v) {
        v.startAnimation(levelclick);
        Intent lev5 = new Intent();
        lev5.setClass(this, level5.class);
        startActivity(lev5);
    }
}





