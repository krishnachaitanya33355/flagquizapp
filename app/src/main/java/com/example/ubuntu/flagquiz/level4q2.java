package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level4q2 extends AppCompatActivity {

    AlphaAnimation fourtwoclick = new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4q2);
    }



    public void butt421(View v) {
        v.startAnimation(fourtwoclick);
        Button but421 = (Button) findViewById(R.id.button421);
        but421.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu421 = new Intent();
        bu421.setClass(this, level4q3.class);
        startActivity(bu421);
        finish();
    }

    public void butt422(View v) {
        v.startAnimation(fourtwoclick);
        Button but422 = (Button) findViewById(R.id.button422);
        but422.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu422 = new Intent();
        bu422.setClass(this, level4q3.class);
        startActivity(bu422);
        finish();
    }

    public void butt423(View v) {
        v.startAnimation(fourtwoclick);
        Button but423 = (Button) findViewById(R.id.button423);
        but423.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu423 = new Intent();
        bu423.setClass(this, level4q3.class);
        startActivity(bu423);
        finish();
    }

    public void butt424(View v) {
        v.startAnimation(fourtwoclick);
        Button but424 = (Button) findViewById(R.id.button424);
        but424.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu424 = new Intent();
        bu424.setClass(this, level4q3.class);
        startActivity(bu424);
        finish();
    }



}
