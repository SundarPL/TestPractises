
Feature: To Validate home page
Scenario: To validate the home page
Given User is on home page
When User enter the details
Then user Click the ok button and user is on search page

Scenario: To Validate the Search Page
When user enter the valid details 
Then User click the ok 
And User is navigating to payment page

Scenario:To validate the payment page
When User enter the payment info for purchasing the product
Then User enter the buy now button
