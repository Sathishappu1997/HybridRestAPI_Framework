Feature: verifying the reusable datadriven testing concept
@reuse
Scenario: Validating the data driven reusable concept
Given User has the details 
When The user use "postapi" and "postpayload" http method
Then The "message" in response body is "Data Inserted Successfully"


