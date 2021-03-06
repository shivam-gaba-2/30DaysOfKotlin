package com.shivam.forecastmvvm.ui.weather.future.list

import com.shivam.forecastmvvm.data.provider.UnitProvider
import com.shivam.forecastmvvm.data.repository.ForecastRepository
import com.shivam.forecastmvvm.internal.lazyDeferred
import com.shivam.forecastmvvm.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
