Feature: Edit an existing lead in Leaftaps Application

Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the home page is displayed

Scenario Outline: Edit Lead with different data
Given Click Find Leads Link
And Click on Edit Leads Link
When Update the company name as <companyName>
Then Submit the updated Lead
  
Examples:
|companyName|
|HCL|
|Boeing|