package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.user.Ratings;

public class GetRatingStep {

    @Steps
    Ratings ratings;

    @Given("I set GET api endpoints for get rating")
    public void setGetAPIEnpoints() {
        ratings.setGetAPIRatings();
    }

    @When("I send GET HTTP Request for get rating")
    public void sendHTTPRatings() {
        ratings.getHTTPRequestforRatings();
    }

    @Given("I set Wrong GET api endpoints for get rating")
    public void setWrongGetApi(){
        ratings.setWrongGetApi();
    }
    @When("I send Wrong GET HTTP Request for get rating")
    public void getWrongHTTPRequestforRatings(){
        ratings.getWrongHTTPRequestforRatings();
    }



}