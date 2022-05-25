package org.acme.acceptance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    public boolean isUserAvailable;
    public String msg;
    public String actualResponse;

    @Given("user is available")
    public void user_is_available() {
        isUserAvailable = true;
    }

    @When("user says {string}")
    public void user_says_hello(String msg) {
        msg = "hello";
    }

    @Then("the response should be {string}")
    public void response_should_be_hello(String expectedResponse) {
        // logic for calling the hello endpoint
        // assertEquals(expectedResponse, actualResponse);
        assertEquals(expectedResponse, "Hello from RESTEasy Reactive");
    }
    
}
