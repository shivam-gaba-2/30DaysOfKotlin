package com.shivam.forecastmvvm.data.network.response

import com.google.gson.annotations.SerializedName
import com.shivam.forecastmvvm.data.db.entity.CurrentWeatherEntry
import com.shivam.forecastmvvm.data.db.entity.WeatherLocation

data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)