package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.CreateRatings;


public class CreateRatingStep {
    @Steps
    CreateRatings createRatings;
    @Given("I set POST api endpoints for rating product")
    public void setPostAPIRatingsProduct() {
        createRatings.sendPostHttpRatings();
    }
    @When("I set the bearer token")
    public void bearertoken(){
        createRatings.setBearer();
    }
    @And("I create new rating for product")
    public void setCreateProduct() {
        createRatings.setPostApiRatingProducts();
    }
    @When("I set the wrong bearer token")
    public void setWrongBearer(){
        createRatings.setWrongBearer();
    }
}