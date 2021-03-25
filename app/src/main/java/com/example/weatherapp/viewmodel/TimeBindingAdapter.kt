package com.example.weatherapp.viewmodel

import android.icu.text.SimpleDateFormat
import android.os.Build
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.databinding.BindingAdapter
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@RequiresApi(Build.VERSION_CODES.N)
@BindingAdapter("app:time")
fun timeConverter(view: TextView, dt: Long)
{
    val date = Date((dt + 3600) * 1000)
    val sdf = SimpleDateFormat("HH:mm a")
    val currentDate: String = sdf.format(date)
    view.text = currentDate
}