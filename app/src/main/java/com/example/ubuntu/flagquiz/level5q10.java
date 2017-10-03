package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level5q10 extends AppCompatActivity {

    AlphaAnimation fivetenclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5q10);
    }



    public void butt5101(View v) {
        v.startAnimation(fivetenclick);
        Button but5101 = (Button) findViewById(R.id.button5101);
        but5101.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu5101 = new Intent();
        bu5101.setClass(this, Main2Activity.class);
        startActivity(bu5101);
        finish();
    }

    public void butt5102(View v) {
        v.startAnimation(fivetenclick);
        Button but5102 = (Button) findViewById(R.id.button5102);
        but5102.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu5102 = new Intent();
        bu5102.setClass(this, Main2Activity.class);
        startActivity(bu5102);
        finish();
    }

    public void butt5103(View v) {
        v.startAnimation(fivetenclick);
        Button but5103 = (Button) findViewById(R.id.button5103);
        but5103.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu5103 = new Intent();
        bu5103.setClass(this, Main2Activity.class);
        startActivity(bu5103);
        finish();
    }

    public void butt5104(View v) {
        v.startAnimation(fivetenclick);
        Button but5104 = (Button) findViewById(R.id.button5104);
        but5104.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu5104 = new Intent();
        bu5104.setClass(this, Main2Activity.class);
        startActivity(bu5104);
        finish();
    }


}
