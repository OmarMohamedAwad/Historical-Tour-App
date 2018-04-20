package com.example.micro.historicaltour.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.micro.historicaltour.PlaceDetailsActivity;
import com.example.micro.historicaltour.R;
import com.example.micro.historicaltour.VideoActivity;
import com.example.micro.historicaltour.YoutubePlayerConfuration;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceVideoFragment extends Fragment {

    private View view;


    ImageView youtubeplayer_btn;

    public PlaceVideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.play_video_fragment, container, false);


        youtubeplayer_btn =view.findViewById(R.id.youtubeplayer_btn1);

        youtubeplayer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), VideoActivity.class);
                startActivity(intent);

            }
        });





        return view;
    }

}
