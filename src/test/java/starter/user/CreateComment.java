package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class CreateComment {
    protected static String url ="https://be-qa.alta.id/api";
    @Step("I set POST api endpoints for create comment")
    public String setPostApiForComment(){
        return url + "/products/2/comments";
    }
    @Step("I send POST HTTP Request for create comment")
    public void sendPostHttpReqForComment(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "mantap dong!");

        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsZXggVW5kZXIiLCJFbWFpbCI6ImFuaXRhbGFzbWFyaWFAZ21haWwuY29tIn0.hBBhAuPzWCW9alS5kZSou2p-O1TtPz0W1CmGlUwXz_4")
                .body(requestBody.toJSONString()).post(setPostApiForComment());
    }
    @Step("I send Wrong POST HTTP Request for create comment")
    public void sendWrongPOSTHttpReqForComment(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", 1);

        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsZXggVW5kZXIiLCJFbWFpbCI6ImFuaXRhbGFzbWFyaWFAZ21haWwuY29tIn0.hBBhAuPzWCW9alS5kZSou2p-O1TtPz0W1CmGlUwXz_4")
                .body(requestBody.toJSONString()).post(setPostApiForComment());
    }

}
