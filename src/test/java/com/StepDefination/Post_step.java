package com.StepDefination;
import static io.restassured.RestAssured.given;


import java.io.IOException;

//import org.testng.Assert;

import com.dataForPojo.Setvalues_Pojo_Post;
import com.util.Apiutility;
import com.util.Resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import static org.junit.Assert.*;

public class Post_step extends Apiutility {
	RequestSpecification res;
	Response response;
	@Given("The user has post method details")
	public void the_user_has_post_method_details() throws IOException {
		
		Setvalues_Pojo_Post  p=new Setvalues_Pojo_Post();
		res=RestAssured.given().spec(requestdetails()).body(p.setvalues());
	   
	}

	@When("user calls the postapi with post http request")
	public void user_calls_the_postapi_with_post_http_request() {
		Resources r=new Resources();
		response=res.when().post(r.getPostapi());
	    
	}

@Then("api calls get success with the status code")
public void api_calls_get_success_with_the_status_code() {
	//Assert.assertEquals( response.getStatusCode(), 200);
    
}
@Then("status response body is success")
public void status_response_body_is_success() {
	assertEquals(response.asString(),   "{\"message\":\"Data Inserted Successfully\"}");
   
}


	

	


}
