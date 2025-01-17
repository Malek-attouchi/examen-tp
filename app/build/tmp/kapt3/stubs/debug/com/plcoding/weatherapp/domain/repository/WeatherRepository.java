package com.plcoding.weatherapp.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/plcoding/weatherapp/domain/repository/WeatherRepository;", "", "getWeatherData", "Lcom/plcoding/weatherapp/domain/util/Resource;", "Lcom/plcoding/weatherapp/domain/weather/WeatherInfo;", "lat", "", "long", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeatherData(double lat, double p1_1663806, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.plcoding.weatherapp.domain.util.Resource<com.plcoding.weatherapp.domain.weather.WeatherInfo>> continuation);
}