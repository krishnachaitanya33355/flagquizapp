package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class level1 extends AppCompatActivity {
    
    private AlphaAnimation q1click = new AlphaAnimation(1F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
    }

        public void butt1(View v){
            v.startAnimation(q1click);
            Button bone = (Button)findViewById(R.id.button1);
            bone.setBackgroundColor(Color.parseColor("#6fcb9f"));
            Intent buttone = new Intent();
            buttone.setClass(this,level1q2.class);
            startActivity(buttone);
            finish();


        }

    public void butt2(View v){
        v.startAnimation(q1click);
        Button btwo = (Button)findViewById(R.id.button2);
        btwo.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent butttwo = new Intent();
        butttwo.setClass(this,level1q2.class);
        startActivity(butttwo);
        finish();
    }

    public void butt3(View v){
        v.startAnimation(q1click);
        Button bthree = (Button)findViewById(R.id.button3);
        bthree.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent buttthree = new Intent();
        buttthree.setClass(this,level1q2.class);
        startActivity(buttthree);
        finish();
    }

    public void butt4(View v){
        v.startAnimation(q1click);
        Button bfour = (Button)findViewById(R.id.button4);
        bfour.setBackgroundColor(Color.parseColor("#ee4035"));
        Intent buttfour = new Intent();
        buttfour.setClass(this,level1q2.class);
        startActivity(buttfour);
        finish();

    }

}

