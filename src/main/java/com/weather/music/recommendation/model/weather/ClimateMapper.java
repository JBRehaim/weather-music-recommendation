package com.weather.music.recommendation.model.weather;


import java.time.LocalDate;

public class ClimateMapper {

    public Climate climateRequestDTOToClimate(ClimateRequestDTO climateRequestDTO){

        Climate climate = Climate.builder()
                .base(climateRequestDTO.getBase())
                .localization(Coordinates.builder()
                        .latitude(climateRequestDTO.getLocalization().get("lat").asText())
                        .longitude(climateRequestDTO.getLocalization().get("lon").asText())
                        .build())
                .weather(climateRequestDTO.getWeather())
                .base(climateRequestDTO.getBase())
                .temperature(Temperature.builder()
                        .temp(climateRequestDTO.getTemperature().get("temp").asDouble())
                        .feelsLike(climateRequestDTO.getTemperature().get("feels_like").asDouble())
                        .tempMin(climateRequestDTO.getTemperature().get("temp_min").asDouble())
                        .tempMax(climateRequestDTO.getTemperature().get("temp_max").asDouble())
                        .pressure(climateRequestDTO.getTemperature().get("pressure").asDouble())
                        .humidity(climateRequestDTO.getTemperature().get("humidity").asDouble())
                        .seaLevel(climateRequestDTO.getTemperature().get("sea_level").asDouble())
                        .groundLevel(climateRequestDTO.getTemperature().get("grnd_level").asDouble())
                        .build())
                .visibility(climateRequestDTO.getVisibility())
                .wind(Wind.builder()
                        .speed(climateRequestDTO.getWind().get("speed").asDouble())
                        .deg(climateRequestDTO.getWind().get("deg").asDouble())
                        .gust(climateRequestDTO.getWind().get("gust").asDouble())
                        .build())
                .clouds(Clouds.builder().all(climateRequestDTO.getClouds().asText()).build())
                .dt(LocalDate.parse(climateRequestDTO.getDt()))
                .sys(Sys.builder()
                        .country(climateRequestDTO.getSys().get("country").asText())
                        .sunrise(climateRequestDTO.getSys().get("sunrise").asText())
                        .sunset(climateRequestDTO.getSys().get("sunset").asText())
                        .build())
                .timezone(climateRequestDTO.getTimezone())
                .searchId(climateRequestDTO.getId())
                .name(climateRequestDTO.getName())
                .cod(climateRequestDTO.getCod())
                .build();


        return climate;
    }
}
