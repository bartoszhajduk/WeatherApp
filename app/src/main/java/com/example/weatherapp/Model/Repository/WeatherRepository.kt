package com.example.weatherapp.Model.Repository

import com.example.weatherapp.Model.API.WeatherAppService
import com.example.weatherapp.Model.Entities.Current
import com.example.weatherapp.Model.Entities.Main
import com.example.weatherapp.Model.Entities.Sys
import com.example.weatherapp.Model.Entities.Weather
import retrofit2.awaitResponse

class WeatherRepository {
    companion object {
        suspend fun getWeatherForCity(name: String): Current {
            return WeatherAppService.api.getWeatherForCity().awaitResponse().body() ?:
                Current(
                    emptyList(),
                    Main(0.0,0.0),
                    0L,
                    Sys(0L,0L),
                    ""
                )
        }
    }
}