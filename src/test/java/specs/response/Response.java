package specs.response;

import io.restassured.RestAssured;
import io.restassured.specification.ResponseSpecification;

abstract public class Response {

    protected static ResponseSpecification expectStatusCodeToBe(int statusCode) {
        return RestAssured.expect().statusCode(statusCode);
    }
}
