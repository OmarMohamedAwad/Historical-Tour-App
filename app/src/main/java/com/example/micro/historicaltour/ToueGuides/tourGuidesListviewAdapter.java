package com.example.micro.historicaltour.ToueGuides;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.micro.historicaltour.Classes.classes.tourguideClass;
import com.example.micro.historicaltour.R;

import java.util.ArrayList;

/**
 * Created by Omar Awad on 3/28/2018.
 */

public class tourGuidesListviewAdapter extends ArrayAdapter {

    ArrayList<tourguideClass> tourGuides;

    public tourGuidesListviewAdapter(@NonNull Context context, ArrayList<tourguideClass> tourGuides) {
        super(context, 0);
        this.tourGuides = tourGuides;
    }

    @Override
    public int getCount() {
        return tourGuides.size();
    }

    @Override
    public Object getItem(int i) {
        return tourGuides.get(i);
    }

    @Override
    public long getItemId(int i) {
        return tourGuides.get(i).getID();
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        tourguideClass currentPlace = tourGuides.get(i);

        tourViewholder viewholder ;

        if(view==null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.tourguide_special_layout,null);

            viewholder=new tourViewholder(view);

            view.setTag(viewholder);
        }
        else {
            viewholder= (tourViewholder) view.getTag();
        }

        viewholder.rate.setText((String.valueOf(currentPlace.getRate())));
        viewholder.name.setText((String.valueOf(currentPlace.getName())));
        viewholder.address.setText((String.valueOf(currentPlace.getAddress())));
        viewholder.email.setText((String.valueOf(currentPlace.getEmail())));
        //viewholder.image.setImageResource(currentPlace.getImageId());


        return view;
    }

    public  class tourViewholder{

        TextView rate;
        TextView name;
        TextView address;
        TextView email;
        //ImageView image;

        public tourViewholder(View view){

            rate = (TextView) view.findViewById(R.id.rate_textView);
            name = (TextView) view.findViewById(R.id.name_textView);
            address = (TextView) view.findViewById(R.id.address_textView);
            email = (TextView) view.findViewById(R.id.description_textView);
            //image =  view.findViewById(R.id.tourGuide_Imageview);

        }


    }
}
