package com.StepDefination;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import com.DataForJsonObject.Post_Put_Delete_JsonObjecct;
import com.util.Apiutility;
import com.util.Resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetUsingJsonObject_Steps extends Apiutility {

	RequestSpecification res;
	Response response;
	Post_Put_Delete_JsonObjecct jsob;
	Resources resource;

	@Given("The user has put method details using JsonObj")
	public void the_user_has_put_method_details_using_json_obj() throws IOException {
		res = RestAssured.given().spec(requestdetails());
	}

	@When("user calls the putapi with put http request using JsonObj")
	public void user_calls_the_putapi_with_put_http_request_using_json_obj() {
		jsob = new Post_Put_Delete_JsonObjecct();
		resource = new Resources();
		response = res.body(jsob.Post_JsObject()).when().post(resource.getPostapi());
	}

	@Then("The user should recieve status code success using JsonObj")
	public void the_user_should_recieve_status_code_success_using_json_obj() {
		assertEquals(response.getStatusCode(), 200);
	}

	@Then("Validating all the header")
	public void validating_all_the_header() {
		logger.info("=======Validating Response Header Server==========");

		logger.info(response.getHeader("Server"));
		assertEquals(response.getHeader("Server"), "Apache");
		logger.info("=========Response Header Server Validated Successfully=========\n");

		logger.info("=======Validating Response Header Powered-By==========");

		logger.info(response.getHeader("X-Powered-By"));
		assertEquals(response.getHeader("X-Powered-By"), "PHP/5.6.40");
		logger.info("=========Response Header Powered-By Validated Successfully=========\n");

		logger.info("=======Validating Response Header Access-Control-Allow-Origin==========");

		logger.info(response.getHeader("Access-Control-Allow-Origin"));
		assertEquals(response.getHeader("Access-Control-Allow-Origin"), "*");
		logger.info("=========Response Header Access-Control-Allow-Origin Validated Successfully=========\n");

		logger.info("=======Validating Response Header Access-Control-Allow-Methods==========");

		logger.info(response.getHeader("Access-Control-Allow-Methods"));
		assertEquals(response.getHeader("Access-Control-Allow-Methods"), "POST");
		logger.info("=========Response Header Access-Control-Allow-Methods Validated Successfully=========\n");

		logger.info("=======Validating Response Header Access-Control-Allow-Headers==========");

		logger.info(response.getHeader("Access-Control-Allow-Headers"));
		assertEquals(response.getHeader("Access-Control-Allow-Headers"), "Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");
		logger.info("=========Response Header Access-Control-Allow-Headers Validated Successfully=========\n");

		logger.info("=======Validating Response Header Upgrade==========");

		logger.info(response.getHeader("Upgrade"));
		assertEquals(response.getHeader("Upgrade"), "h2,h2c");
		logger.info("=========Response Header Upgrade Validated Successfully=========\n");

		logger.info("=======Validating Response Header Connection==========");

		logger.info(response.getHeader("Connection"));
		assertEquals(response.getHeader("Connection"), "Upgrade");
		logger.info("=========Response Header Connection Validated Successfully=========\n");

		logger.info("=======Validating Response Header Content-Length==========");

		logger.info(response.getHeader("Content-Length"));
		assertEquals(response.getHeader("Content-Length"), "40");
		logger.info("=========Response Header Content-Length Validated Successfully=========\n");

		logger.info("=======Validating Response Header Content-Type==========");

		logger.info(response.getHeader("Content-Type"));
		assertEquals(response.getHeader("Content-Type"), "application/json; charset=UTF-8");
		logger.info("=========Response Header Content-Type Validated Successfully=========\n");

		logger.info("All the Header are,");
		Headers allheader = response.getHeaders();
		
		for(Header header:allheader) {
			
			logger.info(header.getName()+" : "+header.getValue());
		}
	}

}
