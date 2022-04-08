package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiTest {
    private static final String URL = "http://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";

    public static Response getCardId(){
        Response response = given()
                .contentType(ContentType.JSON)
                .urlEncodingEnabled(false)
                .log().all(true)
                .get(URL);
        return response;
    }
}
