package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherapp.Model.Entities.Current
import com.example.weatherapp.Model.Repository.WeatherRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.suspendCoroutine

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        GlobalScope.launch {
//            val current = WeatherRepository.getWeatherForCity("Gliwice")
//            println(current.name + " " + current.main.temp )
//        }



    }
}