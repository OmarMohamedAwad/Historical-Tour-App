package com.example.micro.historicaltour.Places_Details_Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.micro.historicaltour.Classes.classes.placeClass;
import com.example.micro.historicaltour.R;
import com.example.micro.historicaltour.VideoActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceVideoFragment extends Fragment {

    private View view;

    ImageView youtubeplayer_btn;

    placeClass place;

    public PlaceVideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.play_video_fragment, container, false);

        Intent intent = getActivity().getIntent();
        place = intent.getParcelableExtra("place");

        youtubeplayer_btn =view.findViewById(R.id.youtubeplayer_btn1);

        youtubeplayer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), VideoActivity.class);
                intent.putExtra("key",place.getVideoKey());
                startActivity(intent);

            }
        });





        return view;
    }

}
