package com.example.micro.historicaltour;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.Date;

import com.example.micro.historicaltour.Classes.classes.UserClass;
import com.example.micro.historicaltour.Classes.classes.governorateClass;
import com.example.micro.historicaltour.Classes.classes.placeClass;
import com.example.micro.historicaltour.Classes.classes.reviewClass;
import com.example.micro.historicaltour.Classes.classes.timeClass;

import java.io.ByteArrayOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class PlacesListActivity extends AppCompatActivity {

    governorateClass governorate;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_list);

        Intent intent = getIntent();
        governorate = intent.getParcelableExtra("places");


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byte[] Image = stream.toByteArray();

        ArrayList<byte[]>Images = new ArrayList<>();
        Images.add(Image);

        governorate.setPlaceClasses(new ArrayList<placeClass>());

        ArrayList<placeClass> places = governorate.getPlaceClasses();

        ArrayList<timeClass> WorkingDays = new ArrayList<>();
        WorkingDays.add(new timeClass(10,22));
        WorkingDays.add(new timeClass(10,22));
        WorkingDays.add(new timeClass(10,22));
        WorkingDays.add(new timeClass(10,22));
        WorkingDays.add(new timeClass(10,22));
        WorkingDays.add(new timeClass(10,22));
        WorkingDays.add(null);

        UserClass user = new UserClass();
        user.setID(1);
        user.setName("Yasser Mohamed");
        user.setUserName("Yasser ELNagar");

        Date date = new Date();


        ArrayList<reviewClass> reviews = new ArrayList<>();
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));

        places.add(new placeClass(1,"Cairo Museum",4.9,"wjWzj3gq1qk",Images,"here is some description about the museum","Cairo",(float) 77.037692,(float)38.898648,WorkingDays,reviews));
        places.add(new placeClass(1,"Cairo Museum",4.9,"wjWzj3gq1qk",Images,"here is some description about the museum","Cairo",(float) 77.037692,(float)38.898648,WorkingDays,reviews));
        places.add(new placeClass(1,"Cairo Museum",4.9,"wjWzj3gq1qk",Images,"here is some description about the museum","Cairo",(float) 77.037692,(float)38.898648,WorkingDays,reviews));
        places.add(new placeClass(1,"Cairo Museum",4.9,"wjWzj3gq1qk",Images,"here is some description about the museum","Cairo",(float) 77.037692,(float)38.898648,WorkingDays,reviews));
        places.add(new placeClass(1,"Cairo Museum",4.9,"9NTnSCiu1HQ",Images,"here is some description about the museum","Cairo",(float) 77.037692,(float)38.898648,WorkingDays,reviews));
        places.add(new placeClass(1,"Cairo Museum",4.9,"9NTnSCiu1HQ",Images,"here is some description about the museum","Cairo",(float) 77.037692,(float)38.898648,WorkingDays,reviews));
        places.add(new placeClass(1,"Cairo Museum",4.9,"9NTnSCiu1HQ",Images,"here is some description about the museum","Cairo",(float) 77.037692,(float)38.898648,WorkingDays,reviews));

        ListView listView = findViewById(R.id.placesListview);


        placeListviewAdapter adapter = new placeListviewAdapter(PlacesListActivity.this,places);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(PlacesListActivity.this,PlaceDetailsActivity.class);
                intent.putExtra("place",governorate.getPlaceClasses().get(i));
                startActivity(intent);
            }
        });

    }
}
