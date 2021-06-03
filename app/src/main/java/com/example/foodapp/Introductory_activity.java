package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.foodapp.fragments.Fragment1;
import com.example.foodapp.fragments.Fragment2;
import com.example.foodapp.fragments.Fragment3;

public class Introductory_activity extends AppCompatActivity {

    private ImageView logo, background;
    private TextView apptext;
    private LottieAnimationView animationView;
    private static final int NUM_PAGES = 3;
    private ViewPager viewpager;
    private ScreenSlidePagerAdapter pagerAdapter;
    private Animation anim;
    private static int splash_time_out = 5000;
    SharedPreferences msharedperf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introductory_activity);
        logo = findViewById(R.id.app_logo);
        background = findViewById(R.id.app_background);
        apptext = findViewById(R.id.app_text);
        animationView = findViewById(R.id.lottie);
        viewpager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(pagerAdapter);
        anim = AnimationUtils.loadAnimation(this, R.anim.obj_animation);
        viewpager.startAnimation(anim);

        background.animate().translationY(-5000).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(3000).setDuration(1000).setStartDelay(4000);
        apptext.animate().translationY(3000).setDuration(1000).setStartDelay(4000);
        animationView.animate().translationY(3000).setDuration(1000).setStartDelay(4000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                msharedperf = getSharedPreferences("sharedPref", MODE_PRIVATE);
                boolean isFirstTime = msharedperf.getBoolean("firstTime", true);

                if(isFirstTime){

                    SharedPreferences.Editor editor = msharedperf.edit();
                    editor.putBoolean("firstTime", false);
                    editor.commit();
                }else{
                    Intent intent = new Intent(Introductory_activity.this, Login_Activity.class);
                    startActivity(intent);
                    finish();
                }

            }
        },splash_time_out);

    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter{

        public ScreenSlidePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    Fragment1 tab1 =new Fragment1();
                    return tab1;

                case 1:
                    Fragment2 tab2 =new Fragment2();
                    return tab2;

                case 2:
                    Fragment3 tab3 =new Fragment3();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}