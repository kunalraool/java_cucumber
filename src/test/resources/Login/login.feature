@Login
Feature: To validate login application 
This feature includes validating login application
1)Valid case
2)Invalid case
Background: 
Given We should be in home page

@HappyPath, @Regresion
Scenario: To validate login using valid credentials
When Enter valid Name
And Enter valid Password
And Click on Login Button
Then Login should be successful

@InvalidCase
Scenario: To test login with Invalid credentials
When Enter invalid  Name
And Enter invalid Password
And Click on Login Button
Then error message should displayed