package specs.request;

import enums.City;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import providers.UrlProvider;

public class ForecastRequest extends Request {

    private static final String BASE_PATH = UrlProvider.getForecastPartUrl();

    public static RequestSpecification getReqSpecWithName(City city) {
        return new RequestSpecBuilder().
                addParam(CITY, city.getName()).
                build().spec(getBaseSpec(BASE_PATH));
    }
}
