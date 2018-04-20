package com.example.micro.historicaltour;

import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.micro.historicaltour.fragment.PlaceVideoFragment;
import com.example.micro.historicaltour.fragment.ViewPagerAdapter;
import com.example.micro.historicaltour.fragment.available_time_fragment;
import com.example.micro.historicaltour.fragment.info_fragment;
import com.example.micro.historicaltour.fragment.location_fragment;
import com.example.micro.historicaltour.fragment.rating_fragment;

public class PlaceDetailsActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_details_activity);

        tabLayout=(TabLayout)findViewById(R.id.tablayout_id);
        appBarLayout=(AppBarLayout)findViewById(R.id.apppar);
        viewPager=(ViewPager)findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        //add fragments
        adapter.Addfragment(new info_fragment(),"Info");
        adapter.Addfragment(new location_fragment(),"Location");
        adapter.Addfragment(new rating_fragment(),"Ratting");
        adapter.Addfragment(new available_time_fragment(),"Time");
        adapter.Addfragment(new PlaceVideoFragment(),"Video");
        // adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        // set icons for tablayouts
        tabLayout.getTabAt(0).setIcon(R.drawable.info);
        tabLayout.getTabAt(1).setIcon(R.drawable.locationicon);
        tabLayout.getTabAt(2).setIcon(R.drawable.review);
        tabLayout.getTabAt(3).setIcon(R.drawable.clock);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_ondemand_video_black_24dp);

    }
}
