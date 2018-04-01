package com.example.coolweather.gson;

/**
 * Created by SSMutex on 2018/4/1 11:34
 */

public class AQI{
    public AQICity city;

    public class  AQICity{
        public String aqi;
        public String pm25;
    }
}
