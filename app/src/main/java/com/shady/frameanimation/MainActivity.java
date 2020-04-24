package com.shady.frameanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable mDrawable;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.imageView);
//        mImageView.setBackgroundResource(R.drawable.cat_dog_anim);
//        mDrawable = (AnimationDrawable) mImageView.getBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //mDrawable.start();
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein_anim);
                mImageView.startAnimation(animation);

//                mDrawable.stop();
            }
        }, 50);
        return super.onTouchEvent(event);
    }
}
