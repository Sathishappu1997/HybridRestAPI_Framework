package com.StepDefination;

import java.io.IOException;

import com.DataForHashmap.Post_Put_Delete_HashmapData;
import com.DataForPayload.Delete_payload;
import com.DataForPayload.Post_payload;
import com.DataForPayload.Put_payload;
import com.dataForPojo.Setvalues_Pojo_Post;
import com.dataForPojo.Setvalues_Pojo_Put;
import com.dataForPojo.Setvalues_Pojo_delete;
import com.dataForPojo.Setvalues_datadriven_post;
import com.util.ApiResources;
import com.util.Apiutility;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Reusable_step extends Apiutility{
	
	RequestSpecification req;
	Response response;
	
	
	@Given("User has the details")
	public void user_has_the_details() throws IOException {
		
		req = RestAssured.given().spec(requestdetails());
	    
	}
	   

	@When("The user use {string} and {string} http method")
	public void the_user_use_and_http_method(String resource, String method) {
		ApiResources postresource=ApiResources.valueOf(resource);
		System.out.println(postresource.getResource());
		
		//response=req.when().post(postresource.getResource());
		if (method.equalsIgnoreCase("postpojo")) {
			logger.info("************postmethod******************************");
		Setvalues_Pojo_Post	 p=new Setvalues_Pojo_Post();
			response=req.body(p.setvalues()).when().post(postresource.getResource());
			
		}else if (method.equalsIgnoreCase("PUTpojo"))
		{
			logger.info("************putmethod******************************");
			Setvalues_Pojo_Put	 p=new Setvalues_Pojo_Put();
			response=req.body(p.setvalues_put()).when().put(postresource.getResource());
			
		}else if(method.equalsIgnoreCase("deletepojo")){
			
			logger.info("************deletemethod******************************");
			Setvalues_Pojo_delete	 p=new Setvalues_Pojo_delete();
			response=req.body(p.setvalues_delete()).when().delete(postresource.getResource());	
			
			
		}else if(method.equalsIgnoreCase("get")) {
			response=req.when().get(postresource.getResource());		
		}else if(method.equalsIgnoreCase("postpayload")) {
			Post_payload	 p=new Post_payload();
			response=req.body(p.postpayload()).when().post(postresource.getResource());	
			
			
		}else if(method.equalsIgnoreCase("putpayload")) {
			Put_payload	 p=new Put_payload();
			response=req.body(p.putpayload()).when().put(postresource.getResource());	
			
			
		}else if(method.equalsIgnoreCase("deletepayload")) {
			Delete_payload	 p=new Delete_payload();
			response=req.body(p.deletepayload()).when().delete(postresource.getResource());	
			
			
		}else if(method.equalsIgnoreCase("posthashmap")) {
			Post_Put_Delete_HashmapData	 p=new Post_Put_Delete_HashmapData();
			response=req.body(p.post_map()).when().post(postresource.getResource());	
			
			
		}else if(method.equalsIgnoreCase("puthashmap")) {
			Post_Put_Delete_HashmapData	 p=new Post_Put_Delete_HashmapData();
			response=req.body(p.put_map()).when().put(postresource.getResource());
			
			}else if(method.equalsIgnoreCase("Deletehashmap")) {
				Post_Put_Delete_HashmapData	 p=new Post_Put_Delete_HashmapData();
				response=req.body(p.delete_map()).when().delete(postresource.getResource());}	
			
	
	    
	}

	@Then("The {string} in response body is {string}")
	public void the_in_response_body_is(String keyvalue, String Exceptedvalue) {
		logger.info("************responsemessage******************************");
		/*
		 * String res=response.asString(); JsonPath js=new JsonPath(res);
		 */
		assertEquals(response.jsonPath().get(keyvalue),Exceptedvalue);
		
	    
	}



}
