Feature: verifying the reusable datadriven testing concept

@reuse
Scenario Outline: Validating the data driven reusable concept
Given User has the details 
When The user use "<requestapi>" and "<body>" http method
Then The "<keyvalue>" in response body is "<responsevalue>"

Examples:

|requestapi|body|keyvalue|responsevalue|
|postapi|postpojo|message|Data Inserted Successfully|
|putapi|putpayload|message|Data updated successfully|
|deleteapi|Deletehashmap|message|Post Deleted Successfully|

