package com.weather.music.recommendation.repository;

import com.weather.music.recommendation.model.weather.Weather;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WeatherRepository implements PanacheRepository<Weather> {
}
