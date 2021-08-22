package com.weather.music.recommendation.model.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import java.io.Serializable;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ClimateRequestDTO implements Serializable{

    @JsonProperty("coord")
    @Column(name = "localization")
    private ObjectNode localization;

    @JsonProperty("weather")
    @Column(name = "weather")
    private List<ObjectNode> weather;

    @JsonProperty("base")
    private String base;

    @JsonProperty("main")
    private ObjectNode temperature;

    @JsonProperty("visibility")
    private Double visibility;

    @JsonProperty("wind")
    private ObjectNode wind;

    @JsonProperty("clouds")
    private ObjectNode clouds;

    @JsonProperty("dt")
    private String dt;

    @JsonProperty("sys")
    private ObjectNode sys;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cod")
    private String cod;
}
