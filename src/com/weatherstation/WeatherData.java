package com.weatherstation;

public class WeatherData {
    private int id;
    private double temperature;
    private double humidity;
    private String city;

    public WeatherData(int id, double temperature, double humidity, String city) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "WeatherData{id=" + id + ", temperature=" + temperature +
                ", humidity=" + humidity + ", city='" + city + "'}";
    }
}
