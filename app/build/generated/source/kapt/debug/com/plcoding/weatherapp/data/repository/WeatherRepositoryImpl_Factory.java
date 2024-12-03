// Generated by Dagger (https://dagger.dev).
package com.plcoding.weatherapp.data.repository;

import com.plcoding.weatherapp.data.remote.WeatherApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherRepositoryImpl_Factory implements Factory<WeatherRepositoryImpl> {
  private final Provider<WeatherApi> apiProvider;

  public WeatherRepositoryImpl_Factory(Provider<WeatherApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public WeatherRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static WeatherRepositoryImpl_Factory create(Provider<WeatherApi> apiProvider) {
    return new WeatherRepositoryImpl_Factory(apiProvider);
  }

  public static WeatherRepositoryImpl newInstance(WeatherApi api) {
    return new WeatherRepositoryImpl(api);
  }
}