package com.shivam.forecastmvvm.data.network.response

import com.google.gson.annotations.SerializedName
import com.shivam.forecastmvvm.data.db.entity.WeatherLocation

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)