package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

Button right;
Button left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YouTubePlayerView youTubePlayerView = findViewById(R.id.video1);
        getLifecycle().addObserver(youTubePlayerView);
        YouTubePlayerView youTubePlayerView1 = findViewById(R.id.video2);
        getLifecycle().addObserver(youTubePlayerView);
        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.video3);
        getLifecycle().addObserver(youTubePlayerView);
        YouTubePlayerView youTubePlayerView3 = findViewById(R.id.video4);
        getLifecycle().addObserver(youTubePlayerView);
        YouTubePlayerView youTubePlayerView4 = findViewById(R.id.video5);
        getLifecycle().addObserver(youTubePlayerView);

        right=(Button)findViewById(R.id.right);
        left=(Button)findViewById(R.id.left);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Right.class);
                startActivity(i);
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Left.class);
                startActivity(i);
            }
        });







    }


}



