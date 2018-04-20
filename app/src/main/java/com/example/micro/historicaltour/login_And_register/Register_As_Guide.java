package com.example.micro.historicaltour.login_And_register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import com.example.micro.historicaltour.R;

public class Register_As_Guide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__as__guide);
        String[] str={"English","Frensh","German",
                "Greek","Polish","Russian","Romanian,Arabic,Farsi,spanish"};

        MultiAutoCompleteTextView mt=(MultiAutoCompleteTextView)
                findViewById(R.id.skills);

        mt.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,str);

        mt.setThreshold(1);
        mt.setAdapter(adp);
    }
}
