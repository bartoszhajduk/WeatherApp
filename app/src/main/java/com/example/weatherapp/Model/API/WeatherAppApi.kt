package com.example.weatherapp.Model.API

import com.example.weatherapp.Model.Entities.Current
import retrofit2.Call
import retrofit2.http.GET

interface WeatherAppApi {
    @GET("?q=gliwice,pl&appid=$API_KEY&units=metric")
    fun getWeatherForCity(): Call<Current>
}