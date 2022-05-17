package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetTransaction {
    protected static String url = "https://be-qa.alta.id/api";
    //Get All Transaction
    @Step("I set GET api endpoints for get all transaction")
    public String setGetApiTransaction(){
        return url + "/orders/407";
    }
    @Step("I send GET HTTP Request for for get all transaction")
    public void getAllTransaction(){
            SerenityRest.given().header("Authorization", "Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsZXggVW5kZXIiLCJFbWFpbCI6ImFuaXRhbGFzbWFyaWFAZ21haWwuY29tIn0.hBBhAuPzWCW9alS5kZSou2p-O1TtPz0W1CmGlUwXz_4")
                    .get(setGetApiTransaction());
        }


    @Step("I send Wrong GET HTTP Request for for get all transaction")
    public void getWrongAllTransaction(){
        SerenityRest.given().header("Authorization", "Bearer "+".eyJGdWxsbmFtZSI6IkFsZXggVW5kZXIiLCJFbWFpbCI6ImFuaXRhbGFzbWFyaWFAZ21haWwuY29tIn0.hBBhAuPzWCW9alS5kZSou2p-O1TtPz0W1CmGlUwXz_4")
                .get(setGetApiTransaction());
    }

    @Step("I receive valid HTTP response code 401")
    public void getInvalidHTTPCategory401(){
        restAssuredThat(response -> response.statusCode(401));
    }
    }


