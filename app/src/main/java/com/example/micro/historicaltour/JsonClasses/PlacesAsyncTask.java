package com.example.micro.historicaltour.JsonClasses;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import com.example.micro.historicaltour.Classes.classes.placeClass;

import java.util.ArrayList;

public class PlacesAsyncTask extends AsyncTaskLoader<ArrayList<placeClass>> {

    String url;
    public PlacesAsyncTask(Context context, String url) {
        super(context);
        this.url=url;
    }

    @Override
    protected void onStartLoading() {
        Log.v("tag ","Loader Started");
        forceLoad();
    }

    @Override
    public ArrayList<placeClass> loadInBackground() {
        Log.v("tag ","Loader In Background");
        if(url==null){
            return null;
        }

        ArrayList<placeClass> dd= JsonClass.fetchPlacesData(url);
        return dd;
    }
}
