package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level2q10 extends AppCompatActivity {

    AlphaAnimation twotenclick =new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2q10);
    }




    public void butt2101(View v) {
        v.startAnimation(twotenclick);
        Button but2101 = (Button) findViewById(R.id.button2101);
        but2101.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu2101 = new Intent();
        bu2101.setClass(this, Main2Activity.class);
        startActivity(bu2101);
        finish();
    }

    public void butt2102(View v) {
        v.startAnimation(twotenclick);
        Button but2102 = (Button) findViewById(R.id.button2102);
        but2102.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu2102 = new Intent();
        bu2102.setClass(this, Main2Activity.class);
        startActivity(bu2102);
        finish();
    }

    public void butt2103(View v) {
        v.startAnimation(twotenclick);
        Button but2103 = (Button) findViewById(R.id.button2103);
        but2103.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu2103 = new Intent();
        bu2103.setClass(this, Main2Activity.class);
        startActivity(bu2103);
        finish();
    }

    public void butt2104(View v) {
        v.startAnimation(twotenclick);
        Button but2104 = (Button) findViewById(R.id.button2104);
        but2104.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu2104 = new Intent();
        bu2104.setClass(this, Main2Activity.class);
        startActivity(bu2104);
        finish();
    }



}
