package com.example.micro.historicaltour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class Places extends AppCompatActivity {
    CardView cairo_card;

    ImageView cairo_card_imageview;

    View.OnClickListener cairo_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent =new Intent(Places.this,PlacesGroupActivity.class);
            startActivity(intent);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_group_activity);

        cairo_card = findViewById(R.id.cairo_card);
        cairo_card_imageview = findViewById(R.id.cairo_card_imageview);

        cairo_card.setOnClickListener(cairo_click);
        cairo_card_imageview.setOnClickListener(cairo_click);

    }
}
