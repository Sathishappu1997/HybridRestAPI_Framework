package com.StepDefination;
import static org.junit.Assert.*;
import com.dataForPojo.Setvalues_datadriven_post;
import com.dataForPojo.Setvalues_datadriven_put;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Datadriven_put_step {
	RequestSpecification re;
	Response response;

@Given("The user have put method details with {string} {string}")
public void the_user_have_put_method_details_with(String id, String author) {
	Setvalues_datadriven_put p=new Setvalues_datadriven_put();
	re=RestAssured.given().baseUri("https://www.change2testautomation.com/").body(p.setvalues_putdatadriven(id, author));
	
	
   
}
@When("put http request is sent by user")
public void put_http_request_is_sent_by_user() {
	
	response=re.when().put("api/update.php");
    
}
@Then("Data updated successfully message is recieved")
public void data_updated_successfully_message_is_recieved() {
	
	assertEquals( response.getStatusCode(), 200);



}}
