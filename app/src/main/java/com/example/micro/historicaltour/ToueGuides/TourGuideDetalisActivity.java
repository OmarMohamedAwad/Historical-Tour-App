package com.example.micro.historicaltour.ToueGuides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.micro.historicaltour.Classes.classes.tourguideClass;
import com.example.micro.historicaltour.R;

public class TourGuideDetalisActivity extends AppCompatActivity {

    private TextView tourGuideName;
    private TextView tourGuideExperiance;
    private TextView tourGuideRate;
    private EditText tourGuideEmail;
    private EditText tourGuidePhone;
    private EditText tourGuideAddress;
    private EditText tourGuideUnivarsity;
    private EditText tourGuideLanguage;
    tourguideClass tourguide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_guide_detalis_activity);

        Intent intent = getIntent();
        tourguide = intent.getParcelableExtra("tourGuides");


        tourGuideName = (TextView) findViewById(R.id.tourguide_name_textview);
        tourGuideExperiance=(TextView)findViewById(R.id.tourguide_experince_number_textview);
        tourGuideRate = (TextView)findViewById(R.id.tourguide_rate_number_rate);

        tourGuideEmail = (EditText) findViewById(R.id.tourguide_email_editview);
        tourGuidePhone= (EditText) findViewById(R.id.tourguide_phone_editview);
        tourGuideAddress=(EditText)findViewById(R.id.tourguide_address_editview);
        tourGuideUnivarsity=(EditText)findViewById(R.id.tourguide_university_editview);
        tourGuideLanguage=(EditText)findViewById(R.id.tourguide_language_editview);

        tourGuideName.setText(tourguide.getName().toString());

        String experience = ""+tourguide.getExperience();
        tourGuideExperiance.setText(experience);

        String rate =""+tourguide.getRate();
        tourGuideRate.setText(rate);
        tourGuideEmail.setText(tourguide.getEmail().toString());

        tourGuidePhone.setText(tourguide.getPhone().toString());
        tourGuideAddress.setText(tourguide.getAddress().toString());

        tourGuideUnivarsity.setText(tourguide.getUniversity().toString());
        tourGuideLanguage.setText((CharSequence) tourguide.getLanguages().toString());
    }
}
