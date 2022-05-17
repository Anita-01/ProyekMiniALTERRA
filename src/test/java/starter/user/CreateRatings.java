package starter.user;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateRatings {
        protected static String url = "https://be-qa.alta.id/api";

        @Step("I set POST api endpoints for rating product")
        public String setPostApiRatingProducts(){
            return url + "/products/407/ratings";
        }
        @Step("I set the bearer token")
        public void setBearer(){
            SerenityRest.given().header("Authorization", "Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsZXggVW5kZXIiLCJFbWFpbCI6ImFuaXRhbGFzbWFyaWFAZ21haWwuY29tIn0.hBBhAuPzWCW9alS5kZSou2p-O1TtPz0W1CmGlUwXz_4")
                    .get(setPostApiRatingProducts());
        }
        @Step("I create new rating for product")
        public void sendPostHttpRatings(){
            JSONObject requestBody = new JSONObject();
            requestBody.put("count", 3);
            SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiRatingProducts());
        }
    @Step("I set the wrong bearer token")
    public void setWrongBearer(){
        SerenityRest.given().header("Authorization", "z_4")
                .get(setPostApiRatingProducts());
    }



    }