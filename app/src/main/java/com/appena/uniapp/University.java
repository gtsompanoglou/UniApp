package com.appena.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class University extends AppCompatActivity {
    public Country country;
    public  String msgCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);

        Intent receiveIntent = getIntent();
        String msgCode =  receiveIntent.getStringExtra(intentContents.SECOND_KEY);
        this.msgCode=msgCode;
            if(msgCode.equals("EUGR")){
                Country greece = new Country("Greece", "GR", "http://www.dib.uth.gr", "geo:38.91309966134338, 22.427587681605267?z=160");
                this.country.msgCode=country.msgCode;
                this.country.name=country.name;
                this.country.uriLink=country.uriLink;
                this.country.uriLocation=country.uriLocation;
            }
    }

    public void gotoSite(View view){
        Uri webpage = Uri.parse(this.country.uriLink);
        Intent webIntent = new Intent(Intent.ACTION_VIEW);
        webIntent.setData(webpage);
        if(webIntent.resolveActivity(getPackageManager()) != null){
            startActivity(webIntent);
        }

    }

    public void gotoMap(View view){
        Uri location = Uri.parse(this.country.uriLocation);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        if(mapIntent.resolveActivity(getPackageManager()) != null){
            startActivity(mapIntent);
        }
    }
}//end of class

//                Country greece = new Country("Greece", "GR", "http://www.dib.uth.gr", "geo:38.91309966134338, 22.427587681605267?z=160");
