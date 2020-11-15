Feature: Tuto

Background: User navigates to Tuto
	Given  I am on tuto homepage
	
	@Tuto
	#Scenario User creates a talk
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
	#Scenario Another User verify the created talk
Scenario:
	When User login with the shared user for the talk account
	And User enters the password the above mentioned user
	And User clicks on the signin button
	And User click on the Talk Button