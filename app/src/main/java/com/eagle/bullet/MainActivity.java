package com.eagle.bullet;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgv_TestOne, imgv_TestTwo, imgv_TestThree, imgv_TestFour, imgv_TestFive,
            imgv_TestSix, imgv_TestSeven, imgv_TestEight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgv_TestOne = (ImageView) findViewById(R.id.imgv_TestOne);
        imgv_TestTwo = (ImageView) findViewById(R.id.imgv_TestTwo);
        imgv_TestThree = (ImageView) findViewById(R.id.imgv_TestThree);
        imgv_TestFour = (ImageView) findViewById(R.id.imgv_TestFour);
        imgv_TestFive = (ImageView) findViewById(R.id.imgv_TestFive);
        imgv_TestSix = (ImageView) findViewById(R.id.imgv_TestSix);
        imgv_TestSeven = (ImageView) findViewById(R.id.imgv_TestSeven);
        imgv_TestEight = (ImageView) findViewById(R.id.imgv_TestEight);
        imgv_TestThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAlphaAnim();
            }
        });
        startRotationAnim();

    }


    /**
     * start alpha animator
     */
    private void startAlphaAnim() {
        ObjectAnimator alphaOne = ObjectAnimator.ofFloat(imgv_TestThree, View.ALPHA, 0f, 1f, 1f, 1f, 0f);
        alphaOne.setDuration(3000);
        alphaOne.setRepeatMode(ValueAnimator.REVERSE);
        alphaOne.setRepeatCount(0);
        alphaOne.setInterpolator(new DecelerateInterpolator());
        alphaOne.start();

        ObjectAnimator alphaTwo = ObjectAnimator.ofFloat(imgv_TestFour, View.ALPHA, 0f, 1f, 1f, 1f, 0f);
        alphaTwo.setDuration(1200);
        alphaTwo.setStartDelay(200);
        alphaTwo.setRepeatMode(ValueAnimator.REVERSE);
        alphaTwo.setRepeatCount(0);
        alphaTwo.setInterpolator(new DecelerateInterpolator());
        alphaTwo.start();

        ObjectAnimator alphaThree = ObjectAnimator.ofFloat(imgv_TestFive, View.ALPHA, 0f, 1f, 1f, 1f, 0f);
        alphaThree.setDuration(1200);
        alphaThree.setStartDelay(400);
        alphaThree.setRepeatMode(ValueAnimator.REVERSE);
        alphaThree.setRepeatCount(0);
        alphaThree.setInterpolator(new DecelerateInterpolator());
        alphaThree.start();

        ObjectAnimator alphaFour = ObjectAnimator.ofFloat(imgv_TestSix, View.ALPHA, 0f, 1f, 1f, 1f, 0f);
        alphaFour.setDuration(1200);
        alphaFour.setStartDelay(600);
        alphaFour.setRepeatMode(ValueAnimator.REVERSE);
        alphaFour.setRepeatCount(0);
        alphaFour.setInterpolator(new DecelerateInterpolator());
        alphaFour.start();

        ObjectAnimator alphaFive = ObjectAnimator.ofFloat(imgv_TestSeven, View.ALPHA, 0f, 1f, 1f, 1f, 0f);
        alphaFive.setDuration(1200);
        alphaFive.setStartDelay(800);
        alphaFive.setRepeatMode(ValueAnimator.REVERSE);
        alphaFive.setRepeatCount(0);
        alphaFive.setInterpolator(new DecelerateInterpolator());
        alphaFive.start();

        ObjectAnimator alphaSix = ObjectAnimator.ofFloat(imgv_TestEight, View.ALPHA, 0f, 1f, 1f, 1f, 0f);
        alphaSix.setDuration(1200);
        alphaSix.setStartDelay(800);
        alphaSix.setRepeatMode(ValueAnimator.REVERSE);
        alphaSix.setRepeatCount(0);
        alphaSix.setInterpolator(new DecelerateInterpolator());
        alphaSix.start();
    }


    /**
     * start rotation animator
     */
    private void startRotationAnim() {
        ObjectAnimator anim = ObjectAnimator.ofFloat(imgv_TestOne, View.ROTATION, 0, 360, 360 * 2, 360 * 4,
                360 * 8, 360 * 16, 360 * 24, 360 * 32, 360 * 36, 360 * 38, 360 * 39);
        anim.setDuration(12000);
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.setRepeatCount(-1);
        anim.start();

        ObjectAnimator anim2 = ObjectAnimator.ofFloat(imgv_TestTwo, View.ROTATION, 0, -360, -360 * 2, -360 * 4,
                -360 * 8, -360 * 16, -360 * 24, -360 * 32, -360 * 36, -360 * 38, -360 * 39);
        anim2.setDuration(12000);
        anim2.setRepeatMode(ValueAnimator.REVERSE);
        anim2.setRepeatCount(-1);
        anim2.start();
    }
}
