package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;
import starter.user.Create;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateSteps {
    @Steps
    Create create;

    @Given("I set POST api endpoints")
    public void setPostApi(){
        create.setPostApi();
    }

    @When("I create new category")
    public void sendPostHttp(){
        create.sendPostHttp();
    }

    @Then("I receive valid data for new category")
    public void receiveValidDataForCreateCategory(){
        create.validateDataCreateCategory();
    }

    // Negative
    @When("I create New Category with int")
    public void createNewwithint(){
        create.sendPostHttpInt();
    }
    @Then("I receive valid HTTP response code 400")
    public void receiveValidData400(){
        create.getInvalidHTTPCategory();
    }
    @When("I create New Category with combine int and character")
    public void createNewWithIntCharacter(){
        create.sendPostHttpCombine();
    }
    @When("I Create New Category with combine String and character")
    public void createNewCategoryWithCombine(){
        create.sendPostHttpCombineStringInt();
    }
    @When("I create Two New Category In One Response")
    public void twoCategoryInOneResponse(){
       create.twoCategoryInOneResponse();
    }

    @When("I create New Category without body")
    public void createNewCategoryWithoutBody(){
        create.createNewCategoryWithoutBody();
    }
    @When("I receive valid HTTP response code 500")
    public void getInvalidHTTPCategory500(){
        create.getInvalidHTTPCategory500();
    }
}
