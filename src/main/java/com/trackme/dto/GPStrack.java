package com.trackme.dto;

import java.io.Serializable;

/**
 * Created by promod on 4/4/2018.
 */
public class GPStrack implements Serializable {
    private String userName;
    private String Lati;
    private String Longt;

    public GPStrack(String userName, String lati, String longt) {
        this.userName = userName;
        Lati = lati;
        Longt = longt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLati() {
        return Lati;
    }

    public void setLati(String lati) {
        Lati = lati;
    }

    public String getLongt() {
        return Longt;
    }

    public void setLongt(String longt) {
        Longt = longt;
    }
}
