package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;
import starter.user.Register;

public class RegisterStep {
    @Steps
    Register register;
    @Given("I set POST api endpoints for make account")
    public void setRegister(){
        register.setRegister();
    }
    @When("I create new account")
    public void createNewAccount(){
        register.createNewAccount();
    }
    @Then("I receive valid data for new account")
    public void validRegister(){
        register.receivevaliddata();
    }
    @When("I create invalid new account")
    public void createinvalidNewAccount(){
        register.createinvalidNewAccount();
    }

}
