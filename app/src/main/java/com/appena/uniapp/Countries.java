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
public  String newMsgCode;

    @Override
    public void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.activity_countries);

        Intent receiveIntent = getIntent();
        String msgCode = receiveIntent.getStringExtra(intentContents.FIRST_KEY);
        this.msgCode=msgCode;
        intentContents.smgCode=this.msgCode;

        if(msgCode.equals("EU")){
            Button but1= (Button)findViewById(R.id.but_country_1);
            but1.setText("Greece");
            Button but2 = (Button)findViewById(R.id.but_2);
            but2.setText("France");
            Button but3 = (Button)findViewById(R.id.but_3);
            but3.setText("Italy");
            Button but4 = (Button)findViewById(R.id.but_4);
            but4.setText("Bulgaria");
        }else if(msgCode.equals("AMR")){
            Button but1= (Button)findViewById(R.id.but_country_1);
            but1.setText("Costa Rica");
            Button but2 = (Button)findViewById(R.id.but_2);
            but2.setText("Mexico");
            Button but3 = (Button)findViewById(R.id.but_3);
            but3.setText("Brazil");
            Button but4 = (Button)findViewById(R.id.but_4);
            but4.setText("Colombia");
            } else if(msgCode.equals("AS")) {
            Button but1 = (Button) findViewById(R.id.but_country_1);
            but1.setText("China");
            Button but2 = (Button) findViewById(R.id.but_2);
            but2.setText("Japan");
            Button but3 = (Button) findViewById(R.id.but_3);
            but3.setText("Taiwan");
            Button but4 = (Button) findViewById(R.id.but_4);
            but4.setText("Korea");
        }else if(msgCode.equals("AF")) {
            Button but1 = (Button) findViewById(R.id.but_country_1);
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

    public void gotoCountry1(View view){
            if(intentContents.smgCode.equals("EU")) {
                Intent intentToGreece = new Intent(this, University.class);
                newMsgCode=msgCode+"GR";
                Button but_country_1 = (Button) findViewById(R.id.but_country_1);
                but_country_1.setText(newMsgCode);
                intentToGreece.putExtra(intentContents.SECOND_KEY,newMsgCode);
                startActivity(intentToGreece);
            }
    }//end of gotoCountry

}//end of class