package com.example.nam1102.videoapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView video=(VideoView)findViewById(R.id.myvideoview);
        video.setVideoPath("http://ia802302.us.archive.org/27/items/Pbtestfilemp4videotestmp4/video_test.mp4");
        video.start();

    }
}