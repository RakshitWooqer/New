Feature: Tuto

Background: User navigates to Tuto
	Given  I am on QA homepage
	
	@Tuto
	#Scenario User creates a Data Collection process with weekly periodicity and assign to another user
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select DC type
	And User enters DC Process name
	And User click on continue button
	And User enters Process process objective
	And User selects city as coverage
	And User open list coverages
	And User selects All coverage and done
	And User selects Weekly periodicity
	And User save the process details
	And User click on Add new Task DC
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
	And User Add DC Rating Options
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
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
	
	@Tuto
	#Scenario User Login from Assignee and fill the process with Weekly periodicity
Scenario:
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the todo page
	And User click on process in todo
	And User click on Star button for DC process in todo
	And User Fill the 1st score answer
	And User Fill the 1st short answer
	And User Fill the 1st Description answer
	And User select options for 1st Rating
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click n submit button to submit
	

	
	@Tuto
	#Scenario 2 User creates a Data Collection process with Monthly periodicity and assign to another user
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select DC type
	And User enters DC Process name
	And User click on continue button
	And User enters Process process objective
	And User selects city as coverage
	And User open list coverages
	And User selects All coverage and done
	And User selects Monthly periodicity
	And User save the process details
	And User click on Add new Task DC
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
	And User Add DC Rating Options
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
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
	
	@Tuto
	#Scenario2 User Login from Assignee and fill the process with Monthly periodicity
Scenario:
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the todo page
	And User click on process in todo
	And User click on Star button for DC process in todo
	And User Fill the 1st score answer
	And User Fill the 1st short answer
	And User Fill the 1st Description answer
	And User select options for 1st Rating
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click n submit button to submit
	
	
	
	
	
		@Tuto
	#Scenario 3 User creates a Data Collection process with Quaterly periodicity and assign to another user
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select DC type
	And User enters DC Process name
	And User click on continue button
	And User enters Process process objective
	And User selects city as coverage
	And User open list coverages
	And User selects All coverage and done
	And User selects Quaterly periodicity
	And User save the process details
	And User click on Add new Task DC
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
	And User Add DC Rating Options
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
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
	
	@Tuto
	#Scenario3 User Login from Assignee and fill the process with Quaterly periodicity
Scenario:
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the todo page
	And User click on process in todo
	And User click on Star button for DC process in todo
	And User Fill the 1st score answer
	And User Fill the 1st short answer
	And User Fill the 1st Description answer
	And User select options for 1st Rating
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click n submit button to submit
	
	
	
	
			@Tuto
	#Scenario 4 User creates a Data Collection process with Half Annually periodicity and assign to another user
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select DC type
	And User enters DC Process name
	And User click on continue button
	And User enters Process process objective
	And User selects city as coverage
	And User open list coverages
	And User selects All coverage and done
	And User selects Halfannually periodicity
	And User save the process details
	And User click on Add new Task DC
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
	And User Add DC Rating Options
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
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
	
	@Tuto
	#Scenario 4 User Login from Assignee and fill the process with Half Annually periodicity
Scenario:
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the todo page
	And User click on process in todo
	And User click on Star button for DC process in todo
	And User Fill the 1st score answer
	And User Fill the 1st short answer
	And User Fill the 1st Description answer
	And User select options for 1st Rating
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click n submit button to submit
	
	
	
	
	
	
			@Tuto
	#Scenario 5 User creates a Data Collection process with Annually periodicity and assign to another user
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select DC type
	And User enters DC Process name
	And User click on continue button
	And User enters Process process objective
	And User selects city as coverage
	And User open list coverages
	And User selects All coverage and done
	And User selects Annually periodicity
	And User save the process details
	And User click on Add new Task DC
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
	And User Add DC Rating Options
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
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
	
	@Tuto
	#Scenario 5 User Login from Assignee and fill the process with Annually periodicity
Scenario:
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the todo page
	And User click on process in todo
	And User click on Star button for DC process in todo
	And User Fill the 1st score answer
	And User Fill the 1st short answer
	And User Fill the 1st Description answer
	And User select options for 1st Rating
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click n submit button to submit
	
	
	
	
	
	@Tuto
	#Scenario 6 User creates a Data Collection process with Cyclic periodicity and assign to another user
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User go to the content page
	And User go to the process tab
	And User click Add new button
	And User select DC type
	And User enters DC Process name
	And User click on continue button
	And User enters Process process objective
	And User selects city as coverage
	And User open list coverages
	And User selects All coverage and done
	And User selects Cyclic periodicity
	And User enters Cyclic duration as 3
	And User enters start date as today
	And User enters Cyclic lable as 1
	And User selects MultipleRecords
	And User save the process details
	And User click on Add new Task DC
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
	And User Add DC Rating Options
	And User click on save question
	And User selects MCSA type
	And User Add MCSA question title
	And User Add DC MCSA Options
    And User click on save question 
	And User selects MCMA type
	And User Add MCMA question title
	And User Add DC MCMA Options
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
	
	@Tuto
	#Scenario 6 User Login from Assignee and fill the process with Annually periodicity
Scenario:
	When User enters the Gourav username
	And User enters the Gourav password
	And User clicks on the signin button
	And User go to the todo page
	And User click on process in todo
	And User click on Star button for DC process in todo
	And User Fill the 1st score answer
	And User Fill the 1st short answer
	And User Fill the 1st Description answer
	And User select options for 1st Rating
	And User Fill the MCSA1 answer
	And User Fill the MCMA1 answer
	And User Fill the MCMA2 answer
	And User click n submit button to submit