Feature: Tuto

Background: User navigates to Tuto
	Given  I am on tuto homepage
	
	@Tuto
	#Scenario for login in tuto platform
	
Scenario:
	When User login with the shared user for the talk account
	And User enters the password the above mentioned user
	And User clicks on the signin button
	And User click on the user icon on the Producer page