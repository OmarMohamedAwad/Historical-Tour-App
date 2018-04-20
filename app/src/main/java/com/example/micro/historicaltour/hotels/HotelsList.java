package com.example.micro.historicaltour.hotels;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.micro.historicaltour.R;

import java.util.ArrayList;

public class HotelsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_list);
        final ArrayList<hotel> hotels = new ArrayList<hotel>();




        hotels.add(new hotel(1,"Four Seasons",4,10,4,"https://youtu.be/FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668));
        hotels.add(new hotel(2,"Four Seasons",4,15,4,"https://youtu.be/FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668));
        hotels.add(new hotel(3,"Four Seasons",4,20,4,"https://youtu.be/FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668));
        hotels.add(new hotel(4,"Four Seasons",4,30,4,"https://youtu.be/FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668));
        hotels.add(new hotel(5,"Four Seasons",4,40,4,"https://youtu.be/FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668));
        hotels.add(new hotel(6,"Four Seasons",4,50,4,"https://youtu.be/FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668));
        hotels.add(new hotel(7,"Four Seasons",4,50,4,"https://youtu.be/FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668));


        final ListView ListView = (ListView) findViewById(R.id.hotellist);

        hotel_adapter adapter = new hotel_adapter(this,hotels);
        ListView.setAdapter(adapter);

    }
}
