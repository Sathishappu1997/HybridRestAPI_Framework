Feature: validate the post request

Scenario: Validate the post request using JsonObject
Given The user has put method details using JsonObj
When user calls the putapi with put http request using JsonObj
Then The user should recieve status code success using JsonObj
Then Validating all the header
