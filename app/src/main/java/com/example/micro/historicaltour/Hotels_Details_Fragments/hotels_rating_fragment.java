package com.example.micro.historicaltour.Hotels_Details_Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.micro.historicaltour.Classes.classes.hotelClass;
import com.example.micro.historicaltour.Classes.classes.reviewClass;
import com.example.micro.historicaltour.R;
import com.example.micro.historicaltour.ReviewListAdapter;

import java.util.ArrayList;

/**
 * Created by micro on 21/03/2018.
 */

public class hotels_rating_fragment extends android.support.v4.app.Fragment {
    View view;
    hotelClass hotel;
    public hotels_rating_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.rating_fragment,container,false);


        Intent intent = getActivity().getIntent();
        hotel=intent.getParcelableExtra("hotel");

        ArrayList<reviewClass> reviews =hotel.getReviewClasses();


        ListView myPhrasesList = (ListView) view.findViewById(R.id.list_of_comments);
        ReviewListAdapter adapter = new ReviewListAdapter(getActivity(),reviews);
        myPhrasesList.setAdapter(adapter);


        return view;
    }
}
