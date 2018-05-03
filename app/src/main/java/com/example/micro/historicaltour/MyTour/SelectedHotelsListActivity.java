package com.example.micro.historicaltour.MyTour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.micro.historicaltour.Classes.classes.UserClass;
import com.example.micro.historicaltour.Classes.classes.hotelClass;
import com.example.micro.historicaltour.Classes.classes.reviewClass;
import com.example.micro.historicaltour.Classes.classes.timeClass;
import com.example.micro.historicaltour.R;
import com.example.micro.historicaltour.hotels.HotelsListActivity;
import com.example.micro.historicaltour.hotels.hotelListviewAdapter;

import java.util.ArrayList;
import java.util.Date;

public class SelectedHotelsListActivity extends AppCompatActivity {
    selected_hotelListviewAdapter adapter;
public static ArrayList<hotelClass>selectedhotels;

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();

        switch (item.getItemId())
        {
            case R.id.add:



                return true;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.add,menu);

    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_hotels_list);


        selectedhotels = HotelsListActivity.selectedhotels;


            if(selectedhotels!=null)
            {
                ListView ListView = (ListView) findViewById(R.id.lis_selected_hotels);

                adapter = new selected_hotelListviewAdapter(this,selectedhotels);
                ListView.setAdapter(adapter);
                registerForContextMenu(ListView);
            }
            else {
                Toast.makeText(SelectedHotelsListActivity.this,"Error",Toast.LENGTH_SHORT);
            }





        }
}
