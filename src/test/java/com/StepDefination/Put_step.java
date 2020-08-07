package com.StepDefination;



import java.io.IOException;
import static org.junit.Assert.*;
import com.dataForPojo.Setvalues_Pojo_Put;
import com.util.Apiutility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Put_step extends Apiutility {
	RequestSpecification res;
	Response response;

@Given("The user has put method details")
public void the_user_has_put_method_details() throws IOException {
	Setvalues_Pojo_Put  p=new Setvalues_Pojo_Put();
	res=RestAssured.given().spec(requestdetails()).body(p.setvalues_put());
}

@When("user calls the putapi with put http request")
public void user_calls_the_putapi_with_put_http_request() {
	response=res.when().put("api/update.php");
    
}

@Then("The user should recieve status code success")
public void the_user_should_recieve_status_code_success() {
	
	assertEquals( response.getStatusCode(), 200);
   



}}
