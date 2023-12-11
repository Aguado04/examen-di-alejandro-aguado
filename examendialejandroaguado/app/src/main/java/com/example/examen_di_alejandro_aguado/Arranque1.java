package com.example.examen_di_alejandro_aguado;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Arranque1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arranque);
        openLogin();

        ImageView logoSplash = findViewById(R.id.logoSplash);
        TextView appNameSplash = findViewById(R.id.appNameSplash);

        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale);
        appNameSplash.startAnimation(scaleAnimation);

        Animation scaleAnimation2 = AnimationUtils.loadAnimation(this, R.anim.scale);
        logoSplash.startAnimation(scaleAnimation2);

        ImageView background = findViewById(R.id.backgroundSplash);
        Glide.with(this)
                .load("data:image/jpeg;base64,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")                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .centerCrop()
                .into(background);
    }

    public void openLogin(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Arranque1.this, Acceso.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 3000);
    }
}