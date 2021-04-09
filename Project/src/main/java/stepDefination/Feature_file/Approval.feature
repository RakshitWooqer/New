Feature: Tuto

Background: User navigates to Tuto
	Given  I am on QA homepage
	
	@Tuto
	#Scenario User creates a talk with one user
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User click on todo Button for task
	And User click on create Button for task
	And User click on New Approval Button
	And User fill Approval title
	And User fill approval Detail
	And User enter Approval asignee name in search field
	And User select user from the suggetions list Approval
	And User click on create Approval button
	And close the browser
	
	@Tuto
	#Scenario2 assignee user will open the Approve and Approve it
	

Scenario:
	
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User click on todo Button for task
	And User click on approval in todo
	And User enter text for comment Approval
	And User click on Approval comment btn
	And User click on Approve btn
	And User click on Approve Complete Done btn
	
	