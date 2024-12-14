package com.weatherstation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherData> weatherDataList = new ArrayList<>();

    public void addWeatherData(WeatherData data) {
        weatherDataList.add(data);
    }

    public List<WeatherData> getWeatherData() {
        return weatherDataList;
    }

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.addWeatherData(new WeatherData(1, 25.5, 60.0, "San Jose"));
        station.addWeatherData(new WeatherData(2, 30.0, 50.0, "Los Angeles"));

        System.out.println("Weather Data:");
        for (WeatherData data : station.getWeatherData()) {
            System.out.println(data);
        }
    }
}
