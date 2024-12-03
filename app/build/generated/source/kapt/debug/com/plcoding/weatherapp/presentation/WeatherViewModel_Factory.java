// Generated by Dagger (https://dagger.dev).
package com.plcoding.weatherapp.presentation;

import com.plcoding.weatherapp.domain.location.LocationTracker;
import com.plcoding.weatherapp.domain.repository.WeatherRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherViewModel_Factory implements Factory<WeatherViewModel> {
  private final Provider<WeatherRepository> repositoryProvider;

  private final Provider<LocationTracker> locationTrackerProvider;

  public WeatherViewModel_Factory(Provider<WeatherRepository> repositoryProvider,
      Provider<LocationTracker> locationTrackerProvider) {
    this.repositoryProvider = repositoryProvider;
    this.locationTrackerProvider = locationTrackerProvider;
  }

  @Override
  public WeatherViewModel get() {
    return newInstance(repositoryProvider.get(), locationTrackerProvider.get());
  }

  public static WeatherViewModel_Factory create(Provider<WeatherRepository> repositoryProvider,
      Provider<LocationTracker> locationTrackerProvider) {
    return new WeatherViewModel_Factory(repositoryProvider, locationTrackerProvider);
  }

  public static WeatherViewModel newInstance(WeatherRepository repository,
      LocationTracker locationTracker) {
    return new WeatherViewModel(repository, locationTracker);
  }
}
