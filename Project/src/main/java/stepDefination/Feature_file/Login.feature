Feature: Tuto

Background: User navigates to Tuto
	Given  I am on tuto homepage
	
	@Tuto
	#Scenario for login in tuto platform
Scenario:
	When User enters the username
	And User enters the password
	And User clicks on the signin button
	And User verify the homepage tittle to check whether login is working or not