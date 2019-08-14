Feature: Facebook sign in test
Scenario: User must be able to sign in with valid email and password
Given user is able to go to homepage 
When user enters valid email 
And user enters valid password
And user clicks sign in button 
Then user will be able to access account
