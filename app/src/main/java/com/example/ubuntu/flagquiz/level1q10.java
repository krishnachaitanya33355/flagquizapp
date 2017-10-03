package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level1q10 extends AppCompatActivity {

    AlphaAnimation tenoneclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1q10);
    }




    public void butt101(View v) {
        v.startAnimation(tenoneclick);
        Button but101 = (Button) findViewById(R.id.button101);
        but101.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu101 = new Intent();
        bu101.setClass(this, MainActivity.class);
        startActivity(bu101);
        finish();
    }

    public void butt102(View v) {
        v.startAnimation(tenoneclick);
        Button but102 = (Button) findViewById(R.id.button102);
        but102.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu102 = new Intent();
        bu102.setClass(this, MainActivity.class);
        startActivity(bu102);
        finish();
    }

    public void butt103(View v) {
        v.startAnimation(tenoneclick);
        Button but103 = (Button) findViewById(R.id.button103);
        but103.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu103 = new Intent();
        bu103.setClass(this, MainActivity.class);
        startActivity(bu103);
        finish();
    }

    public void butt104(View v) {
        v.startAnimation(tenoneclick);
        Button but104 = (Button) findViewById(R.id.button104);
        but104.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu104 = new Intent();
        bu104.setClass(this,MainActivity.class);
        startActivity(bu104);
        finish();
    }





}
