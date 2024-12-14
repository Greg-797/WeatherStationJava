package com.weatherstation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class WeatherStationTest {

    @Test
    public void testAddWeatherData() {
        WeatherStation station = new WeatherStation();
        WeatherData data = new WeatherData(1, 25.5, 60.0, "San Jose");

        station.addWeatherData(data);
        List<WeatherData> dataList = station.getWeatherData();

        assertEquals(1, dataList.size());
        assertEquals("San Jose", dataList.get(0).getCity());
    }

    @Test
    public void testGetWeatherData() {
        WeatherStation station = new WeatherStation();
        station.addWeatherData(new WeatherData(1, 25.5, 60.0, "San Jose"));
        station.addWeatherData(new WeatherData(2, 30.0, 50.0, "Los Angeles"));

        List<WeatherData> dataList = station.getWeatherData();

        assertEquals(2, dataList.size());
        assertEquals(30.0, dataList.get(1).getTemperature());
    }
}
