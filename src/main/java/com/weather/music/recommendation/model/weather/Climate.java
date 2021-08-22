package com.weather.music.recommendation.model.weather;

import com.weather.music.recommendation.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "WEATHER_QUERIES")
public class Climate implements Serializable{

    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER")
    @OneToMany
    private User user;

    @Column(name = "LOCALIZATION")
    @OneToOne
    private Coordinates localization;

    @Column(name = "WEATHER")
    @ManyToOne
    private List<Weather> weather;

    @Column(name = "BASE")
    private String base;

    @Column(name = "TEMPERATURE")
    @OneToOne
    private Temperature temperature;

    @Column(name = "VISIBILITY")
    private Double visibility;

    @Column(name = "WIND")
    @OneToOne
    private Wind wind;

    @Column(name = "CLOUDS")
    @OneToOne
    private Clouds clouds;

    @Column(name = "SEARCH_DATE")
    private LocalDate dt;

    @Column(name = "SYSTEM_INFO")
    @OneToOne
    private Sys sys;

    @Column(name = "TIMEZONE")
    private String timezone;

    @Column(name = "SEARCH_ID")
    private String searchId;

    @Column(name = "CITY_NAME")
    private String name;

    @Column(name = "CITY_COD")
    private String cod;
}
