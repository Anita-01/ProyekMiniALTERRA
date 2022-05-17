package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


public class Ratings {
    protected String url = "https://be-qa.alta.id/api/products";
    @Step("I set GET api endpoints for get rating")
    public String setGetAPIRatings(){
        return url + "/407/ratings";
    }
    @Step("I send GET HTTP Request for get rating")
    public void getHTTPRequestforRatings(){
        SerenityRest.given().get(setGetAPIRatings());
    }

    // Invalid Rating
    @Step("I set Wrong GET api endpoints for get rating")
    public String setWrongGetApi(){
        return url + "____/407/ratings";
    }
    @Step("I send Wrong GET HTTP Request for get rating")
    public void getWrongHTTPRequestforRatings(){
        SerenityRest.given().get(setWrongGetApi());
    }



}