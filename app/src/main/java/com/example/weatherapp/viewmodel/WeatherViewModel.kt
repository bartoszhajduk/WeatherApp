package com.example.weatherapp.viewmodel

import androidx.lifecycle.*
import com.example.weatherapp.model.entities.Current
import com.example.weatherapp.model.repository.WeatherRepository
import kotlinx.coroutines.launch

class WeatherViewModel: ViewModel() {
    private val _currentWeather: MutableLiveData<Current> = MutableLiveData()
    val currentWeather: LiveData<Current>
        get() = _currentWeather

    val cityName = MutableLiveData<String>()

    fun getWeather()
    {
        viewModelScope.launch {
            _currentWeather.value = cityName.value?.let { WeatherRepository.getWeatherForCity(it) }
        }
    }
}