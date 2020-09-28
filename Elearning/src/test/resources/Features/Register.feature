@Register
Feature: Register Features
This feature includes scenario that would register a new user

Background: 
Given I am able to naviagte onto the elarning page

Scenario Outline: register with your user
When I Enter the first name as "<fname>"
And I Enter the last name as "<lname>"
And I Enter the email as "<email>"
And I Enter the user name as "<uname>"
And I Enter the pass as "<pwd1>"
And I Enter the confirm password as "<pwd2>"
And I click on the register button
Then I should see the message