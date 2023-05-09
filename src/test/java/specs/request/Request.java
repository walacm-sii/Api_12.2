package specs.request;

import io.restassured.specification.RequestSpecification;
import providers.UrlProvider;

import java.util.Map;

import static io.restassured.RestAssured.given;

abstract public class Request {

    protected static String CITY = "q";

    protected static String ID = "id";

    protected static Map<String, String> getAppIdMap() {
        return Map.of("appid", System.getProperty("appid"));
    }

    protected static RequestSpecification getBaseSpec() {
        return given()
                .baseUri(UrlProvider.getBaseUrl())
                .queryParams(getAppIdMap())
                .log().all();
    }

    protected static RequestSpecification getBaseSpec(String basePath) {
        return getBaseSpec().basePath(basePath);
    }
}