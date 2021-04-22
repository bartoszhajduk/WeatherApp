package com.example.weatherapp.model.repository

import com.example.weatherapp.model.api.API_KEY
import com.example.weatherapp.model.api.WeatherAppService
import com.example.weatherapp.model.entities.Current
import com.example.weatherapp.model.entities.Main
import com.example.weatherapp.model.entities.Sys
import retrofit2.awaitResponse

class WeatherRepository {
    companion object {
        suspend fun getWeatherForCity(cityName: String): Current {
            return WeatherAppService.api.getWeatherForCity(cityName, API_KEY,"metric")
                .awaitResponse().body() ?:
                Current(
                    emptyList(),
                    Main(0.0,0.0),
                    0L,
                    Sys(0L,0L),
                    "",
                    0L
                )
        }
    }
}