Feature: Tuto

Background: User navigates to Tuto
	Given  I am on QA homepage
	
	
	
	
@Tuto
#Scenario User creates Beginner chapter and Module assign to Nimish
Scenario:Beginner Module
When User enters the mobileautomation username
And User enters the mobileautomation password
And User clicks on the signin button
And User go to the content page
And User click on the Chapter tab
And User click on the Chapter Add New
And User enter the chapter Name
And User enter the chapter Summary
And User selects the image for chapter
And User click on save chapter Button
And User click on Share chapter Button
And User enter module name
And User enter module objective
And User enter module summary
And User add PDF for module
And User click on save Module btn
And User click on assign on popup
And User search for the assignee
And User assign module to Nimish jain
And User click on Activate Module
And close the browser

@Tuto

#Scenario User Login with Nimish user and fill complete the Beginner module
Scenario: 
When User enters the Nimish username
And User enters the Nimish password
And User clicks on the signin button
And User click on Home tab
And User click on Module in home page
And User click on Chapter in home page
And User click on chapter complete btn
And close the browser


@Tuto
#Scenario User creates chapter and Spotlight Module assign to Nimish
Scenario: Spotlight Module
When User enters the mobileautomation username
And User enters the mobileautomation password
And User clicks on the signin button
And User go to the content page
And User click on the Chapter tab
And User click on the Chapter Add New
And User enter the chapter Name
And User enter the chapter Summary
And User selects the image for chapter
And User click on save chapter Button
And User click on Share chapter Button
And User enter module name
And User enter module objective
And User enter module summary
And User click on spotlight radio Btn
And User enters custom type Text
And User add PDF for module
And User click on save Module btn
And User click on assign on popup
And User search for the assignee
And User assign module to Nimish jain
And User click on Activate Module
And close the browser

@Tuto

#Scenario User Login with Nimish user and fill complete the Beginner module
Scenario: 
When User enters the Nimish username
And User enters the Nimish password
And User clicks on the signin button
And User click on Home tab
And User click on Module in home page
And User click on Chapter in home page
And User click on chapter complete btn
And close the browser
	
	@Tuto
	#Scenario User creates chapter and Spotlight Module assign to Nimish
Scenario: Module files formats
	When User enters the mobileautomation username
	And User enters the mobileautomation password
	And User clicks on the signin button
	And User go to the content page
	And User click on the Chapter Add New
	And User enter module name
	And User enter module objective
	And User enter module summary
	And User click on spotlight radio Btn
	And User enters custom type Text
	And User add PDF for module
	And User add Mp4 for module
	And User add Jpg for module
	And User add Mov for module
	And User add Excel for module
	And User add PPT for module
	And User click on save Module btn
	And User click on assign on popup
	And User search for the assignee
	And User assign module to Nimish jain
	And User click on Activate Module
	And close the browser
	
	
	
	@Tuto

#Scenario User Login with Nimish user and fill complete the Beginner module
Scenario: 
When User enters the Nimish username
And User enters the Nimish password
And User clicks on the signin button
And User click on Home tab
And User click on Module in home page
And User click on Mp4 file Chapter in home page
And Validate that video content is loading
And User click on PDF file Chapter in home page
And Validate that PDF or Image content is loading
And User click on JPG file Chapter in home page
And Validate that PDF or Image content is loading
And User click on Excel file Chapter in home page
And Validate that PDF or Image content is loading
And User click on PPT file Chapter in home page
And Validate that PDF or Image content is loading
And User click on Mov file Chapter in home page
And Validate that chapter video content is loading
And close the browser

