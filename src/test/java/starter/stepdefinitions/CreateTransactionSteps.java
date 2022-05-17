package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import starter.user.CreateTransaction;

public class CreateTransactionSteps {
    @Steps
    CreateTransaction createTransaction;


    @Given("I set POST api endpoints for create transaction")
    public void setPOSTAPI(){
        createTransaction.setPostApiForCreateTransaction();
    }
    @When("I send POST HTTP Request for create transaction")
    public void sendPOSTHTTPTransaction(){
        createTransaction.sendPostCreateTransaction();
    }
    @When("I send Wrong POST HTTP Request for create transaction")
    public void sendWrongPostCreateTransaction(){
        createTransaction.sendWrongPostCreateTransaction();
    }

}
