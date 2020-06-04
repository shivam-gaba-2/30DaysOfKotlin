package com.shivam.forecastmvvm.ui.weather.current

import com.shivam.forecastmvvm.data.provider.UnitProvider
import com.shivam.forecastmvvm.data.repository.ForecastRepository
import com.shivam.forecastmvvm.internal.lazyDeferred
import com.shivam.forecastmvvm.ui.base.WeatherViewModel

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}
