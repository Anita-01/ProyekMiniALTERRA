package starter.user;

import io.cucumber.java.en.Given;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    protected static String url = "https://be-qa.alta.id/api";
    protected static String wrongurl = "htt://be-qa.alta.id/api";

    @Step("I set GET api endpoints")
    public String setGetApi(){
        return url + "/categories";
    }
    @Step("I send GET HTTP Request")
    public void getHttpRequest(){
        SerenityRest.given().get(setGetApi());
    }
    @Step("I receive valid HTTP response code 200")
    public void getValidHTTP(){
        restAssuredThat(response -> response.statusCode(200));
    }


    // Get Category By ID
    // Positive Test Case
    @Step("I set GET api endpoints by Category ID")
    public String setGetAPIID(){
        return url + "/categories/12";
    }
    @Step("I send GET HTTP Request for get category")
    public void getHTTPRequestCategory(){
        SerenityRest.given().get(setGetAPIID());
    }
    @Step("^I set wrong ([^\"]*) to GET api endpoints")
    public void enterURL(String URL){

    }
    // Negative

    // Invalid URL
    // Invalid URL1
    @Step("I set wrong URL https to http")
    public String setWrongGetURL1(){
        return "http://be-qa.alta.id/api/categories/12";
    }
    @Step("I send Wrong GET HTTP Request1")
    public void getWrongHttpRequest1(){
        SerenityRest.given().get(setWrongGetURL1());
    }

    // Invalid URL2
    @Step("I set wrong URL https to https_")
    public String setWrongGetURL2(){
        return "https:_//be-qa.alta.id/api/categories/12";
    }
    @Step("I send Wrong GET HTTP Request2")
    public void getWrongHttpRequest2(){
        SerenityRest.given().get(setWrongGetURL2());
    }

    // Invalid URL3
    @Step("I set wrong URL to URL Facebook")
    public String setWrongGetURL3(){
        return "https://www.facebook.com/categories/12 ";
    }
    @Step("I send Wrong GET HTTP Request3")
    public void getWrongHttpRequest3(){
        SerenityRest.given().get(setWrongGetURL3());
    }
    @Step("Then I receive valid HTTP response code 403")
    public void getInvalidHTTPCategory3(){
        restAssuredThat(response -> response.statusCode(403));
    }


    // Invalid URL4
    @Step("I set wrong URL to empty URL")
    public String setWrongGetURL4(){
        return "";
    }
    @Step("I send Wrong GET HTTP Request4")
    public void getWrongHttpRequest4(){
        SerenityRest.given().get(setWrongGetURL4());
    }
    // Invalid URL5
    @Step("I set wrong URL to double url")
    public String setWrongGetURL5(){
        return "https://be-qa.alta.id/api/categories/17 https://be-qa.alta.id/api/categories/17";
    }
    @Step("I send Wrong GET HTTP Request5")
    public void getWrongHttpRequest5(){
        SerenityRest.given().get(setWrongGetURL5());
    }

    //    Wrong Name in Categories
    @Step("I set wrong GET api endpoints")
    public String setWrongGetApi(){
        return url + "/categories12";
    }
    @Step("I send Wrong GET HTTP Request")
    public void getWrongHttpRequest(){
        SerenityRest.given().get(setWrongGetApi());
    }
    @Step("I receive valid HTTP response code 404")
    public void getInvalidHTTP(){
        restAssuredThat(response -> response.statusCode(404));
    }

    // Wrong Target ID1
    @Step("I set wrong GET api endpoints1")
    public String setWrongGetApi1(){
        return "https://be-qa.alta.id/api/categories/100000000000000000000";
    }
    @Step("I send Wrong GET HTTP Request_1")
    public void getWrongHttpRequest_1(){
        SerenityRest.given().get(setWrongGetApi1());
    }

    // Wrong Target ID2
    @Step("I set wrong GET api endpoints2")
    public String setWrongGetApi2(){
        return "https://be-qa.alta.id/api/categories/makanan";
    }
    @Step("I send Wrong GET HTTP Request_2")
    public void getWrongHttpRequest_2(){
        SerenityRest.given().get(setWrongGetApi2());
    }

    // Wrong Target ID3
    public String setWrongGetApi3(){
        return "https://be-qa.alta.id/api/categories/100@@";
    }
    @Step("I send Wrong GET HTTP Request_3")
    public void getWrongHttpRequest_3(){
        SerenityRest.given().get(setWrongGetApi3());
    }
    // Wrong Target ID4
    public String setWrongGetApi4(){
        return "https://be-qa.alta.id/api/categories////";
    }
    @Step("I send Wrong GET HTTP Request_4")
    public void getWrongHttpRequest_4(){
        SerenityRest.given().get(setWrongGetApi4());
    }
    // Wrong Target ID5
    @Step("I set wrong GET api endpoints5")
    public String setWrongGetApi5(){
        return "https://be-qa.alta.id/api/categories/12#makanan";
    }
    @Step("I send Wrong GET HTTP Request_5")
    public void getWrongHttpRequest_5(){
        SerenityRest.given().get(setWrongGetApi5());
    }










}
