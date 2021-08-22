package com.weather.music.recommendation.model.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "WEATHER")
public class Weather implements Serializable {

    @Column(name = "SEARCH_ID")
    private Long id;

    @Column(name = "MAIN")
    private String main;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ICON_ID")
    private String icon;
}
