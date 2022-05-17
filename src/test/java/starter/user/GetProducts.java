package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProducts {
    protected static String url = "https://be-qa.alta.id/api";
    //Get Product
    @Step("I set GET api endpoints for products")
    public String setGetApiProducts(){
        return url + "/products";
    }
    @Step("I send GET HTTP Request for products")
    public void getHttpRequestProducts(){
        SerenityRest.given().get(setGetApiProducts());
    }
    @Step("I set GET api endpoints for products by id")
    public String setAPIProductById(){
        return url + "/products?id";
    }
    @Step("I send GET HTTP Request for products by id")
    public void getHttpRequestProductsById(){
        SerenityRest.given().get(setAPIProductById());
    }
    // Get Product By Id
    @Step("I set GET api endpoints for products by id")
    public String setGetApiProductsByid(){
        return url + "/products/:id";
    }

    @Step("I send GET HTTP Request for products by id")
    public void getHttpProductById(){
        SerenityRest.given().get(setGetApiProductsByid());
    }

    @Step("I set wrong GET api endpoints for product1")
    public String setWrongGetApiProduct(){
        return url + "/produc";
    }
    @Step("When I send Wrong GET HTTP Request for product")
    public void getWrongHttpRequestProducts(){
        SerenityRest.given().get(setWrongGetApiProduct());
    }


}
