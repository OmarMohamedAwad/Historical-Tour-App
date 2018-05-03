package com.example.micro.historicaltour;

import android.app.LoaderManager;
import android.content.Intent;
import android.content.Loader;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.micro.historicaltour.Classes.classes.governorateClass;
import com.example.micro.historicaltour.Classes.classes.placeClass;
import com.example.micro.historicaltour.JsonClasses.PlacesAsyncTask;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class PlacesListActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<placeClass>> {

    governorateClass governorate;
    String placesUrl;
    ListView listView;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_list);

        Intent intent = getIntent();
        governorate = intent.getParcelableExtra("places");

        placesUrl="http://historictour.somee.com/main/GetPlaces/1";



        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byte[] Image = stream.toByteArray();

        ArrayList<byte[]>Images = new ArrayList<>();
        Images.add(Image);

        governorate.setPlaceClasses(new ArrayList<placeClass>());

        ArrayList<placeClass> places = governorate.getPlaceClasses();

        listView = findViewById(R.id.placesListview);


        ConnectivityManager manager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo =manager.getActiveNetworkInfo();

        if(networkInfo!=null && networkInfo.isConnected()){

            LoaderManager loaderManager = getLoaderManager();

            loaderManager.initLoader(1,null,this);

        }
        else {

        }




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(PlacesListActivity.this,PlaceDetailsActivity.class);
                intent.putExtra("place",governorate.getPlaceClasses().get(i));
                startActivity(intent);
            }
        });

    }

    @Override
    public Loader<ArrayList<placeClass>> onCreateLoader(int id, Bundle args) {
        return new PlacesAsyncTask(this,placesUrl);
    }



    @Override
    public void onLoadFinished(Loader<ArrayList<placeClass>> loader, ArrayList<placeClass> data) {

        governorate.setPlaceClasses(data);
        placeListviewAdapter adapter = new placeListviewAdapter(PlacesListActivity.this,data);

        listView.setAdapter(adapter);
    }

    @Override
    public void onLoaderReset(Loader<ArrayList<placeClass>> loader) {

    }
}
