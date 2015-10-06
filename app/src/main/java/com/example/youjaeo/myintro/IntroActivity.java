package com.example.youjaeo.myintro;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class IntroActivity extends Activity {

    Handler handler;
    ImageView imgView_1;
    AnimationDrawable mAnimationDrawable_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        imgView_1.setBackgroundResource(R.drawable.animation);
        mAnimationDrawable_1 = (AnimationDrawable)imgView_1.getBackground();

        mAnimationDrawable_1.start();

        handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                mAnimationDrawable_1.stop();
                finish();
            }
        }, 10000);   //10초후 종료

    }


}
