Feature: Tuto

Background: User navigates to Tuto
	Given  I am on QA homepage
	
	@Tuto
	#Scenario for login in tuto platform
	
Scenario:
	When User enters the Nimish username
	And User enters the Nimish password
	And User clicks on the signin button
	And User click on the user icon on the Producer page
	And User enters the firstname of new user
	And User enters the Lastname of new user
	And User enters the Email of new user
	And User selects content creation checkbox
	And User selects View Reports checkbox
	And User selects HRViewRights checkbox
	And User selects Message InboxRights checkbox
	And User selects Media ManagementRights checkbox
	And User selects User ManagementRights checkbox
	And User click on save user button
	
	And close the browser