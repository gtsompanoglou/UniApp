package com.appena.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Continents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continents);
    }

    public void switchActivity(View view){
        Intent intentToCountry = new Intent(this,Countries.class);
        startActivity(intentToCountry);
    }


}//end of class