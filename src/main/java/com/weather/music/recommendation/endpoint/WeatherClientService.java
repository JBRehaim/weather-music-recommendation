package com.weather.music.recommendation.endpoint;
import com.weather.music.recommendation.model.weather.ClimateRequestDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/weather")
@RegisterRestClient(configKey = "open-weather-map")
@Produces(value = { MediaType.APPLICATION_JSON })
@Consumes(value = { MediaType.APPLICATION_JSON })
public interface WeatherClientService {

    @GET
    ClimateRequestDTO getByQuery(@QueryParam("q") String q, @QueryParam("appid") String appid);
}
