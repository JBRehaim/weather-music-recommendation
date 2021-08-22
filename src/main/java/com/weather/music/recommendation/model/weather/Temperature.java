package com.weather.music.recommendation.model.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jboss.resteasy.annotations.ClientURI;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "TEMPERATURE")
public class Temperature implements Serializable {

    @Column(name = "CURRENT_TEMPERATURE")
    private Double temp;

    @Column(name = "ATMOSPHERIC_PRESSURE")
    private Double pressure;

    @Column(name = "AIR_HUMIDITY")
    private Double humidity;

    @Column(name = "TEMPERATURE_FEELS_LIKE")
    private Double feelsLike;

    @Column(name = "MINIMUM_TEMPERATURE")
    private Double tempMin;

    @Column(name = "MAXIMUM_TEMPERATURE")
    private Double tempMax;

    @Column(name = "SEA_LEVEL")
    private Double seaLevel;

    @Column(name = "GROUND_LEVEL")
    private Double groundLevel;
}
