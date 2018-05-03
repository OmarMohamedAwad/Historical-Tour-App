package com.example.micro.historicaltour.Places_Details_Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by micro on 21/03/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList=new ArrayList<>();
    private final List<String> fragmentListtitles=new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListtitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListtitles.get(position);
    }
    public void Addfragment(Fragment fragment, String Title){
    fragmentList.add(fragment);
    fragmentListtitles.add(Title);

    }
}
