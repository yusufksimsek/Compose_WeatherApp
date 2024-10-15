package com.example.compose_weatherapp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.compose_weatherapp.api.Constant
import com.example.compose_weatherapp.api.RetrofitInstance
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    private val weatherApi = RetrofitInstance.weatherApi
    fun getData(city: String){
        viewModelScope.launch {
            val response = weatherApi.getWeather(Constant.apiKey,city)
            if(response.isSuccessful){
                Log.i("Response: ", response.body().toString())
            }else {
                Log.i("Error: ", response.message())
            }
        }
    }

}