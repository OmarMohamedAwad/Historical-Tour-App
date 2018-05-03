package com.example.micro.historicaltour.hotels;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.micro.historicaltour.Classes.classes.UserClass;
import com.example.micro.historicaltour.Classes.classes.hotelClass;
import com.example.micro.historicaltour.Classes.classes.reviewClass;
import com.example.micro.historicaltour.Classes.classes.timeClass;
import com.example.micro.historicaltour.R;

import java.util.ArrayList;
import java.util.Date;

public class HotelsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        hotelClass hoteldata;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_list);
        final ArrayList<hotelClass> hotels = new ArrayList<hotelClass>();



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
        user.setName("Ahmed fetoh");
        user.setUserName("Ahmedfetoh2018");

        Date date = new Date();


        ArrayList<reviewClass> reviews = new ArrayList<>();
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));
        reviews.add(new reviewClass(user,(float) 4.5,"This Place Is an Amazing Place ,I will Visit it again for sure", date));



        hotels.add(new hotelClass(2,"Four Seasons",4,15,4,"FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668,WorkingDays,reviews,"Four Seasons Hotel Alexandria at San Stefano invites you to discover another side of Egypt in a fresh and fashionable resort-style enclave, where Mediterranean breezes mingle with the energy and movement of a dynamic seaport."));
        hotels.add(new hotelClass(3,"Four Seasons",4,20,4,"FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668,WorkingDays,reviews,"Four Seasons Hotel Alexandria at San Stefano invites you to discover another side of Egypt in a fresh and fashionable resort-style enclave, where Mediterranean breezes mingle with the energy and movement of a dynamic seaport."));
        hotels.add(new hotelClass(4,"Four Seasons",4,30,4,"FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668,WorkingDays,reviews,"Four Seasons Hotel Alexandria at San Stefano invites you to discover another side of Egypt in a fresh and fashionable resort-style enclave, where Mediterranean breezes mingle with the energy and movement of a dynamic seaport."));
        hotels.add(new hotelClass(5,"Four Seasons",4,40,4,"FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668,WorkingDays,reviews,"Four Seasons Hotel Alexandria at San Stefano invites you to discover another side of Egypt in a fresh and fashionable resort-style enclave, where Mediterranean breezes mingle with the energy and movement of a dynamic seaport."));
        hotels.add(new hotelClass(6,"Four Seasons",4,50,4,"FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668,WorkingDays,reviews,"Four Seasons Hotel Alexandria at San Stefano invites you to discover another side of Egypt in a fresh and fashionable resort-style enclave, where Mediterranean breezes mingle with the energy and movement of a dynamic seaport."));
        hotels.add(new hotelClass(7,"Four Seasons",4,50,4,"FPRELc-cXqg","Four Seasons Alexandria | Best Rate & Service Guaranteed",31.2456,29.9668,WorkingDays,reviews,"Four Seasons Hotel Alexandria at San Stefano invites you to discover another side of Egypt in a fresh and fashionable resort-style enclave, where Mediterranean breezes mingle with the energy and movement of a dynamic seaport."));


        final ListView ListView = (ListView) findViewById(R.id.hotellist);

        hotelListviewAdapter adapter = new hotelListviewAdapter(this,hotels);
        ListView.setAdapter(adapter);


        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(HotelsListActivity.this,Hotels_details_activity.class);
                intent.putExtra("hotel",hotels.get(i));
                startActivity(intent);
            }
        });


    }
}
