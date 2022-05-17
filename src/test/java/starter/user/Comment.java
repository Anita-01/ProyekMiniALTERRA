package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.Arrays;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Comment {
    protected String url = "https://be-qa.alta.id/api/products";
    @Step("I set GET api endpoints for get comment")
    public String setGetAPIComment(){
        return url + "/1/comments";
    }
    @Step("I send GET HTTP Request for get comment")
    public void getHTTPRequestforComment(){
        SerenityRest.given().get(setGetAPIComment());
    }
    @Step("I verify the product's comment")
    public void verifyGetComment(){
        restAssuredThat(response -> response.body("'data'.'ID'", equalTo(Arrays.asList(2,30))));
    }
    @Step("I set wrong GET api endpoints for get comment")
    public String setWrongGetAPIComment(){
        return url + "comments/403";
    }
    @Step("I send wrong GET HTTP Request for get comment")
    public void getWrongHTTPRequestforComment(){
        SerenityRest.given().get(setWrongGetAPIComment());
    }



}
