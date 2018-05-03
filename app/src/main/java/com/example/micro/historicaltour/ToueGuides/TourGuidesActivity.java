package com.example.micro.historicaltour.ToueGuides;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.micro.historicaltour.Classes.classes.UserClass;
import com.example.micro.historicaltour.Classes.classes.hotelClass;
import com.example.micro.historicaltour.Classes.classes.tourguideClass;
import com.example.micro.historicaltour.R;

import java.util.ArrayList;
import java.util.Date;

public class TourGuidesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguides);

        tourguideClass tourguidedata;
        final ArrayList<tourguideClass> tours = new ArrayList<tourguideClass>();

        Date date = new Date();

        ArrayList<String> language = new ArrayList<String>();
        language.add("Arabic");
        language.add("English");

        final ArrayList<tourguideClass> tourGuides = new ArrayList<>();

        tourGuides.add(new tourguideClass(1,"Ahmed Fetoh","AhmedFottoh","12345","AhmedFottoh.ali@tourClass.com",date,"cairo",1,4,(double)4.2,"Mansoura Univarsity","01010986531",language));
        tourGuides.add(new tourguideClass(2,"Omar Awad","omarawad","12345","omarawad.ali@tourClass.com",date,"cairo",1,4,(double)4.2,"Mansoura Univarsity","01010986531",language));
        tourGuides.add(new tourguideClass(3,"yasser elngare","yasser","12345","yasser.ali@tourClass.com",date,"cairo",1,4,(double)4.2,"Mansoura Univarsity","01010986531",language));
        tourGuides.add(new tourguideClass(4,"mohammed mahklof","mahklof","12345","mahklof.ali@tourClass.com",date,"cairo",1,4,(double)4.2,"Mansoura Univarsity","01010986531",language));
        tourGuides.add(new tourguideClass(5,"Omar Awad","AhmedFottoh","12345","AhmedFottoh.ali@tourClass.com",date,"cairo",1,4,(double)4.2,"Mansoura Univarsity","01010986531",language));
        tourGuides.add(new tourguideClass(6,"Ahmed Fetoh","AhmedFottoh","12345","yasser.ali@tourClass.com",date,"cairo",1,4,(double)4.2,"Mansoura Univarsity","01010986531",language));
        tourGuides.add(new tourguideClass(7,"Omar Awad","AhmedFottoh","12345","AhmedFottoh.ali@tourClass.com",date,"cairo",1,4,(double)4.2,"Mansoura Univarsity","01010986531",language));
        tourGuides.add(new tourguideClass(8,"mohammed mahklof","mohammed mahklof","12345","mahklof.ali@tourClass.com",date,"cairo",1,4,(double)4.2,"Mansoura Univarsity","01010986531",language));


        ListView listView = findViewById(R.id.tourGuidesListview);

        tourGuidesListviewAdapter adapter = new tourGuidesListviewAdapter(TourGuidesActivity.this,tourGuides );

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(TourGuidesActivity.this,TourGuideDetalisActivity.class);
                intent.putExtra("tourGuides",tourGuides.get(i));
                startActivity(intent);
            }
        });

    }
}
