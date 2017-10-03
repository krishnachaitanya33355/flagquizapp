package com.example.ubuntu.flagquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;

public class MainActivity extends AppCompatActivity {

    private AlphaAnimation buttonclick = new AlphaAnimation(1F,0.0F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void ButtonAction(View v){
            v.startAnimation(buttonclick);
            Intent second = new Intent();
            second.setClass(this,Main2Activity.class);
            startActivity(second);
        }
    }
