package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.Assert;
import services.ApiTest;

import java.io.File;


public class ApiTestSteps {
    private Response response;

    @Given("User is logged in")
    public void userIsLogged() {
    }

    @When("User sends a GET request to get a card id and status code {int}")
    public void userSendsAGETRequestToGetACardIdAndStatusCode(int status) {
        response = ApiTest.getCardId();
        Assert.assertEquals(status, response.getStatusCode());
    }

    @Then("Validate JSON schema")
    public void validateJSONSchema() {
        response.then().body(JsonSchemaValidator.matchesJsonSchema(new File("src/main/resources/schemas/ApiTest.json")));
    }
}
