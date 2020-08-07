package com.StepDefination;
import static org.junit.Assert.*;
import com.dataForPojo.Setvalues_Pojo_Post;
import com.dataForPojo.Setvalues_Pojo_delete;
import com.util.Apiutility;
import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_Step extends Apiutility {
	RequestSpecification res;
	Response response;
	
	@Given("The user has delete method details")
	public void the_user_has_delete_method_details() throws IOException {
		Setvalues_Pojo_delete  p=new Setvalues_Pojo_delete();
		res=RestAssured.given().spec(requestdetails()).body(p.setvalues_delete());
	   
	}

	@When("user calls the deleteapi with delete http request")
	public void user_calls_the_deleteapi_with_delete_http_request() {
		response=res.when().post("api/delete.php");
	    
	}

	@Then("The user should be able to delete the resource successfully")
	public void the_user_should_be_able_to_delete_the_resource_successfully() {
		assertEquals( response.getStatusCode(), 200);
	    
	    
	}



}
