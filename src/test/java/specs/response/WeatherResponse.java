package specs.response;

import enums.City;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.*;

public class WeatherResponse extends Response {

    public static ResponseSpecification expectCityDetailsToBe(City city) {
        return new ResponseSpecBuilder()
                .expectBody("id", equalTo(city.getId()))
                .expectBody("name", equalTo(city.getName()))
                .expectBody("sys.country", equalTo(city.getCountry()))
                .expectContentType(ContentType.JSON)
                .build().spec(expectStatusCodeToBe(200));
    }
}
