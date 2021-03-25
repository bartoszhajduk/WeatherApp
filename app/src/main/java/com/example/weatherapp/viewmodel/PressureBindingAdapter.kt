package com.example.weatherapp.viewmodel

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:pressure")
fun pressureConverter(view: TextView, pressure: Double)
{
    view.text = "${pressure.toInt()} hPa"
}