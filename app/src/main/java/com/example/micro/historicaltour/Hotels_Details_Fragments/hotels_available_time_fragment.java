package com.example.micro.historicaltour.Hotels_Details_Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.micro.historicaltour.Classes.classes.hotelClass;
import com.example.micro.historicaltour.Classes.classes.timeClass;
import com.example.micro.historicaltour.R;

import java.util.ArrayList;

/**
 * Created by micro on 21/03/2018.
 */

public class hotels_available_time_fragment extends android.support.v4.app.Fragment {
    View view;
    hotelClass hotel ;

    ArrayList<TabLayout> textViews;
    TabLayout day1;
    TabLayout day2;
    TabLayout day3;
    TabLayout day4;
    TabLayout day5;
    TabLayout day6;
    TabLayout day7;

    public hotels_available_time_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.available_time_fragment,container,false);

        Intent intent = getActivity().getIntent();
        hotel= intent.getParcelableExtra("hotel");
        ArrayList<timeClass> days =hotel.getWorkingDays();

        textViews = new ArrayList<>();


        day1 =view.findViewById(R.id.day1Textview);
        day2 =view.findViewById(R.id.day2Textview);
        day3 =view.findViewById(R.id.day3Textview);
        day4 =view.findViewById(R.id.day4Textview);
        day5 =view.findViewById(R.id.day5Textview);
        day6 =view.findViewById(R.id.day6Textview);
        day7 =view.findViewById(R.id.day7Textview);

   /*     textViews.add(day1);
        textViews.add(day2);
        textViews.add(day3);
        textViews.add(day4);
        textViews.add(day5);
        textViews.add(day6);
        textViews.add(day7);


        for(int i=0;i<7;i++){
            if(days.get(i)!=null){
                textViews.get(i).getTabAt(1).setText(String.valueOf(days.get(i).getStartTime())+" : "+String.valueOf(days.get(i).getEndTime()));
            }
            else {
                textViews.get(i).getTabAt(1).setText("Day off");
            }
        }
*/
        return view;
    }
}

