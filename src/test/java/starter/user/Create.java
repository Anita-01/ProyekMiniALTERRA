package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Create {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set POST api endpoints")
    public String setPostApi(){
        return url + "/categories";
    }

    @Step("I create new category")
    public void sendPostHttp(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "kesehatan");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApi());
    }

    @Step("I receive valid data for new category")
    public void validateDataCreateCategory(){
        restAssuredThat(response -> response.body("'data'.'Name'", equalTo("kesehatan")));
    }
    // Negative
    @Step("I create New Category with int")
    public void sendPostHttpInt(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", 12121);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApi());
    }
    @Step("I create New Category with combine int and character")
    public void sendPostHttpCombine(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "12__@");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApi());
    }
    @Step("I receive valid HTTP response code 400")
    public void getInvalidHTTPCategory(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I Create New Category with combine String and character")
    public void sendPostHttpCombineStringInt(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "12@@@@@");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApi());
    }
    @Step("I create Two New Category In One Response")
    public void twoCategoryInOneResponse(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Makanan");
        requestBody.put("name", "Minuman");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApi());
    }

    @Step("I create New Category without body")
    public void createNewCategoryWithoutBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");


        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApi());
    }
    @Step("I receive valid HTTP response code 500")
    public void getInvalidHTTPCategory500(){
        restAssuredThat(response -> response.statusCode(500));
    }



}
