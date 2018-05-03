package com.example.micro.historicaltour.Hotels_Details_Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.micro.historicaltour.Classes.classes.hotelClass;
import com.example.micro.historicaltour.R;
import com.example.micro.historicaltour.VideoActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class hotels_PlaceVideoFragment extends Fragment {

    private View view;

    ImageView youtubeplayer_btn;

    hotelClass hotel;

    public hotels_PlaceVideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.play_video_fragment, container, false);

        Intent intent = getActivity().getIntent();
        hotel = intent.getParcelableExtra("hotel");

        youtubeplayer_btn =view.findViewById(R.id.youtubeplayer_btn1);

        youtubeplayer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), VideoActivity.class);
                intent.putExtra("key",hotel.getVideoKey());
                startActivity(intent);

            }
        });





        return view;
    }

}
