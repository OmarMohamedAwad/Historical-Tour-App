package com.example.micro.historicaltour.hotels;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.example.micro.historicaltour.Hotels_Details_Fragments.hotels_PlaceVideoFragment;
import com.example.micro.historicaltour.Hotels_Details_Fragments.hotels_available_time_fragment;
import com.example.micro.historicaltour.Hotels_Details_Fragments.hotels_info_fragment;
import com.example.micro.historicaltour.Hotels_Details_Fragments.hotels_location_fragment;
import com.example.micro.historicaltour.Hotels_Details_Fragments.hotels_rating_fragment;
import com.example.micro.historicaltour.Places_Details_Fragment.ViewPagerAdapter;
import com.example.micro.historicaltour.R;

public class Hotels_details_activity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_details_activity);
        tabLayout=(TabLayout)findViewById(R.id.tablayout_id);
        appBarLayout=(AppBarLayout)findViewById(R.id.apppar);
        viewPager=(ViewPager)findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        //add fragments
        adapter.Addfragment(new hotels_info_fragment(),"Info");
        adapter.Addfragment(new hotels_location_fragment(),"Location");
        adapter.Addfragment(new hotels_rating_fragment(),"Ratting");
        adapter.Addfragment(new hotels_available_time_fragment(),"Time");
        adapter.Addfragment(new hotels_PlaceVideoFragment(),"Video");
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
