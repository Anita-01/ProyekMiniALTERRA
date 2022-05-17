package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateTransaction {
    protected String url = "https://be-qa.alta.id/api/";
    @Step("I set POST api endpoints for create transaction")
    public String setPostApiForCreateTransaction(){
        return url + "orders";
    }
    @Step("I send POST HTTP Request for create transaction")
    public void sendPostCreateTransaction(){

        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("product_id", 10);
        jsonObject.put("quantity", 200);
        jsonArray.add(jsonObject);
        jsonArray.toArray();


        SerenityRest.given().header("Authorization", "Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkVsZnJpZGEgVGFtcHVib2xvbiIsIkVtYWlsIjoiZWxmMTIzQGVtYWlsLmNvbSJ9.26p_Tq9YA1ySy8UuTGPKwVJpt61uXpugluMOChFqOoo").body(jsonArray)
                .post(setPostApiForCreateTransaction());
    }
    @Step("I send Wrong POST HTTP Request for create transaction")
    public void sendWrongPostCreateTransaction(){

        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("product_id", 12);
        jsonObject.put("quantity", 20);
        jsonArray.add(jsonObject);
        jsonArray.toArray();


        SerenityRest.given().header("Authorization", "Bearer "+"tZSI6IkVsZnJpZGEgVGFtcHVib2xvbiIsIkVtYWlsIjoiZWxmMTIzQGVtYWlsLmNvbSJ9.26p_Tq9YA1ySy8UuTGPKwVJpt61uXpugluMOChFqOoo").body(jsonArray)
                .post(setPostApiForCreateTransaction());
    }


}
