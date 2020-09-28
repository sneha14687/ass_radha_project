Feature: Sending Mail Feature
This feature includes scenario that would compose a mail

@Mail
Scenario: Compose a mail
Given Elearning is logged in
When I click on compose button 
And I Enter Send to mail as "<sendtomail>"
And I Enter subject as "<subject>"
And I Enter message as "<message>"
And I click on send message button
Then I should get acknowledgement