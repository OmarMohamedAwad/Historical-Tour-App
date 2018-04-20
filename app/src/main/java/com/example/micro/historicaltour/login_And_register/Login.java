package com.example.micro.historicaltour.login_And_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.micro.historicaltour.HomeActivity;
import com.example.micro.historicaltour.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn_login=(Button)findViewById(R.id.login);
        Button btn_touriste=(Button)findViewById(R.id.touristbtn);
        Button btn_guide=(Button)findViewById(R.id.guidebtn);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(Login.this,HomeActivity.class);
               startActivity(i);
            }
        });

        btn_touriste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,Register_As_Touriste.class);
                startActivity(i);
            }
        });

        btn_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,Register_As_Guide.class);
                startActivity(i);
            }
        });


    }
}
