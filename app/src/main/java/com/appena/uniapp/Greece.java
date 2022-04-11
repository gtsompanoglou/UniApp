package com.appena.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class Greece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greece);
    }

    public void gotoSite(View view){
        String url =  "http://www.dib.uth.gr";
        Uri webpage = Uri.parse(url);
        Intent webIntent = new Intent(Intent.ACTION_VIEW);
        webIntent.setData(webpage);
        if(webIntent.resolveActivity(getPackageManager()) != null){
            startActivity(webIntent);
        }

    }

    public void gotoMap(View view){
        Uri location = Uri.parse("geo:38.91309966134338, 22.427587681605267?z=160");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        if(mapIntent.resolveActivity(getPackageManager()) != null){
            startActivity(mapIntent);
        }
    }
}//end of class