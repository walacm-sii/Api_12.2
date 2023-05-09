package tests;

import enums.City;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import specs.request.ForecastRequest;
import specs.request.WeatherRequest;
import specs.response.ForecastResponse;
import specs.response.WeatherResponse;

import static io.restassured.RestAssured.given;

public class WeatherTest extends BaseTest {

    @ParameterizedTest
    @EnumSource(City.class)
    public void shouldGetCitiesByName(City city) {
        given()
                .spec(WeatherRequest.getReqSpecWithName(city)).
        when()
                .get().
        then()
                .spec(WeatherResponse.expectCityDetailsToBe(city));
    }

    @ParameterizedTest
    @EnumSource(City.class)
    public void shouldGetCitiesById(City city) {
        given()
                .spec(WeatherRequest.getReqSpecWithId(city)).
        when()
                .get().
        then()
                .spec(WeatherResponse.expectCityDetailsToBe(city));
    }

    @ParameterizedTest
    @EnumSource(City.class)
    public void shouldGetForecastByCityName(City city) {
        given()
                .spec(ForecastRequest.getReqSpecWithName(city)).
        when()
                .get().
        then()
                .spec(ForecastResponse.expectForecastToContainsCityDetails(city));
    }
}
