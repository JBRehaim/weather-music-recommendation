package com.weather.music.recommendation.repository;

import com.weather.music.recommendation.model.weather.Temperature;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TemperatureRepository implements PanacheRepository<Temperature> {
}
