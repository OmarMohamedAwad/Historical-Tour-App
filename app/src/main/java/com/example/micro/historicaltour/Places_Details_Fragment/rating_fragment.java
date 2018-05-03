package com.example.micro.historicaltour.Places_Details_Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.micro.historicaltour.Classes.classes.placeClass;
import com.example.micro.historicaltour.Classes.classes.reviewClass;
import com.example.micro.historicaltour.R;
import com.example.micro.historicaltour.ReviewListAdapter;

import java.util.ArrayList;

/**
 * Created by micro on 21/03/2018.
 */

public class rating_fragment extends android.support.v4.app.Fragment {
    View view;
    placeClass place;
    public rating_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.rating_fragment,container,false);


        Intent intent = getActivity().getIntent();
        place=intent.getParcelableExtra("place");

        ArrayList<reviewClass> reviews =place.getReviewClasses();


        ListView myPhrasesList = (ListView) view.findViewById(R.id.list_of_comments);
        ReviewListAdapter adapter = new ReviewListAdapter(getActivity(),reviews);
        myPhrasesList.setAdapter(adapter);


        return view;
    }
}
