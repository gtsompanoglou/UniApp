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

    public  void switchActPutExtraEurope(View view){
        Intent intentPut = new Intent(this,Countries.class);
        String sndMsgCode ="EU";
        intentPut.putExtra("com.appena.uniapp",sndMsgCode);
        startActivity(intentPut);
    }

    public  void switchActPutExtraAmerica(View view){
        Intent intentPut = new Intent(this,Countries.class);
        String sndMsgCode ="AMR";
        intentPut.putExtra("com.appena.uniapp",sndMsgCode);
        startActivity(intentPut);
    }

    public  void switchActPutExtraAsia(View view){
        Intent intentPut = new Intent(this,Countries.class);
        String sndMsgCode ="AS";
        intentPut.putExtra("com.appena.uniapp",sndMsgCode);
        startActivity(intentPut);
    }
    public  void switchActPutExtraAfrica(View view){
        Intent intentPut = new Intent(this,Countries.class);
        String sndMsgCode ="AF";
        intentPut.putExtra("com.appena.uniapp",sndMsgCode);
        startActivity(intentPut);
    }



}//end of class