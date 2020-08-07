Feature: verifying the datadriven testing for change2testautomation api

Scenario Outline: Validating the post method using data driven concept
Given The user has post method details with "<title>" "<body>" "<author>"
When user sends  post http request
Then user gets data successly inserted 

Examples:
|title|body|author|
|a13|b13|a31|
|a31|b31|c31|

Scenario Outline: Validating the data driven with the put method 
Given The user have put method details with "<id>" "<author>"
When put http request is sent by user
Then Data updated successfully message is recieved

Examples:
|id|author|
|233|d11|
|234|d12|
