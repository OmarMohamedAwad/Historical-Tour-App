package com.example.micro.historicaltour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import com.example.micro.historicaltour.Classes.classes.governorateClass;

public class governoratesActivity extends AppCompatActivity {
    CardView cairo_card;
    ImageView cairo_card_imageview;

    CardView alex_card;
    ImageView alex_card_imageview;

    CardView Aswan_card;
    ImageView Aswan_card_imageview;

    CardView giza_card;
    ImageView giza_card_imageview;

    CardView luxor_card;
    ImageView luxor_card_imageview;

    CardView sohag_card;
    ImageView sohag_card_imageview;

    View.OnClickListener cairo_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            governorateClass governorate = new governorateClass();

            Intent intent =new Intent(governoratesActivity.this,PlacesListActivity.class);
            intent.putExtra("places",governorate);
            startActivity(intent);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_governorates);

        cairo_card = findViewById(R.id.cairo_card);
        cairo_card_imageview = findViewById(R.id.cairo_card_imageview);

        cairo_card.setOnClickListener(cairo_click);
        cairo_card_imageview.setOnClickListener(cairo_click);

    }
}
