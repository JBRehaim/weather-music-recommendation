package com.weather.music.recommendation.repository;

import com.weather.music.recommendation.model.weather.Wind;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WindRepository implements PanacheRepository<Wind> {
}
