package com.example.weatherapp.model.entities

data class Weather (
        val id: Int,
        val main: String,
        val description: String,
        var icon: String
        )