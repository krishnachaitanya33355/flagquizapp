package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level2q2 extends AppCompatActivity {

    AlphaAnimation twotwoclick =new AlphaAnimation(1.0F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2q2);
    }



    public void butt221(View v) {
        v.startAnimation(twotwoclick);
        Button but221 = (Button) findViewById(R.id.button221);
        but221.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu221 = new Intent();
        bu221.setClass(this, level2q3.class);
        startActivity(bu221);
        finish();
    }

    public void butt222(View v) {
        v.startAnimation(twotwoclick);
        Button but222 = (Button) findViewById(R.id.button222);
        but222.setBackgroundColor(Color.parseColor("#6fcb9f"));
        Intent bu222 = new Intent();
        bu222.setClass(this, level2q3.class);
        startActivity(bu222);
        finish();
    }

    public void butt223(View v) {
        v.startAnimation(twotwoclick);
        Button but223 = (Button) findViewById(R.id.button223);
        but223.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu223 = new Intent();
        bu223.setClass(this, level2q3.class);
        startActivity(bu223);
        finish();
    }

    public void butt224(View v) {
        v.startAnimation(twotwoclick);
        Button but224 = (Button) findViewById(R.id.button224);
        but224.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent bu224 = new Intent();
        bu224.setClass(this, level2q3.class);
        startActivity(bu224);
        finish();
    }




}
