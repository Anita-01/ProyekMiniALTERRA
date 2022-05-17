package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.user.GetProducts;

public class GetProductStep {
    @Steps
    GetProducts get2;

    @Given("I set GET api endpoints for products")
    public void setGetApiProducts(){
       get2.setGetApiProducts();
    }
    @When("I send GET HTTP Request for products")
    public void getHttpRequestProducts(){
        get2.getHttpRequestProducts();
    }

    //Get Product By Id
    @Given("I set GET api endpoints for products by id")
    public void setGetAPIProductById(){
        get2.setAPIProductById();
    }
    @Then("I send GET HTTP Request for products by id")
    public void getHTTPRequestforId(){
        get2.getHttpRequestProductsById();
    }

    // Invalid Test Case
    @Given("I set wrong GET api endpoints for product1")
    public void setWrongGetApiProduct(){
        get2.setWrongGetApiProduct();
    }
    @When("I send Wrong GET HTTP Request for product")
    public void getWrongHttpRequestProducts(){
        get2.getWrongHttpRequestProducts();
    }


}
