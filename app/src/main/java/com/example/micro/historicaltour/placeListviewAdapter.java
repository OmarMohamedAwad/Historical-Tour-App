package com.example.micro.historicaltour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by UNKNOWN on 3/21/2018.
 */

public class placeListviewAdapter extends ArrayAdapter {

    ArrayList<placeClass> Places;

    public placeListviewAdapter(@NonNull Context context,ArrayList<placeClass> places) {
        super(context, 0);
        Places=places;
    }

    @Override
    public int getCount() {
        return Places.size();
    }

    @Override
    public Object getItem(int i) {
        return Places.get(i);
    }

    @Override
    public long getItemId(int i) {
        return Places.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        placeClass currentPlace = Places.get(i);

        placeViewholder viewholder ;

        if(view==null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.place_special_layout,null);

            viewholder=new placeViewholder(view);

            view.setTag(viewholder);
        }
        else {
            viewholder= (placeViewholder) view.getTag();
        }

        viewholder.rate.setText((String.valueOf(currentPlace.getRate())));
        viewholder.name.setText((String.valueOf(currentPlace.getName())));
        viewholder.location.setText((String.valueOf(currentPlace.getLocation())));
        viewholder.description.setText((String.valueOf(currentPlace.getDescrption())));
        viewholder.image.setImageResource(currentPlace.getImageId());


        return view;
    }

    public  class placeViewholder{

        TextView rate;
        TextView name;
        TextView location;
        TextView description;
        ImageView image;

        public placeViewholder(View view){

            rate = (TextView) view.findViewById(R.id.rate_textView);
            name = (TextView) view.findViewById(R.id.name_textView);
            location = (TextView) view.findViewById(R.id.location_textView);
            description = (TextView) view.findViewById(R.id.description_textView);
            image =  view.findViewById(R.id.place_Imageview);

        }


    }

}
