package com.StepDefination;

import java.io.IOException;

import static org.junit.Assert.*;

import com.util.Apiutility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Step extends Apiutility {
	RequestSpecification res;
	Response response;

@Given("The user has get method details")
public void the_user_has_get_method_details() throws IOException {
	
	res=RestAssured.given().spec(requestdetails());
   
}

@When("user calls the getapi with get http request")
public void user_calls_the_getapi_with_get_http_request() {
	response=res.when().post("api/read.php");
   
}

@Then("The user can able to retrieve all resources")
public void the_user_can_able_to_retrieve_all_resources() {
	assertEquals( response.getStatusCode(), 200);
    
}


}
