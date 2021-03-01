Feature: Tuto

Background: User navigates to Tuto
	Given  I am on QA homepage
	
	@Tuto
	#Scenario 1 User creates a Assessment with Monthly Periodicity
Scenario:
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select Assessment type
	And User enters Assessment Process name
	And User click on continue button
	And User enters Process process objective
	And User set 2 min as Duration time for assess
	And User set MaxAttempts as 10
	And User set Maximum Marks as 4
	And User set Threshold as 50%
	And User save the process details
	And User click on Add new Question button
	And User selects short type
	And User Add Short question title
	And User select Add another option
	And User click on save question
	And User selects Descriptive type
	And User Add Descriptive question title
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
	And User selects 1st as correct option
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
	And User selects 1st as correct option MCMA
	And User select Add another option
	And User click on save question
	And User clicks on gear icon to set question properties
	And User set no. of questions
	And User set score per question
	And User clicks on apply for question config
	And User click on Process save button
	And User click on Assign button
	And User search for the Analysts role
	And User clicks on assign for the searched person
	And User go to the content page
	And User go to the process tab
	And User search for created process
	And User Set Evaluator for Assess
	And User go to the content page
	And User go to the process tab
	And User search for created process
	And User click on change to activate process
	And User go to the todo page
	And User click on process in todo
	And User click on AssessProcess_ViewAll for Assess process in todo 
	And User click on Star button for Assess process in todo
	And User click on Star confirm button for Assess process in todo
	And User fill assess short
	And User fill assess Desc
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click submit for assess
	And close the browser
	
	@Tuto
	#City Coverage
	#Scenario 2 User creates a Assessment with Quaterly Periodicity
Scenario:
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select Assessment type
	And User enters Assessment Process name
	And User click on continue button
	And User enters Process process objective
	And User selects Quaterly periodicity
	And User set 2 min as Duration time for assess
	And User set MaxAttempts as 10
	And User set Maximum Marks as 4
	And User set Threshold as 50%
	And User save the process details
	And User click on Add new Question button
	And User selects short type
	And User Add Short question title
	And User select Add another option
	And User click on save question
	And User selects Descriptive type
	And User Add Descriptive question title
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
	And User selects 1st as correct option
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
	And User selects 1st as correct option MCMA
	And User select Add another option
	And User click on save question
	And User clicks on gear icon to set question properties
	And User set no. of questions
	And User set score per question
	And User clicks on apply for question config
	And User click on Process save button
	And User click on Assign button
	And User search for the Analysts role
	And User clicks on assign for the searched person
	And User go to the content page
	And User go to the process tab
	And User search for created process
	And User Set Evaluator for Assess
	And User go to the content page
	And User go to the process tab
	And User search for created process
	And User click on change to activate process
	And User go to the todo page
	And User click on process in todo
	And User click on AssessProcess_ViewAll for Assess process in todo 
	And User click on Star button for Assess process in todo
	And User click on Star confirm button for Assess process in todo
	And User fill assess short
	And User fill assess Desc
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click submit for assess
	And close the browser
	

	
	@Tuto
	#Scenario 3 User creates a Assessment with Half yearly periodicity
Scenario:
When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select Assessment type
	And User enters Assessment Process name
	And User click on continue button
	And User enters Process process objective
	And User selects Halfannually periodicity
	And User set 2 min as Duration time for assess
	And User set MaxAttempts as 10
	And User set Maximum Marks as 4
	And User set Threshold as 50%
	And User save the process details
	And User click on Add new Question button
	And User selects short type
	And User Add Short question title
	And User select Add another option
	And User click on save question
	And User selects Descriptive type
	And User Add Descriptive question title
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
	And User selects 1st as correct option
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
	And User selects 1st as correct option MCMA
	And User select Add another option
	And User click on save question
	And User clicks on gear icon to set question properties
	And User set no. of questions
	And User set score per question
	And User clicks on apply for question config
	And User click on Process save button
	And User click on Assign button
	And User search for the Analysts role
	And User clicks on assign for the searched person
	And User go to the content page
	And User go to the process tab
	And User search for created process
	And User Set Evaluator for Assess
	And User go to the content page
	And User go to the process tab
	And User search for created process
	And User click on change to activate process
	And User go to the todo page
	And User click on process in todo
	And User click on AssessProcess_ViewAll for Assess process in todo 
	And User click on Star button for Assess process in todo
	And User click on Star confirm button for Assess process in todo
	And User fill assess short
	And User fill assess Desc
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click submit for assess
	And close the browser
	
	
	
	
	@Tuto
	#Scenario 4 User creates a Assessment with Annualy periodicity
Scenario:
When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select Assessment type
	And User enters Assessment Process name
	And User click on continue button
	And User enters Process process objective
	And User selects Annually periodicity
	And User set 2 min as Duration time for assess
	And User set MaxAttempts as 10
	And User set Maximum Marks as 4
	And User set Threshold as 50%
	And User save the process details
	And User click on Add new Question button
	And User selects short type
	And User Add Short question title
	And User select Add another option
	And User click on save question
	And User selects Descriptive type
	And User Add Descriptive question title
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
	And User selects 1st as correct option
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
	And User selects 1st as correct option MCMA
	And User select Add another option
	And User click on save question
	And User clicks on gear icon to set question properties
	And User set no. of questions
	And User set score per question
	And User clicks on apply for question config
	And User click on Process save button
	And User click on Assign button
	And User search for the Analysts role
	And User clicks on assign for the searched person
	And User go to the content page
	And User go to the process tab
	And User search for created process
	And User Set Evaluator for Assess
	And User go to the content page
	And User go to the process tab
	And User search for created process
	And User click on change to activate process
	And User go to the todo page
	And User click on process in todo
	And User click on AssessProcess_ViewAll for Assess process in todo 
	And User click on Star button for Assess process in todo
	And User click on Star confirm button for Assess process in todo
	And User fill assess short
	And User fill assess Desc
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click submit for assess
	And close the browser
	
	
	
	@Tuto
	#Scenario 5 User creates a Assessment with Cyclic periodicity
Scenario:
When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select Assessment type
	And User enters Assessment Process name
	And User click on continue button
	And User enters Process process objective
	And User enters Cyclic duration as 3
	And User enters start date as today
	And User enters Cyclic lable as 1
	And User set 2 min as Duration time for assess
	And User set MaxAttempts as 10
	And User set Maximum Marks as 4
	And User set Threshold as 50%
	And User save the process details
	And User click on Add new Question button
	And User selects short type
	And User Add Short question title
	And User select Add another option
	And User click on save question
	And User selects Descriptive type
	And User Add Descriptive question title
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
	And User selects 1st as correct option
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
	And User selects 1st as correct option MCMA
	And User select Add another option
	And User click on save question
	And User clicks on gear icon to set question properties
	And User set no. of questions
	And User set score per question
	And User clicks on apply for question config
	And User click on Process save button
	And User click on Assign button
	And User search for the Analysts role
	And User clicks on assign for the searched person
	And User go to the content page
	And User go to the process tab
	And User search for created process
	And User Set Evaluator for Assess
	And User go to the content page
	And User go to the process tab
	And User search for created process
	And User click on change to activate process
	And User go to the todo page
	And User click on process in todo
	And User click on AssessProcess_ViewAll for Assess process in todo 
	And User click on Star button for Assess process in todo
	And User click on Star confirm button for Assess process in todo
	And User fill assess short
	And User fill assess Desc
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click submit for assess
	And close the browser