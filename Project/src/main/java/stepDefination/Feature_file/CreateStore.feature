Feature: Tuto

Background: User navigates to Tuto
	Given  I am on QA homepage
	
	@Tuto
	#Scenario for login in tuto platform
	
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User click on the Store icon on the Producer page
	And User enters the Name of new store
	And User enters the Display name of new store
	And User enters the BrandName of new store
	And User enters the Store address of new store
	And User enters the Store Area of new store
	And User click on State of new store
	And User select Assam from Dropdown
	And User click on City of new store
	And User select city from Dropdown
	And User fill on Zip of new store
	And User click on SaveStore