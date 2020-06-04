package com.shivam.forecastmvvm.data.provider

import com.shivam.forecastmvvm.internal.UnitSystem


interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}