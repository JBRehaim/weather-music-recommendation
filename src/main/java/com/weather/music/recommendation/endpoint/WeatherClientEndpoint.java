package com.weather.music.recommendation.endpoint;

import com.weather.music.recommendation.model.weather.Climate;
import com.weather.music.recommendation.model.weather.ClimateMapper;
import com.weather.music.recommendation.model.weather.Coordinates;
import com.weather.music.recommendation.repository.ClimateRepository;
import com.weather.music.recommendation.repository.CloudsRepository;
import com.weather.music.recommendation.repository.CoordinatesRepository;
import com.weather.music.recommendation.repository.SysRepository;
import com.weather.music.recommendation.repository.TemperatureRepository;
import com.weather.music.recommendation.repository.WeatherRepository;
import com.weather.music.recommendation.repository.WindRepository;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.beans.Transient;

@Path("/check-weather")
@Produces(value = { MediaType.APPLICATION_JSON })
@Consumes(value = { MediaType.APPLICATION_JSON })
public class WeatherClientEndpoint {

    @Inject
    WeatherService weatherService;

    @GET
    public Response cityWeather(@QueryParam("city") String city, @HeaderParam("X-Token-Auth") String token){
        return Response.ok(weatherService.getCityWeather(city, token)).build();
    }

}
