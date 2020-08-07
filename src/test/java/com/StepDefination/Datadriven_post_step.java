package com.StepDefination;

import java.io.IOException;
import static org.junit.Assert.*;
import com.dataForPojo.Setvalues_datadriven_post;
import com.util.Apiutility;
import com.util.Resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Datadriven_post_step extends Apiutility{
	RequestSpecification req;
	Response response;
	

		@Given("The user has post method details with {string} {string} {string}")
		public void the_user_has_post_method_details_with(String title, String body, String author) throws IOException {
			Setvalues_datadriven_post p=new Setvalues_datadriven_post();
			req=RestAssured.given().spec(requestdetails()).body(p.setvalues_datadriven(title, body, author));
		    
		}
		@When("user sends  post http request")
		public void user_sends_post_http_request() {
			Resources r=new Resources();
			
			response=req.when().post(r.getPostapi());
		    
		}

		@Then("user gets data successly inserted")
		public void user_gets_data_successly_inserted() {
			assertEquals(response.asString(),   "{\"message\":\"Data Inserted Successfully\"}");
		    
		}




}
