package com.example.micro.historicaltour.hotels;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.micro.historicaltour.Classes.classes.hotelClass;
import com.example.micro.historicaltour.MyTour.SelectedHotelsListActivity;
import com.example.micro.historicaltour.PlaceDetailsActivity;
import com.example.micro.historicaltour.PlacesListActivity;
import com.example.micro.historicaltour.R;

import java.util.ArrayList;

/**
 * Created by micro on 15/04/2018.
 */

public class hotelListviewAdapter extends ArrayAdapter<hotelClass> {
    private int backgrouncolor;


    public hotelListviewAdapter(Context context, ArrayList<hotelClass> hotels) {
        super(context, 0, hotels);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hotel_special_layout, parent, false);
        }
        final hotelClass currenthotel = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.name_hotels_textView);
        TextView descriptions = (TextView) listItemView.findViewById(R.id.description_hotels_textView);
        TextView experinse = (TextView) listItemView.findViewById(R.id.experinse_textView);
        TextView RATE = (TextView) listItemView.findViewById(R.id.rate_hotels_textView);

        name.setText(currenthotel.getName());
        descriptions.setText(currenthotel.getDescrption());
        experinse.setText("have"+" "+currenthotel.getExeprience()+" "+"years of experinse");


        return listItemView;


    }
}