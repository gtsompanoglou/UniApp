package com.appena.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Countries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
    }

    public void switchActivityToGreece(View view) {
        Intent intentToGreece = new Intent(this, Greece.class);
        startActivity(intentToGreece);
    }

}//end of class