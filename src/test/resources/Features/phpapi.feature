Feature: Verifying Change2testautomation api 
@Post
Scenario: Validating the post method 
Given The user has post method details
When user calls the postapi with post http request
Then api calls get success with the status code 
And status response body is success

@Put
Scenario: Validating the put method 
Given The user has put method details
When user calls the putapi with put http request
Then The user should recieve status code success 

@Get
Scenario: Validating the get method
Given The user has get method details
When user calls the getapi with get http request
Then The user can able to retrieve all resources

@Delete
Scenario: validating the delete method
Given The user has delete method details
When user calls the deleteapi with delete http request
Then The user should be able to delete the resource successfully
