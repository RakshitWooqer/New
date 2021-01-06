Feature: Tuto

Background: User navigates to Tuto
	Given  I am on tuto homepage
	
	@Tuto
	#Scenario User creates a talk with one user
Scenario:
	When User enters the username
	And User enters the password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select Audit type
	And User enters Audit Process name
	And User click on continue button
	And User enters Process process objective
	And User selects city as coverage
	And User open list coverages
	And User selects All coverage and done
	And User selects has_cutoff
	And User selects MultipleRecords
	And User save the process details
	And User click on Add new Task Audit
	And User selects score type
	And User Add question title
	And User select Add another option
	And User click on save question
	And User selects short type
	And User Add Short question title
	And User click on save question
	And User selects Descriptive type
	And User Add Descriptive question title
	And User click on save question
	And User selects rating type
	And User Add Rating question title
	And User Add Rating Area should be rated
	And User Add Audit Rating Options and weightag
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add Audit MCSA Options and weightage
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add Audit MCMA Options and weightage
	And User select Add another option
	And User click on save question
	And User click on Process save button
	And User click on Assign button
	And User search for the assignee
	And User click on assign for searched user
	And User click on Check all
	And User click on Share all
	And User click on Done button
	And User click on back to process
	And User search for created process
	And User click on change to activate process
	
	
	
	
	
	
	
	
	
	
	
	
	
	