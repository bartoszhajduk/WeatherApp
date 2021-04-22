package com.example.weatherapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.viewmodel.WeatherViewModel


class MainActivity : AppCompatActivity() {
    private val viewModel by lazy {
        ViewModelProvider(this).get(WeatherViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        if("Bold" == intent.getStringExtra("Theme"))
        {
            theme.applyStyle(R.style.MyAccessibilityProperties, true)
        }
        else if("Normal" == intent.getStringExtra("Theme"))
        {
            setTheme(R.style.Theme_WeatherApp)
        }

        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.title_bar_action, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.accessibility_custom_action &&
                intent.getStringExtra("Theme") != "Bold")
        {
            intent.putExtra("Theme","Bold")
            recreate()
        }
        else
        {
            intent.putExtra("Theme","Normal")
            recreate()
        }
        return super.onOptionsItemSelected(item)
    }
}