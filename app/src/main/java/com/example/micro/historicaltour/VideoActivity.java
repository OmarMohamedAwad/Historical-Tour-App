package com.example.micro.historicaltour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.micro.historicaltour.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoActivity extends YouTubeBaseActivity {


    YouTubePlayerView youTubePlayer;

    YouTubePlayer.OnInitializedListener onInitializedListener;

    ImageView youtubeplayer_btn;

    String videoKey;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);




        youTubePlayer= findViewById(R.id.place_youtube_playerview);

        youtubeplayer_btn = findViewById(R.id.youtubeplayer_btn);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                Intent intent =getIntent();
                videoKey= intent.getStringExtra("key");

                youTubePlayer.loadVideo(videoKey);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        youtubeplayer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                youTubePlayer.initialize(YoutubePlayerConfuration.apiKey,onInitializedListener);
                youtubeplayer_btn.setVisibility(View.GONE);

            }
        });



    }
}
