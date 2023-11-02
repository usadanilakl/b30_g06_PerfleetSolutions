Feature: Default

	#{color:#de350b}{*}User Story{*}:{color}  As a user, I want to filter customers’ info on the Account page.  
	#
	#{color:#de350b}*AC1:* {color}users should see 8 filter items on the Accounts page 
	#
	#*Expected filter names:*  Account Name, Contact Name, Contact Email, Contact Phone, Owner,  Business Unit, Created At, Updated At
  @B30G6-150
  Scenario Outline: US12_AC1_TC1_Verify customer filter function
    Given login page is open
    When "<user>" logs in
    And opens Account Page
    And opens filter manager
    Then all filters are displayed
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |
    Examples:
      | user          |
      | sales manager |
      | store manager |