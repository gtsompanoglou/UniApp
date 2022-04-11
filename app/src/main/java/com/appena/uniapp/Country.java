package com.appena.uniapp;

import android.os.Parcelable;

import java.io.Serializable;

public class Country implements Serializable {
    public String name;
    public String msgCode;
    public String uriLink;
    public String uriLocation;

    public Country() {
    }

    public Country(String msgCode, String uriLink, String uriLocation) {
        this.msgCode = msgCode;
        this.uriLink = uriLink;
        this.uriLocation = uriLocation;
    }

    public Country(String name, String msgCode, String uriLink, String uriLocation) {
        this.name = name;
        this.msgCode = msgCode;
        this.uriLink = uriLink;
        this.uriLocation = uriLocation;
    }
}//end of class Country