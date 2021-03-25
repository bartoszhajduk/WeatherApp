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
@BindingAdapter("app:date")
fun dateConverter(view: TextView, dt: Long)
{
    val date = Date((dt + 3600) * 1000)
    val sdf = SimpleDateFormat("dd.MM\nHH:mm a")
    val currentDate: String = sdf.format(date)

    view.text = currentDate
}