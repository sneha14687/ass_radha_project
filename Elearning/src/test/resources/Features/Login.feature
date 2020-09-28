Feature: Login Features
This feature includes scenario that would validate the following features.
1. Login as sneha

Background: 
Given I am able to naviagte onto the login page

@Login
Scenario Outline: login with your user
When I Enter the username as "<user>"
And I Enter the password as "<pwd>"
And I click on the login button
Then i should see the username as "<name>"

Examples:
|user				  |pwd		        |name		|
|snehashree		|Varad@124      |Sneha K|