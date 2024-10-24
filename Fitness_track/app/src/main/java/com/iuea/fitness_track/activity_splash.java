package com.iuea.fitness_track;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class activity_splash extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            // Apply fade-in animation to logo
            ImageView logo = findViewById(R.id.logo);
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
            logo.startAnimation(animation);

            // Navigate to Dashboard after 3 seconds
            new Handler().postDelayed(() -> {
                Intent intent = new Intent(activity_splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }, 3000);
        }
    }
