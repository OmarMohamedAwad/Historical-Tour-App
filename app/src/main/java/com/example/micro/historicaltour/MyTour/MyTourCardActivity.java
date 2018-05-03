package com.example.micro.historicaltour.MyTour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.micro.historicaltour.HomeActivity;
import com.example.micro.historicaltour.R;

public class MyTourCardActivity extends AppCompatActivity {
    CardView selected_hotels_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__tour__card);

        selected_hotels_card=(CardView)findViewById(R.id.myhotels_card) ;
        selected_hotels_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyTourCardActivity.this, SelectedHotelsListActivity.class);
                startActivity(i);
            }
        });




    }
}
