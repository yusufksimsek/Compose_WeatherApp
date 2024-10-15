package com.example.compose_weatherapp.api

import retrofit2.http.GET
import retrofit2.http.Query

interface WeaherApi {

    @GET("/v1/current.json")
    suspend fun getWeather(
        @Query("key") apiKey: String,
        @Query("city") city: String
    )
}