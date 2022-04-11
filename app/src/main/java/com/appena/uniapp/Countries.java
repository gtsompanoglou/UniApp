package com.appena.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Countries extends AppCompatActivity {

public  String msgCode;

    @Override
    public void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.activity_countries);

        Intent receiveIntent = getIntent();
        String msgCode = receiveIntent.getStringExtra("com.appena.uniapp");
        this.msgCode=msgCode;

        if(msgCode.equals("EU")){
            Button but1= (Button)findViewById(R.id.but_1);
            but1.setText("Greece");
            Button but2 = (Button)findViewById(R.id.but_2);
            but2.setText("France");
            Button but3 = (Button)findViewById(R.id.but_3);
            but3.setText("Italy");
            Button but4 = (Button)findViewById(R.id.but_4);
            but4.setText("Bulgaria");
        }else if(msgCode.equals("AMR")){
            Button but1= (Button)findViewById(R.id.but_1);
            but1.setText("Costa Rica");
            Button but2 = (Button)findViewById(R.id.but_2);
            but2.setText("Mexico");
            Button but3 = (Button)findViewById(R.id.but_3);
            but3.setText("Brazil");
            Button but4 = (Button)findViewById(R.id.but_4);
            but4.setText("Colombia");
            } else if(msgCode.equals("AS")) {
            Button but1 = (Button) findViewById(R.id.but_1);
            but1.setText("China");
            Button but2 = (Button) findViewById(R.id.but_2);
            but2.setText("Japan");
            Button but3 = (Button) findViewById(R.id.but_3);
            but3.setText("Taiwan");
            Button but4 = (Button) findViewById(R.id.but_4);
            but4.setText("Korea");
        }else if(msgCode.equals("AF")) {
            Button but1 = (Button) findViewById(R.id.but_1);
            but1.setText("Kenya");
            Button but2 = (Button) findViewById(R.id.but_2);
            but2.setText("Egypt");
            Button but3 = (Button) findViewById(R.id.but_3);
            but3.setText("Libya");
            Button but4 = (Button) findViewById(R.id.but_4);
            but4.setText("Israel");
        }else {
               TextView textView =(TextView)findViewById(R.id.outputText);
               textView.setText(msgCode);
            }
    }

/*
    public void switchActivityToGreece(View view) {
        Country greece = new Country("Greece","GR","http://www.dib.uth.gr","geo:38.91309966134338, 22.427587681605267?z=160");
        Intent intentToGreece = new Intent(this, University.class);
        startActivity(intentToGreece);
    }
*/
    public void gotoCountry1(View view){ //edo erxontai oles oi xores apo to proto koympi
            if(this.msgCode.equals("EU")) {//ara irthe apo tin ellada
                Country greece = new Country("Greece", "GR", "http://www.dib.uth.gr", "geo:38.91309966134338, 22.427587681605267?z=160");
                Intent intentToGreece = new Intent(this, University.class);
                intentToGreece.putExtra("com.appena.uniapp",greece);
                startActivity(intentToGreece);
            }//allios costa rica kai meta country2 sinartisi
    }//end of gotoCountry

}//end of class