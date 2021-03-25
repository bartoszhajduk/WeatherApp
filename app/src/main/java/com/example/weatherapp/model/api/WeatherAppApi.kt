package com.example.weatherapp.model.api

import com.example.weatherapp.model.entities.Current
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAppApi {
    @GET(".")
    fun getWeatherForCity(@Query("q") cityName: String,
                          @Query("appid") appid: String,
                          @Query("units") units: String
    ): Call<Current>
}