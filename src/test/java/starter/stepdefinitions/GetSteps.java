package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSteps {
    @Steps
    Get get;

    @Given("I set GET api endpoints")
    public void setGetApi(){
        get.setGetApi();
    }
    @When("I send GET HTTP Request")
    public void getHttpRequest(){
        get.getHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void getValidHTTP(){
        get.getValidHTTP();
    }
    @Given("I set wrong GET api endpoints")
    public void setWrongGetAPI(){
        get.setWrongGetApi();
    }
    @When("I send Wrong GET HTTP Request")
    public void sendWrongGet(){
        get.getWrongHttpRequest();
    }
    @Then("I receive valid HTTP response code 404")
    public void validHTTPResponse(){
        get.getInvalidHTTP();
    }
    @Given("I set GET api endpoints by Category ID")
    public void setGETCategoryID(){
        get.setGetAPIID();
    }
    @When("I send GET HTTP Request for get category")
    public void sendGETHTTPRequest(){
        get.getHTTPRequestCategory();
    }
    // Negative
    // URL 1
    @Given("I set wrong URL https to http")
    public void setWrongURL1(){
        get.setWrongGetURL1();
    }
    @When("I send Wrong GET HTTP Request1")
    public void getHTTPRequest1(){
        get.getWrongHttpRequest1();
    }

    // URL 2
    @Given("I set wrong URL https to https_")
    public void setWrongURL2(){
        get.setWrongGetURL2();
    }
    @When("I send Wrong GET HTTP Request2")
    public void getHTTPRequest2(){
        get.getWrongHttpRequest2();
    }

    // URL 3
    @Given("I set wrong URL to URL Facebook")
    public void setWrongURL3(){
        get.setWrongGetURL3();
    }
    @When("I send Wrong GET HTTP Request3")
    public void getHTTPRequest3(){
        get.getWrongHttpRequest3();
    }
    @Then("I receive valid HTTP response code 403")
    public void getInvalidHTTPCategory3(){
        get.getInvalidHTTPCategory3();
    }

    // URL 4
    @Given("I set wrong URL to empty URL")
    public void setWrongURL4(){
        get.setWrongGetURL4();
    }
    @When("I send Wrong GET HTTP Request4")
    public void getHTTPRequest4(){
        get.getWrongHttpRequest4();
    }

    // URL 5
    @Given("I set wrong URL to double url")
    public void setWrongURL5(){
        get.setWrongGetURL5();
    }
    @When("I send Wrong GET HTTP Request5")
    public void getHTTPRequest5(){
        get.getWrongHttpRequest5();
    }

    // Negative
    // Wrong Target ID1
    @Given("I set wrong GET api endpoints1")
    public void setWrongGetApi1(){
        get.setWrongGetApi1();
    }
    @When("I send Wrong GET HTTP Request_1")
    public void getWrongHttpRequest_1(){
        get.getWrongHttpRequest_1();
    }
     // Wrong Target ID2
    @Given("I set wrong GET api endpoints2")
    public void setWrongGetApi2(){
        get.setWrongGetApi2();
    }
    @When("I send Wrong GET HTTP Request_2")
    public void getWrongHttpRequest_2(){
        get.getWrongHttpRequest_2();
    }

    // Wrong Target ID3
    @Given("I set wrong GET api endpoints3")
    public void setWrongGetApi3(){
        get.setWrongGetApi3();
    }
    @When("I send Wrong GET HTTP Request_3")
    public void getWrongHttpRequest_3(){
        get.getWrongHttpRequest_3();
    }
    // Wrong Target ID4
    @Given("I set wrong GET api endpoints4")
    public void setWrongGetApi4(){
        get.setWrongGetApi4();
    }
    @When("I send Wrong GET HTTP Request_4")
    public void getWrongHttpRequest_4(){
        get.getWrongHttpRequest_4();
    }
    // Wrong Target ID5
    @Given("I set wrong GET api endpoints5")
    public void setWrongGetApi5(){
        get.setWrongGetApi5();
    }
    @When("I send Wrong GET HTTP Request_5")
    public void getWrongHttpRequest_5(){
        get.getWrongHttpRequest_5();
    }

}
