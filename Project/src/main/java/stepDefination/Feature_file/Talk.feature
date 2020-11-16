Feature: Tuto

Background: User navigates to Tuto
	Given  I am on tuto homepage
	
	@Tuto
	#Scenario User creates a talk with one user
Scenario:
	When User enters the username
	And User enters the password
	And User clicks on the signin button
	And User click on the Talk Button
	And User enter the text on the talk page
	And User click on the share with field and enters the user details
	And User selects the user from the drop down
	And User click on the share button
	And User click on the profile icon
	Then User click on signout button
	
	@Tuto
	#Scenario Assigned user verifies,endorse,comment,conclude the task
Scenario:
	When User login with the shared user for the talk account
	And User enters the password the above mentioned user
	And User clicks on the signin button
	And User click on the Talk Button
	And User clicks on the comment button on the talk assigned
	And User commnets on the talk
	And User clicks on the comment button at the bottom section to enter comment on the talk
	And User clicks on the Endore button and endorse the talk
	And User click on the profile icon
	And User click on signout button
	And  User enters the username
	And User enters the password
	And User clicks on the signin button
	And User click on the Talk Button
	And User clicks on the conclude button
	And User conclude the task with the comment
	And User enters the conclude message
	And User clicks on the conclude button at the bottom of the conclude section
	