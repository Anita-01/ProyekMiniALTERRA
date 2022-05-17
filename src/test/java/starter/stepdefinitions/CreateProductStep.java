package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;
import starter.user.CreateProduct;

import java.util.Arrays;

public class CreateProductStep {
    @Steps
    CreateProduct createProduct;

    @Given("I set POST api endpoints for product")
        public void setPostAPIEnpoints(){
        createProduct.setPostApiProducts();
        }
        @When("I create new product")
        public void setCreateProduct(){
        createProduct.sendPostHttpProduct();
        }
        @Then("I receive valid data for new product")
        public void receiveValidDataProduct(){
        createProduct.validateDataNewProduct();
        }
    @When("I create invalid product")
    public void sendPostHttpInvalidProduct(){
        createProduct.sendPostHttpInvalidProduct();
    }


}
