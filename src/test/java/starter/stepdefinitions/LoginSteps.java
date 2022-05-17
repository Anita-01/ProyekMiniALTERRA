package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;
import starter.user.Login;

public class LoginSteps {
    @Steps
    Login login;
    @Given("I set POST api endpoints for login")
    public void setPostApiForLogin(){
        login.setPostApiForLogin();
    }
    @When("I send POST HTTP Request for login")
    public void sendPostHttpForLogin(){
        login.sendPostHttpForLogin();
    }
    @Given("I set Wrong POST api endpoints for login")
    public void setWrongPostApiForLogin(){
        login.setWrongPostApiForLogin();
    }

    @When("I send Wrong POST HTTP Request for login")
    public void sendWrongPostHttpForLogin(){
     login.sendWrongPostHttpForLogin();
    }
}
