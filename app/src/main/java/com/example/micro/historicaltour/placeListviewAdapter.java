package com.example.micro.historicaltour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.micro.historicaltour.Classes.classes.placeClass;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by UNKNOWN on 3/21/2018.
 */

public class placeListviewAdapter extends ArrayAdapter {

    ArrayList<placeClass> Places;

    public placeListviewAdapter(@NonNull Context context, ArrayList<placeClass> places) {
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

        DecimalFormat formatter = new DecimalFormat("0.0");
        String output = formatter.format(currentPlace.getRate());

        viewholder.rate.setText(output);
        viewholder.name.setText((String.valueOf(currentPlace.getName())));
        viewholder.location.setText((String.valueOf(currentPlace.getLocation())));
        viewholder.description.setText((String.valueOf(currentPlace.getDescrption())));

        // display the first image of the place from db
//        if(currentPlace.getImages().get(0)!=null){
//
//            byte[] imageArray =currentPlace.getImages().get(0);
//            ByteArrayInputStream inputStream = new ByteArrayInputStream(imageArray);
//            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
//
//
//            viewholder.image.setImageBitmap(bitmap);
//        }

        viewholder.image.setImageResource(R.drawable.mus);




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
