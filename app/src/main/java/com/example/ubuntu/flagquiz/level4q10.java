package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level4q10 extends AppCompatActivity {

    AlphaAnimation fourtenclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4q10);
    }

    public void butt4101(View v) {
        v.startAnimation(fourtenclick);
        Button but4101 = (Button) findViewById(R.id.button4101);
        but4101.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu4101 = new Intent();
        bu4101.setClass(this, Main2Activity.class);
        startActivity(bu4101);
        finish();
    }

    public void butt4102(View v) {
        v.startAnimation(fourtenclick);
        Button but4102 = (Button) findViewById(R.id.button4102);
        but4102.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu4102 = new Intent();
        bu4102.setClass(this, Main2Activity.class);
        startActivity(bu4102);
        finish();
    }

    public void butt4103(View v) {
        v.startAnimation(fourtenclick);
        Button but4103 = (Button) findViewById(R.id.button4103);
        but4103.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu4103 = new Intent();
        bu4103.setClass(this, Main2Activity.class);
        startActivity(bu4103);
        finish();
    }

    public void butt4104(View v) {
        v.startAnimation(fourtenclick);
        Button but4104 = (Button) findViewById(R.id.button4104);
        but4104.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu4104 = new Intent();
        bu4104.setClass(this, Main2Activity.class);
        startActivity(bu4104);
        finish();
    }



}
