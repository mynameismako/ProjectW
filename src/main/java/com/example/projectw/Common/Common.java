package com.example.projectw.Common;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static String API_KEY = "fec5d3b3ca04f6418e4eabc5da5d65e6";
    public static String API_LINK = "api.openweathermap.org/data/2.5/weather?lat=35&lon=139";

    @NonNull
    public static String apiRequest(String lat, String lng) {
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s%units=metric", lat, lng, API_KEY));
        return sb.toString();
    }

    public static String unixTimeStampToDateTime (double unixTimeStamp){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png\"");
    }

    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
