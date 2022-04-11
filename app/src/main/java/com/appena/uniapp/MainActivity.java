package com.appena.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchActivity(View view){
        Intent intentToContinent = new Intent(this, Continents.class);
        startActivity(intentToContinent);
    }

    public void exitButton(View view) {
        finish();
    }



}//end of class