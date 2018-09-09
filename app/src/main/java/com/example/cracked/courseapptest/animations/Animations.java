package com.example.cracked.courseapptest.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.cracked.courseapptest.R;

public class Animations extends AppCompatActivity {

    public void fadeOn(View view) {
        ImageView imgon = findViewById(R.id.imgOn);
        ImageView imgoff = findViewById(R.id.imgOff);

        imgon.animate().alpha(0f).setDuration(2000);
        imgon.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
        imgon.animate().translationXBy(-1000f).setDuration(1000);
        imgoff.animate().alpha(1f).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation);
    }
}
