package com.example.compose_weatherapp

import android.util.Log
import androidx.lifecycle.ViewModel

class WeatherViewModel : ViewModel() {

    fun getData(city: String){
        Log.i("city name",city)
    }

}