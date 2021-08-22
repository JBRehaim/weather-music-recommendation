package com.weather.music.recommendation.model.weather;

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
@Table(name = "SYSTEM_INFO")
public class Sys implements Serializable {

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SEARCH_ID")
    private String  id;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "SUNRISE")
    private String sunrise;

    @Column(name = "SUNSET")
    private String sunset;

}
