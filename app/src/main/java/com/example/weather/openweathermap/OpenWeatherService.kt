package com.example.weather.openweathermap

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "6fbc5ce7bb5a3eb9a305b190f42c327a"


interface OpenWeatherService {

    @GET("data/2.5/weather?units=metric&lang=fr")
    fun getWeather(@Query("q") cityName: String,
                   @Query("appid") apiKey: String = API_KEY
    ) : Call<WeatherWrapper>
}