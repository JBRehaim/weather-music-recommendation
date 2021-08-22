package com.weather.music.recommendation.endpoint;

import com.weather.music.recommendation.model.weather.Climate;
import com.weather.music.recommendation.model.weather.ClimateMapper;
import com.weather.music.recommendation.repository.ClimateRepository;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/check-weather")
@Produces(value = { MediaType.APPLICATION_JSON })
@Consumes(value = { MediaType.APPLICATION_JSON })
public class WeatherClientEndpoint {

    @Inject
    @RestClient
    WeatherClientService weatherClientService;

    @Inject
    ClimateMapper mapper;

    @Inject
    ClimateRepository climateRepository;

    @GET
    public Response cityWeather(@QueryParam("city") String city, @HeaderParam("X-Token-Auth") String token){

        Climate climate = mapper.climateRequestDTOToClimate(weatherClientService.getByQuery(city, token));
        climateRepository.persist(climate);
        return Response.ok(climate).build();
    }

}
