package com.example.micro.historicaltour.ToueGuides;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.micro.historicaltour.R;

import java.util.ArrayList;

public class TourGuidesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguides);

        ArrayList<tourClass> tourGuides = new ArrayList<>();

        tourGuides.add(new tourClass(1,"Ahmed Fetoh",4.5,"yasser.ali@tour.com",R.drawable.tourguide,"Mansoura"));
        tourGuides.add(new tourClass(1,"Mohmed Mahkloof",4.5,"yasser.ali@tour.com",R.drawable.tourguide,"Mansoura"));
        tourGuides.add(new tourClass(1,"yasser engar",4.5,"yasser.ali@tour.com",R.drawable.tourguide,"Mansoura"));
        tourGuides.add(new tourClass(1,"Omar awad",4.5,"yasser.ali@tour.com",R.drawable.tourguide,"Mansoura"));
        tourGuides.add(new tourClass(1,"yasser awad",4.5,"yasser.ali@tour.com",R.drawable.tourguide,"Mansoura"));
        tourGuides.add(new tourClass(1,"yasser awad",4.5,"yasser.ali@tour.com",R.drawable.tourguide,"Mansoura"));
        tourGuides.add(new tourClass(1,"yasser awad",4.5,"yasser.ali@tour.com",R.drawable.tourguide,"Mansoura"));
        tourGuides.add(new tourClass(1,"yasser awad",4.5,"yasser.ali@tour.com",R.drawable.tourguide,"Mansoura"));
        tourGuides.add(new tourClass(1,"yasser awad",4.5,"yasser.ali@tour.com",R.drawable.tourguide,"Mansoura"));
        tourGuides.add(new tourClass(1,"yasser awad",4.5,"yasser.ali@tour.com",R.drawable.tourguide,"Mansoura"));

        ListView listView = findViewById(R.id.tourGuidesListview);

        tourGuidesListviewAdapter adapter = new tourGuidesListviewAdapter(TourGuidesActivity.this,tourGuides );

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(TourGuidesActivity.this,TourGuideDetalisActivity.class);
                startActivity(intent);
            }
        });

    }
}
