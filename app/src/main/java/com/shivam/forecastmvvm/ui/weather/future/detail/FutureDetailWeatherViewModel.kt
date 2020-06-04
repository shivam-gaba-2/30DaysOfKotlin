package com.shivam.forecastmvvm.ui.weather.future.detail

import com.shivam.forecastmvvm.data.provider.UnitProvider
import com.shivam.forecastmvvm.data.repository.ForecastRepository
import com.shivam.forecastmvvm.internal.lazyDeferred
import com.shivam.forecastmvvm.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel(
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}
