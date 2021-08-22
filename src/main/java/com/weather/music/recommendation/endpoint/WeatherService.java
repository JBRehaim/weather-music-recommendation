package com.weather.music.recommendation.endpoint;

import com.weather.music.recommendation.model.weather.Climate;
import com.weather.music.recommendation.model.weather.ClimateMapper;
import com.weather.music.recommendation.repository.ClimateRepository;
import com.weather.music.recommendation.repository.CloudsRepository;
import com.weather.music.recommendation.repository.CoordinatesRepository;
import com.weather.music.recommendation.repository.SysRepository;
import com.weather.music.recommendation.repository.TemperatureRepository;
import com.weather.music.recommendation.repository.WeatherRepository;
import com.weather.music.recommendation.repository.WindRepository;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Produces;

@Dependent
public class WeatherService {

    @Inject
    @RestClient
    WeatherClientService weatherClientService;

    @Inject
    ClimateMapper mapper;

    @Inject
    ClimateRepository climateRepository;

    @Inject
    CloudsRepository cloudsRepository;

    @Inject
    CoordinatesRepository coordinatesRepository;

    @Inject
    SysRepository sysRepository;

    @Inject
    TemperatureRepository temperatureRepository;

    @Inject
    WeatherRepository weatherRepository;

    @Inject
    WindRepository windRepository;


    @Transactional @Produces
    public Climate getCityWeather(String city,String token){

        Climate climate = mapper.climateRequestDTOToClimate(weatherClientService.getByQuery(city, token));
        cloudsRepository.persist(climate.getClouds());
        coordinatesRepository.persist(climate.getLocalization());
        sysRepository.persist(climate.getSys());
        temperatureRepository.persist(climate.getTemperature());
        weatherRepository.persist(climate.getWeather());
        windRepository.persist(climate.getWind());

        climateRepository.persist(climate);
        return climate;
    }

}
