Feature: Demo Project for company

  Background: 
    Given user is navigated into bank demo website
    
@accounts
Scenario: Accounts page - title
Given user is on Demo banking page
When user enters the user name
And the user enters the password
Then verify 