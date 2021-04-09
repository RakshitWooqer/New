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
	And User click on the Resource tab
	And User click on the add new Resource
	And User enters the Name of new resource
	And User enters the Defination of new resource
	And User choose Resource type as store
	And User click on store list
	And User selects all stores
	And User click on done button after selection
	And User search for manager
	And User select manager from Dropdown
	And User click on save resource button
	And User search for the resource created
	And User confirm the created resource
	And And close the browser