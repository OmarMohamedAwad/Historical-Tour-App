package com.example.micro.historicaltour.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.micro.historicaltour.R;

/**
 * Created by micro on 21/03/2018.
 */

public class available_time_fragment  extends android.support.v4.app.Fragment {
    View view;
    public available_time_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.available_time_fragment,container,false);
       /* VideoView videoView =(VideoView)view.findViewById(R.id.vedioview);*/
/*


     String videopath="android.resource://"+getActivity().getPackageName()+"/"+R.raw.frag;
     Uri uri=Uri.parse(videopath);
     videoView.setVideoURI(uri);
     videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
         @Override
         public void onPrepared(MediaPlayer mediaPlayer) {
             mediaPlayer.setLooping(true);
         }
     });
        MediaController mediaController  = new MediaController(getContext());
        videoView.setMediaController(new MediaController(getActivity()));
        videoView.start();*/
        return view;
    }
}

