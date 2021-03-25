package com.example.weatherapp.viewmodel

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.weatherapp.R
import com.example.weatherapp.model.api.IconPairs

@BindingAdapter("app:image")
fun imageConverter(view: ImageView, image: String?)
{
    if(image.isNullOrBlank())
    {
        view.setImageResource(R.drawable.ic_error_24px)
        return
    }
    for(each in IconPairs.pairs)
    {
        if(each.first == image)
        {
            view.setImageResource(each.second)
            return
        }
    }
}