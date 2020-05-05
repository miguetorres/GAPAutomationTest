#Author: mtorresaraya@gmail.com


Feature: Create a new entry into the vacations tool management page 
		User should be able to login into the vacations management page using the correct credentials
		User Should be able to create a new user 
		User should be able to validate new entry and delete it 
  
  @Login
  Scenario Outline: Login into the account with correct credentials 
    Given User navigates to the vacations management login website "<url>"
    And User enters a valid email "<email>"
    And User enters a valid password "<password>"
    When Users clicks on the sign in button
    Then The user should be signed in successfully

    Examples: 
     | url | email  | password | 
     | https://vacations-management.herokuapp.com/users/sign_in | gap-automation-test@mailinator.com | 12345678 | 
      
	@CreateUser
  Scenario Outline: Create a new user 
    Given User clicks the create new employee button
    And User enters the name "<firstName>"
    And User enters the last name "<lastName>"
    And User enters the email "<email>"
    And User enters the identification "<id>"
    And User enters the leader name "<leaderName>"
    And User selects the year "<year>"
    And User selects the month "<month>"
    And User selects the day "<day>"
    When User clicks the create employee button 
    Then The new user is successfully created 

    Examples: 
      | firstName  | lastName | email  | id | leaderName | year | month | day |
      | James | Smith | mtorresaraya@gmail.com | 1234567890 | Jose Miguel | 2015 | January | 21 |
      
  @EmployeesList
  Scenario Outline: Create a new user 
    Given User clicks the employees information tab
    And User validates new employee leader name "<leaderName>"
    When User clicks the delete button 
    Then The user is successfully deleted 

    Examples:
    | leaderName | 
    | Jose Miguel | 
      