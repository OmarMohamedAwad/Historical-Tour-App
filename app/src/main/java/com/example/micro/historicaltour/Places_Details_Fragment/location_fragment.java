package com.example.micro.historicaltour.Places_Details_Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.micro.historicaltour.Maps.MapsActivity;
import com.example.micro.historicaltour.R;

/**
 * Created by micro on 21/03/2018.
 */

public class location_fragment extends android.support.v4.app.Fragment {
    View view;
    Button go_bt;
    public location_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.location_fragment,container,false);
        go_bt=(Button)view.findViewById(R.id.go);
        go_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),MapsActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}

