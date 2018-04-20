package com.example.micro.historicaltour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_list);


        ArrayList<placeClass> places = new ArrayList<>();
        places.add(new placeClass(1,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(2,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(3,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(4,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(5,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(6,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(1,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(2,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(3,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(4,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(5,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));
        places.add(new placeClass(6,"Cairo Museum",4.9,R.drawable.mus,"here is some description about the museum","Cairo"));



        ListView listView = findViewById(R.id.placesListview);

        placeListviewAdapter adapter = new placeListviewAdapter(PlacesGroupActivity.this,places);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(PlacesGroupActivity.this,PlaceDetailsActivity.class);
                startActivity(intent);
            }
        });

    }
}
