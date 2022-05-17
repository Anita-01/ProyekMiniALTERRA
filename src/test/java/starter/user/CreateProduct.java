package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.util.Arrays;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateProduct {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set POST api endpoints for product")
    public String setPostApiProducts(){
        return url + "/products";
    }

    @Step("I create new product")
    public void sendPostHttpProduct(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Tensi Darah Elektrik");
        requestBody.put("price", 240000);
        requestBody.put("categories", Arrays.asList(3,6));

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiProducts());
    }
    @Step("I receive valid data for new product")
    public void validateDataNewProduct(){
        restAssuredThat(response -> response.body("'data'.'Name'", equalTo("Tensi Darah Elektrik")));
    }

    @Step("I create invalid product")
    public void sendPostHttpInvalidProduct(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", 353);
        requestBody.put("price", 240000);
        requestBody.put("categories", Arrays.asList(3,6));

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiProducts());
    }



}
