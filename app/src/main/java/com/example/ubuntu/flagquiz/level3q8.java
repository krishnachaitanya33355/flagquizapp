package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level3q8 extends AppCompatActivity {

    AlphaAnimation threeeightclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3q8);
    }


    public void butt381(View v) {
        v.startAnimation(threeeightclick);
        Button but381 = (Button) findViewById(R.id.button381);
        but381.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu381 = new Intent();
        bu381.setClass(this, level3q9.class);
        startActivity(bu381);
        finish();
    }

    public void butt382(View v) {
        v.startAnimation(threeeightclick);
        Button but382 = (Button) findViewById(R.id.button382);
        but382.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu382 = new Intent();
        bu382.setClass(this, level3q9.class);
        startActivity(bu382);
        finish();
    }

    public void butt383(View v) {
        v.startAnimation(threeeightclick);
        Button but383 = (Button) findViewById(R.id.button383);
        but383.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu383 = new Intent();
        bu383.setClass(this, level3q9.class);
        startActivity(bu383);
        finish();
    }

    public void butt384(View v) {
        v.startAnimation(threeeightclick);
        Button but384 = (Button) findViewById(R.id.button384);
        but384.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu384 = new Intent();
        bu384.setClass(this, level3q9.class);
        startActivity(bu384);
        finish();
    }



}
