package specs.response;

import enums.City;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.equalTo;

public class ForecastResponse extends Response {
    public static ResponseSpecification expectForecastToContainsCityDetails(City city) {
        return new ResponseSpecBuilder()
                .expectBody("city.name", equalTo(city.getName()))
                .expectBody("city.id", equalTo(city.getId()))
                .expectBody("city.country", equalTo(city.getCountry()))
                .build().spec(expectStatusCodeToBe(200));
    }
}
