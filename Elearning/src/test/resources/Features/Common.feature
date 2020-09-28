Feature: Register Features
This feature includes scenario that would register a new user

Background:
Given I am able to naviagte onto the elarning page

@Register
Scenario: register with your user
When I Enter the first name as "<fname>"
And I Enter the last name as "<lname>"
And I Enter the email as "<email>"
And I Enter the user name as "<uname>"
And I Enter the pass as "<pwd1>"
And I Enter the confirm password as "<pwd2>"
And I click on the register button
Then I should see the message

@Login
Scenario: login with your user
When I Enter the username as "<user>"
And I Enter the password as "<pwd>"
And I click on the login button
Then i should see the username as "<name>"

Examples:
|user				  |pwd		        |name		|
|snehashree		|Varad@124      |Sneha K|

@Mail
Scenario: click on compose
When I Enter Send to mail as "<sendtomail>"
And I Enter subject as "<subject>"
And I Enter message as "<message>"
And I click on send message button
Then I should get acknowledgement
