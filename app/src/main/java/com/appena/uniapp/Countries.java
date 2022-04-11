package com.appena.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Countries extends AppCompatActivity {
    @Override
    public void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.activity_countries);

        Intent receiveIntent = getIntent();
        String msgCode = receiveIntent.getStringExtra("com.appena.uniapp");
            if(msgCode.equals("AMR")){
                Button but2 = (Button)findViewById(R.id.but_2);
                but2.setText("Mexico");
            }else {
               TextView textView =(TextView)findViewById(R.id.outputText);
               textView.setText(msgCode);

            }

    }


    public void switchActivityToGreece(View view) {
        Intent intentToGreece = new Intent(this, Greece.class);
        startActivity(intentToGreece);
    }

}//end of class