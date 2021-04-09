Feature: Tuto

Background: User navigates to Tuto
	Given  I am on QA homepage
	
	@Tuto
	#Scenario for login in tuto platform
	
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User clicks on the manage Pi tab
	And User click on the Roles tab
	And User click on the add new Role
	And User enters the Name of new role
	And User click on Functions Dropdown
	And User choose function option From Dropdown
	And User click on Topline checkbox
	And User click on save role button
	And User search for the role created
	And User confirm the created role
	And close the browser