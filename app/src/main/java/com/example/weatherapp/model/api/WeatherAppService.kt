package com.example.weatherapp.model.api

import com.example.weatherapp.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.openweathermap.org/data/2.5/weather/"
const val API_KEY = BuildConfig.API_KEY

object WeatherAppService {
    private val retrofit by lazy {
        Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    val api by lazy {
        retrofit.create(WeatherAppApi::class.java)
    }
}