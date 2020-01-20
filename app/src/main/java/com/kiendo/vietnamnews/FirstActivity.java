package com.kiendo.vietnamnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class FirstActivity extends AppCompatActivity {
    ImageView imageView;

    AnimationDrawable animationDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        imageView = findViewById(R.id.imageViewAnimation);



        imageView.setBackgroundResource(R.drawable.myanimation);

        animationDrawable = (AnimationDrawable) imageView.getBackground();


        animationDrawable.start();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 10000);





    }




}
