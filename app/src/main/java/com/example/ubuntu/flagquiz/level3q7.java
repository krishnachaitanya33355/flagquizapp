package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level3q7 extends AppCompatActivity {

    AlphaAnimation threesevenclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3q7);
    }


    public void butt371(View v) {
        v.startAnimation(threesevenclick);
        Button but371 = (Button) findViewById(R.id.button371);
        but371.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu371 = new Intent();
        bu371.setClass(this, level3q8.class);
        startActivity(bu371);
        finish();
    }

    public void butt372(View v) {
        v.startAnimation(threesevenclick);
        Button but372 = (Button) findViewById(R.id.button372);
        but372.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu372 = new Intent();
        bu372.setClass(this, level3q8.class);
        startActivity(bu372);
        finish();
    }

    public void butt373(View v) {
        v.startAnimation(threesevenclick);
        Button but373 = (Button) findViewById(R.id.button373);
        but373.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu373 = new Intent();
        bu373.setClass(this, level3q8.class);
        startActivity(bu373);
        finish();
    }

    public void butt374(View v) {
        v.startAnimation(threesevenclick);
        Button but374 = (Button) findViewById(R.id.button374);
        but374.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu374 = new Intent();
        bu374.setClass(this, level3q8.class);
        startActivity(bu374);
        finish();
    }



}
