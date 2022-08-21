Feature: Login to Leaftapps Application
Background:
Given Launch the chrome browser
And Load the URL and maximize

Scenario: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When click on the login button
Then verify the home page is displayed

Scenario: Negative Login
Given Type the username as 'Demouser'
And Type the password as 'crmsfa1'
When click on the login button
But verify the error message is displayed