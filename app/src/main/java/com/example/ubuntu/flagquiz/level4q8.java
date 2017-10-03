package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level4q8 extends AppCompatActivity {

    AlphaAnimation foureightclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4q8);
    }

    public void butt481(View v) {
        v.startAnimation(foureightclick);
        Button but481 = (Button) findViewById(R.id.button481);
        but481.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu481 = new Intent();
        bu481.setClass(this, level4q9.class);
        startActivity(bu481);
        finish();
    }

    public void butt482(View v) {
        v.startAnimation(foureightclick);
        Button but482 = (Button) findViewById(R.id.button482);
        but482.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu482 = new Intent();
        bu482.setClass(this, level4q9.class);
        startActivity(bu482);
        finish();
    }

    public void butt483(View v) {
        v.startAnimation(foureightclick);
        Button but483 = (Button) findViewById(R.id.button483);
        but483.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu483 = new Intent();
        bu483.setClass(this, level4q9.class);
        startActivity(bu483);
        finish();
    }

    public void butt484(View v) {
        v.startAnimation(foureightclick);
        Button but484 = (Button) findViewById(R.id.button484);
        but484.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu484 = new Intent();
        bu484.setClass(this, level4q9.class);
        startActivity(bu484);
        finish();
    }



}
