package com.example.micro.historicaltour.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.micro.historicaltour.R;

/**
 * Created by micro on 21/03/2018.
 */

public class info_fragment extends android.support.v4.app.Fragment {
   View view;
    public info_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.info_fragment,container,false);
        return view;
    }
}
