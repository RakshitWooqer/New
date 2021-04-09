Feature: Tuto

Background: User navigates to Tuto
	Given  I am on QA homepage
	
	@Tuto
	#Scenario User creates Normal task
Scenario:
	When User enters the mobileautomation username
	And User enters the mobileautomation password
	And User clicks on the signin button
	And User click on todo Button for task
	And User click on create Button for task
	And User click on New Task Button
	And User fill task title
	And User fill Task Detail
	And User enter asignee name in search field
	And User select user from the suggetions list
	And User click calendar for task
	And User select current date for task due date
	And User click on create task button
	And close the browser
	
	@Tuto
	#Scenario2 assignee complete task
	

Scenario:
	
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User click on todo Button for task
	And User click on task in todo
	And User enter text for comment
	And User click on comment btn
	And User click on Complete task btn
	And User click on Task Complete Done btn
	And close the browser
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Tuto
	#Scenario User Group task
Scenario:
	When User enters the mobileautomation username
	And User enters the mobileautomation password
	And User clicks on the signin button
	And User click on todo Button for task
	And User click on create Button for task
	And User click on New Task Button
	And User fill task title
	And User fill Task Detail
	And User click on Task Assign to group checkbox
	And User enter Group name in search field
	And User select user from the suggetions list
	And User click calendar for task
	And User select current date for task due date
	And User click on create task button
	And close the browser
	
	@Tuto
	#Scenario2 assignee complete group task
	

Scenario:
	
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User click on todo Button for task
	And User click on task in todo
	And User enter text for comment
	And User click on comment btn
	And User click on I am on it button
	And User click on Release button
	And User click on I am on it button
	And User click on Group Task Complete button
	And User click on Task Complete Done btn
	And close the browser
	
	
		@Tuto
	#Scenario Admin User conclude the Group Task
Scenario:
	When User enters the mobileautomation username
	And User enters the mobileautomation password
	And User clicks on the signin button
	And User click on todo Button for task
	And User click on pending with Others tab
	And User Open Task in pending With Others Tab
	And User click on Conclude button
	And User click on Conclude comment done button
	And close the browser