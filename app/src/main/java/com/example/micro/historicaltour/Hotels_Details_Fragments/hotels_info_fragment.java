package com.example.micro.historicaltour.Hotels_Details_Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.micro.historicaltour.Classes.classes.hotelClass;
import com.example.micro.historicaltour.R;

/**
 * Created by micro on 21/03/2018.
 */

public class hotels_info_fragment extends android.support.v4.app.Fragment {

    View view;
    hotelClass hotel;

    TextView nameTextview;
    TextView descriptionTextview;

    public hotels_info_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.info_fragment,container,false);

        Intent intent = getActivity().getIntent();
        hotel = intent.getParcelableExtra("hotel");

        nameTextview=view.findViewById(R.id.placeNameTextview);
        descriptionTextview=view.findViewById(R.id.placeDescriptionTextview);

        nameTextview.setText(hotel.getName());
        descriptionTextview.setText(hotel.getDescrption());

        return view;
    }
}
