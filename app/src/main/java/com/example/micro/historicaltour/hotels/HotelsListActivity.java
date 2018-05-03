package com.example.micro.historicaltour.hotels;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.micro.historicaltour.Classes.classes.UserClass;
import com.example.micro.historicaltour.Classes.classes.hotelClass;
import com.example.micro.historicaltour.Classes.classes.reviewClass;
import com.example.micro.historicaltour.Classes.classes.timeClass;
import com.example.micro.historicaltour.MyTour.SelectedHotelsListActivity;
import com.example.micro.historicaltour.R;

import java.util.ArrayList;
import java.util.Date;

public class HotelsListActivity extends AppCompatActivity {
    final ArrayList<hotelClass> hotels = new ArrayList<hotelClass>();
     public static ArrayList <hotelClass> selectedhotels;
    hotelListviewAdapter adapter;


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        switch (item.getItemId())
        {
            case R.id.add:
                SelectedHotelsListActivity.selectedhotels=selectedhotels;
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
    protected void onDestroy() {

        SelectedHotelsListActivity.selectedhotels=selectedhotels;
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        hotelClass hoteldata;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_list);



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

         adapter = new hotelListviewAdapter(this,hotels);
        ListView.setAdapter(adapter);

         selectedhotels=new ArrayList<>();

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,final int i, long l) {



                ImageView place_hotels_Imageview=view.findViewById(R.id.place_hotels_Imageview);

                ImageView addbtn=(ImageView)view.findViewById(R.id.addbtn);



                place_hotels_Imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        AlertDialog.Builder builder =new AlertDialog.Builder(HotelsListActivity.this);

                        builder.setMessage("Do you want to delete this item ?");

                        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });

                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });


                        AlertDialog dialog =builder.create();

                        dialog.show();

                    }
                });

                addbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        AlertDialog.Builder builder =new AlertDialog.Builder(HotelsListActivity.this);

                        builder.setMessage("Do you want to delete this item ?");

                        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });

                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                selectedhotels.add(hotels.get(i));
                                dialog.dismiss();
                                Toast.makeText(HotelsListActivity.this,"This Item has been Added!!",Toast.LENGTH_SHORT);
                            }
                        });


                        AlertDialog dialog =builder.create();

                        dialog.show();



                    }
                });


                Intent intent = new Intent(HotelsListActivity.this,Hotels_details_activity.class);
                intent.putExtra("hotel",hotels.get(i));
                startActivity(intent);

            }
        });



        registerForContextMenu(ListView);




    }

}
