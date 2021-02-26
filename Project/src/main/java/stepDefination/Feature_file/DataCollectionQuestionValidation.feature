Feature: Tuto

Background: User navigates to Tuto
	Given  I am on QA homepage
	

	
	@Tuto
	#Scenario User fill incorrect validation data for questions
Scenario:
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the todo page
	And User click on DC short validation process in todo
	And User click on Star button for DC process in todo
	And User Fill Short with text validation Incorrect data
	And User Fill Short with Number validation Incorrect data
	And User Fill Short with Percentage validation Incorrect data
	And User Fill Short with Range validation Incorrect data
	And User Fill Short with Length validation lower than minimum
	And User Fill Short with Email validation Incorrect data
	And User Fill Short with Zipcode validation Incorrect data
	And User Fill Score with Range validation Incorrect answer
    And User click n submit button to submit
	
	And User check if Short Text Validation Warning is shown
	And User check if Short Number Validation Warning is shown
	And User check if Short Percentage Validation Warning is shown
	And User check if Short Range Validation Warning is shown
	And User check if Short Length Validation Warning is shown
	And User check if Short Email Validation Warning is shown
	And User check if Short Zipcode Validation Warning is shown
	And User check if Short Mandatory Warning is shown
	And User check if Score with Range validation Warning is shown
	
	And User Fill Short with text validation correct data
	And User Fill Short with Number validation correct data
	And User Fill Short with Percentage validation correct data
	And User Fill Short with Range validation correct data
	And User Fill Short with Length validation More than Maximum
	And User Fill Short with Email validation correct data
	And User Fill Short with Zipcode validation correct data
	And User Fill Mandatory short answer
	And User Fill Score with Range validation correct data
	And User click n submit button to submit
	
	And User check if Short Length Validation Warning is shown
	And User Fill Short with Length validation correct data
	
	And User click n submit button to submit
	And User check if process is submitted
	And close the browser