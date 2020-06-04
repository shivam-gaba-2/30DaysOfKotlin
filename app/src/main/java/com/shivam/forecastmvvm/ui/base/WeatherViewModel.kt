package com.shivam.forecastmvvm.ui.base

import androidx.lifecycle.ViewModel
import com.shivam.forecastmvvm.data.provider.UnitProvider
import com.shivam.forecastmvvm.data.repository.ForecastRepository
import com.shivam.forecastmvvm.internal.UnitSystem
import com.shivam.forecastmvvm.internal.lazyDeferred


abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}