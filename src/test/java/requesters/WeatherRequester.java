package requesters;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import model.weather.WeatherResponse;
import org.springframework.web.client.RestTemplate;

public class WeatherRequester {
    //https://samples.openweathermap.org/data/2.5/weather?id=524901&appid=b1b15e88fa797225412429c1c50c122a1
    private final String PREFIX = "https://samples.openweathermap.org/data/2.5/weather?id=";
    private final String POSTFIX = "&appid=b1b15e88fa797225412429c1c50c122a1";
    public WeatherResponse requestWeather(long cityiD) throws JsonProcessingException {
        String url = PREFIX + cityiD + POSTFIX;

        //Create request and get response in Json
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForEntity(url, String.class).getBody();


        //Transform JSON to Objects (Jaсkson)
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, WeatherResponse.class);


    }
}
