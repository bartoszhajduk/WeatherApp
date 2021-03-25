package com.example.weatherapp.viewmodel

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:temp")
fun tempConverter(view: TextView, temp: Double)
{
    view.text = "${temp.toInt()}℃"
}