package com.weather.music.recommendation.model.weather;

import com.weather.music.recommendation.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Entity
@Table(name = "WEATHER_QUERIES")
public class Climate implements Serializable{

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "USER")
    @ManyToOne
    private User user;

    @JoinColumn(name = "LOCALIZATION")
    @OneToOne
    private Coordinates localization;

    @JoinColumn(name = "WEATHER")
    @OneToMany
    private List<Weather> weather;

    @Column(name = "BASE")
    private String base;

    @JoinColumn(name = "TEMPERATURE")
    @OneToOne
    private Temperature temperature;

    @Column(name = "VISIBILITY")
    private Double visibility;

    @JoinColumn(name = "WIND")
    @OneToOne
    private Wind wind;

    @JoinColumn(name = "CLOUDS")
    @OneToOne
    private Clouds clouds;

    @Column(name = "SEARCH_DATE")
    private String dt;

    @JoinColumn(name = "SYSTEM_INFO")
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
