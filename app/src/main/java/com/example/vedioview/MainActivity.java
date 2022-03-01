package com.example.vedioview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = findViewById(R.id.VideoView);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/" +R.raw.video));
        // create an object of media controller
        MediaController mediaController = new MediaController(this);
// initiate a video view
        VideoView simpleVideoView = (VideoView) findViewById(R.id.VideoView);
// set media controller object for a video view
        simpleVideoView.setMediaController(mediaController);
    }
}