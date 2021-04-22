package com.example.weatherapp.viewmodel


import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import com.example.weatherapp.model.entities.Current
import com.example.weatherapp.model.repository.WeatherRepository
import kotlinx.coroutines.launch
import kotlin.Exception

class WeatherViewModel: ViewModel() {
    private val _currentWeather: MutableLiveData<Current> = MutableLiveData()
    val currentWeather: LiveData<Current>
        get() = _currentWeather

    val cityName = MutableLiveData<String>()

    init {
        viewModelScope.launch {
            try {
                _currentWeather.value =  WeatherRepository.getWeatherForCity("Warszawa")
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun getWeather()
    {
        viewModelScope.launch {
            try {
                _currentWeather.value = cityName.value?.let { WeatherRepository.getWeatherForCity(it) }
            } catch (e: Exception) {
                _currentWeather.value?.weather?.get(0)?.icon = "error"
                e.printStackTrace()
            }
        }
    }
}