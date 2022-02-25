package com.example.parcial1cicloiii;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ReproductorDeVideo extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor_de_video);


        videoView = (VideoView)findViewById(R.id.videoView);

        String path = "android.resource://"+ getPackageName() + "/" +
                R.raw.video;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();

    }
}