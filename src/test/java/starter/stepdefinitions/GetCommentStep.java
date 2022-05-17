package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.user.Comment;

public class GetCommentStep {
    @Steps
    Comment comment;
    @Given("I set GET api endpoints for get comment")
    public void setGetAPIComment(){
        comment.setGetAPIComment();
    }
    @When("I send GET HTTP Request for get comment")
    public void getHTTPRequest(){
        comment.getHTTPRequestforComment();
    }
    @Given("I set wrong GET api endpoints for get comment")
    public void setWrongGetAPIComment(){
        comment.setWrongGetAPIComment();
    }
    @When("I send wrong GET HTTP Request for get comment")
    public void getWrongHTTPRequestforComment(){
        comment.getWrongHTTPRequestforComment();
    }
}
