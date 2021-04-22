package com.example.weatherapp.viewmodel

import android.icu.text.SimpleDateFormat
import android.os.Build
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.databinding.BindingAdapter
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import java.time.OffsetTime
import java.util.*

@RequiresApi(Build.VERSION_CODES.N)
@BindingAdapter("app:dt")
fun dateConverter(view: TextView, dt: Long)
{
    val date = Date(dt * 1000)
    val local = Locale("pl","PL")
    val sdf = SimpleDateFormat("HH:mm  dd.MM", local)
    val currentDate: String = sdf.format(date)

    view.text = currentDate
}