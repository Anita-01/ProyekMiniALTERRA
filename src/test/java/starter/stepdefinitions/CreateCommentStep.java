package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;
import starter.user.CreateComment;

public class CreateCommentStep {
    @Steps
    CreateComment comment;

    @Given("I set POST api endpoints for create comment")
    public void setPostApiForComment(){
        comment.setPostApiForComment();
    }

    @When("I send POST HTTP Request for create comment")
    public void sendPostHttpReqForComment(){
        comment.sendPostHttpReqForComment();
    }

    @When("I send Wrong POST HTTP Request for create comment")
    public void sendWrongPOSTHttpReqForComment(){
       comment.sendWrongPOSTHttpReqForComment();
    }
}
