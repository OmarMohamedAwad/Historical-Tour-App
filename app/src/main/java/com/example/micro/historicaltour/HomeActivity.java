package com.example.micro.historicaltour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import com.example.micro.historicaltour.MyTour.MyTourCardActivity;
import com.example.micro.historicaltour.MyTour.SelectedHotelsListActivity;
import com.example.micro.historicaltour.ToueGuides.TourGuidesActivity;
import com.example.micro.historicaltour.hotels.HotelsListActivity;

public class HomeActivity extends AppCompatActivity {
    CardView places_card;
    CardView Tourguide_card;
    CardView media_card;
    CardView my_hotel_card;
    CardView my_tour_card;

    ImageView places_card_imageview;
    ImageView tourguide_card_imageview;

    View.OnClickListener places_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(HomeActivity.this, governoratesActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        places_card = (CardView) findViewById(R.id.places_card);
        my_hotel_card = (CardView) findViewById(R.id.my_hotel_card);
        my_tour_card = (CardView) findViewById(R.id.my_tour_card);

        places_card_imageview = (ImageView) findViewById(R.id.places_card_imageview);
        media_card = (CardView) findViewById(R.id.media_card);
        Tourguide_card = (CardView) findViewById(R.id.tour_guides_card);
        ///this code for handling moving to other activities
        Tourguide_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, TourGuidesActivity.class);
                startActivity(i);
            }
        });
        my_hotel_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, HotelsListActivity.class);
               startActivity(i);
            }
        });



        my_tour_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, MyTourCardActivity.class);
                startActivity(i);
            }
        });


        places_card.setOnClickListener(places_click);
        places_card_imageview.setOnClickListener(places_click);


        //tourClass guides

        ///this code for handling moving to other activities
        View.OnClickListener tourguide_click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeActivity.this, TourGuidesActivity.class);
                startActivity(intent);
            }
        };

        Tourguide_card = (CardView) findViewById(R.id.tour_guides_card);
        tourguide_card_imageview =(ImageView)findViewById(R.id.tour_guides_card_imageview);

        Tourguide_card.setOnClickListener(tourguide_click);
        tourguide_card_imageview.setOnClickListener(tourguide_click);
    }
}
