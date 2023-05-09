package specs.request;

import enums.City;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import providers.UrlProvider;

import static io.restassured.RestAssured.given;

public class WeatherRequest extends Request {

    private static final String BASE_PATH = UrlProvider.getWeatherPartUrl();

    public static RequestSpecification getReqSpecWithName(City city) {
        return new RequestSpecBuilder().
                addParam(CITY, city.getName()).
                build().spec(getBaseSpec(BASE_PATH));
    }

    public static RequestSpecification getReqSpecWithId(City city) {
        return new RequestSpecBuilder().
                addParam(ID, city.getId()).
                build().spec(getBaseSpec(BASE_PATH));
    }
}
