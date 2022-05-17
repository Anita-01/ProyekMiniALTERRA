package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.user.GetTransaction;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetTransactions {
    @Steps
    GetTransaction getTransaction;

    @Given("I set GET api endpoints for get all transaction")
    public void setGetAllTransaction(){
        getTransaction.getAllTransaction();
    }
    @When("I send GET HTTP Request for for get all transaction")
    public void getHttpRequestAllTransaction(){
        getTransaction.setGetApiTransaction();
    }

    @When("I send Wrong GET HTTP Request for for get all transaction")
    public void getWrongAllTransaction(){
        getTransaction.getWrongAllTransaction();
    }
    @Then("I receive valid HTTP response code 401")
    public void getInvalidHTTPCategory401(){
        getTransaction.getInvalidHTTPCategory401();
    }

}
