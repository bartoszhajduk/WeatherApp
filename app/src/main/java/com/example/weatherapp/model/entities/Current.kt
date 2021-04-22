package com.example.weatherapp.model.entities

data class Current (
        val weather: List<Weather>,
        val main: Main,
        val dt: Long,
        val sys: Sys,
        val name: String,
        val timezone: Long
        )
