package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Register {
    protected static String url = "https://be-qa.alta.id/api";
    @Step("I set POST api endpoints for make account")
    public String setRegister(){
        return url + "/auth/register";
    }
    @Step("I create new account")
    public void createNewAccount(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("fullname", "Anita Siagian");
        requestBody.put("email", "anitabless!121!@gmail.com");
        requestBody.put("password", "anitasiagian123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setRegister());
    }
    @Step("I receive valid data for new account")
    public void receivevaliddata(){
        restAssuredThat(response -> response.body("'data'.'Fullname'", equalTo("Anita Siagian")));
    }
    @Step("I create invalid new account")
    public void createinvalidNewAccount(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("fullname", 2300);
        requestBody.put("email", "anitabless12464_23@gmail.com");
        requestBody.put("password", "anitasiagian123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setRegister());
    }

    }

