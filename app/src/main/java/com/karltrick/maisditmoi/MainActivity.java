package com.karltrick.maisditmoi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = this.findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.pause();
                } else {
                    mp.start();
                }
            }
        });

        Button two = this.findViewById(R.id.button2);
        final VideoView myVideoView = (VideoView) findViewById(R.id.videoView);
        myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));

        two.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if(myVideoView.isPlaying()){
                    myVideoView.pause();
                } else {
                    myVideoView.start();
                }
            }
        });
    }
}
