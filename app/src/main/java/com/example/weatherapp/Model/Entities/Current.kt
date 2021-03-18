package com.example.weatherapp.Model.Entities

data class Current (
        val weather: List<Weather>,
        val main: Main,
        val dt: Long,
        val sys: Sys,
        val name: String
        )