Feature: Tuto

Background: User navigates to Tuto
	Given  I am on QA homepage
	
	



























	
	@Tuto
	#Scenario User creates and fill the Audit MLRA fill proceess and assign to level 1
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select Audit type
	And User enters Audit MLRA Process name
	And User click on continue button
	And User enters Process process objective
	And User selects city as coverage
	And User open list coverages
	And User selects All coverage and done
	And User save the process details
	And User click on Add new Task Audit
	And User selects MCSA type
	And User Add MCSA question title
	And User Add Audit MCSA Options and weightage
	And User select Add another option
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add Audit MCMA Options and weightage
	And User select Add another option
	And User click on save question
	And User click on gear button for 2nd question
	And User click on require Action Checkbox
	And User fill 1 in require level Textkbox
	And User click on Apply button for question config
	And User click on Process save button
	And User click on choose Optionbased Closure condition
	And User click on Done button for closer condition
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
	And User click on Done button for closer condition
	And User go to the todo page
	And User click on process in todo
	And User click on Star button for Audit process in todo
	And User Fill the MCSA1 answer
	And Level 0: user fill and assign to user Gourav
	And User click n submit button to submit
	And close the browser
	
	
	@Tuto
	#Audit MLRA fill level 1
	#Scenario User fill the process on level 1 and assign to level 2
Scenario:
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the todo page
	And User click on process in todo
	And MLRA L1:user click on start
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And MLRA L1:user click on update to submit
	And close the browser
	
	
	
	
	
	
	
	
	
	