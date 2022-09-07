package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.weather.Main;
import model.weather.Weather;
import model.weather.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.Map;

public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response;

    @Given("city id: {long}")
    public void set_city_id(long cityId) {
        this.cityId = cityId;
    }

    @When("we are requesting weather data")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);
    }

    @Then("coords are:")
    public void check_coords(Map<String, Double> params) {
        Assertions.assertEquals(params.get("lon"), response.getCoord().getLon(), "Wrong lon!");
        Assertions.assertEquals(params.get("lat"), response.getCoord().getLat(), "Wrong lat!");
    }

    @Then("weather is:")
    public void check_weather(Map<String, String> params) {
        Weather weather =response.getWeathers().get(0);
        Assertions.assertEquals(Long.parseLong(params.get("id")), weather.getId(), "Wrong weather id!");
        Assertions.assertEquals(params.get("main"), weather.getMain(), "Wrong weather main!");
        Assertions.assertEquals(params.get("description"), weather.getDescription(), "Wrong description!");
        Assertions.assertEquals(params.get("icon"), weather.getIcon(), "Wrong icon!");
    }

    @Then("base is {string}")
    public void check_base(String base) {
        Assertions.assertEquals(base, response.getBase(), "Wrong base!");
    }

    @Then("main features are:")
    public void check_main_features(Map<String, String> params) {
        Main main = response.getMain();
        Assertions.assertEquals(Double.parseDouble(params.get("temp")), main.getTemp(), "Wrong temp!");
        Assertions.assertEquals(Integer.parseInt(params.get("pressure")), main.getPressure(), "Wrong pressure!");
        Assertions.assertEquals(Integer.parseInt(params.get("humidity")), main.getHumidity(), "Wrong humidity!");
        Assertions.assertEquals(Double.parseDouble(params.get("temp_min")), main.getTempMin(), "Wrong temp_min!");
        Assertions.assertEquals(Double.parseDouble(params.get("temp_max")), main.getTempMax(), "Wrong temp_max!");
    }

    @Then("visibility is {int}")
    public void check_visibility(Integer visibility) {
        Assertions.assertEquals(visibility, response.getVisibility(), "Wrong visibility!");
    }

    @Then("wind is:")
    public void check_wind(Map<String, String> params) {
        Assertions.assertEquals(Double.parseDouble(params.get("speed")), response.getWind().getSpeed(), "Wrong speed!");
        Assertions.assertEquals(Integer.parseInt(params.get("deg")), response.getWind().getDeg(), "Wrong deg!");
    }

    @Then("clouds are:")
    public void check_clouds(Map<String, Long> params) {
        Assertions.assertEquals(params.get("all"), response.getClouds().getAll(), "Wrong all!");
    }

    @Then("dt is {int}")
    public void check_dt(Integer dt) {
        Assertions.assertEquals(dt, response.getDt(), "Wrong dt!");
    }

    @Then("sys are:")
    public void check_sys(Map<String, String> params) {
        Assertions.assertEquals(Integer.parseInt(params.get("type")), response.getSys().getType(), "Wrong type!");
        Assertions.assertEquals(Long.parseLong(params.get("id")), response.getSys().getId(), "Wrong id!");
        Assertions.assertEquals(Double.parseDouble(params.get("message")), response.getSys().getMessage(), "Wrong message!");
        Assertions.assertEquals(params.get("country"), response.getSys().getCountry(), "Wrong country!");
        Assertions.assertEquals(Integer.parseInt(params.get("sunrise")), response.getSys().getSunrise(), "Wrong sunrise!");
        Assertions.assertEquals(Integer.parseInt(params.get("sunset")), response.getSys().getSunset(), "Wrong sunset!");
    }

    @Then("id is {long}")
    public void check_id(Long id) {
        Assertions.assertEquals(id, response.getId(), "Wrong id!");
    }

    @Then("name is {string}")
    public void check_name(String name) {
        Assertions.assertEquals(name, response.getName(), "Wrong name!");
    }

    @Then("cod is {int}")
    public void check_cod(Integer cod) {
        Assertions.assertEquals(cod, response.getCod(), "Wrong cod!");
    }

}
