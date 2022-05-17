package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Login {
    // Valid Login
    protected static String url ="https://be-qa.alta.id/api";
    @Step("I set POST api endpoints for login")
    public String setPostApiForLogin(){
        return url + "/auth/login";
    }

    @Step("I send POST HTTP Request for login")
    public void sendPostHttpForLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "anitasiagian11@gmail.com");
        requestBody.put("password", "AnitaLasmariaSiagian");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiForLogin());
    }

    // Invalid Login
    @Step("I set Wrong POST api endpoints for login")
    public String setWrongPostApiForLogin(){
        return url + "/auth/login";
    }

    @Step("I send Wrong POST HTTP Request for login")
    public void sendWrongPostHttpForLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "anitasiagian11@gmail.com");
        requestBody.put("password", 222222);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiForLogin());
    }
}
