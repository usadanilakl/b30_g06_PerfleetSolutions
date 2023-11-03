@B30G6-153
Feature: Default

	#{color:#de350b}*User Story* :  {color}As a user, I want to manage filters on the Vehicle Costs page. (Web table and checkbox) 
	#
	# 
	#
	#{color:#de350b}*AC #1:* ** {color}Users should see 3 columns on the Vehicle Costs page.
	#
	# Expected Column names:  TYPE, TOTAL PRICE, DATE
	@B30G6-151
	Scenario Outline: US13_AC1_TC1_Vehicle Cost Filters Table
		Given login page is open
		    When "<user>" logs in
		    And opens Vehicle Costs Page
		    Then table with the following columns is shown
		    |TYPE|
		    |TOTAL PRICE|
		    |DATE|
		    Examples: 
		    | user          |
		    | sales manager |
		    | store manager |

	#{color:#de350b}*User Story* :  {color}As a user, I want to manage filters on the Vehicle Costs page. (Web table and checkbox) 
	#
	#{color:#de350b}*AC #2:* {color}users check the first checkbox to check all the Vehicle Costs  
	@B30G6-152
	Scenario Outline: US13_AC2_TC2_Vehicle Cost Filter Checkboxes
		Given login page is open
		    When "<user>" logs in
		    And opens Vehicle Costs Page
			Then all checkboxes are deselected
		    When clicks on checkbox next to type colunm
		    Then all checkboxes are selected
		    When clicks on checkbox next to type colunm
		    Then all checkboxes are deselected
		    Examples: 
		    | user          |
		    | sales manager |
		    | store manager |