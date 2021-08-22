package com.weather.music.recommendation.model.weather;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "SYSTEM_INFO", schema = "dbo")
public class Sys implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SEARCH_ID")
    private String searchId;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "SUNRISE")
    private String sunrise;

    @Column(name = "SUNSET")
    private String sunset;

}
