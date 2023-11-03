@B30G6-157
Feature: Default

	#{color:#de350b}{*}User Story{*}:  {color}As a user, I want to manage filters on the Marketing page. 
	#
	# 
	#
	#{color:#de350b}*AC #1:* {color}Store and sales managers should see all 5 filter options are checked by default. 
	#
	# 
	#
	#{color:#de350b}*AC #2:* {color}any amount of boxes should be unchecked. (can check only 1, or multiple)
	@B30G6-155
	Scenario Outline: US14_AC1_TC1_Marketing Page Filters (default selections)
		Given login page is open
		    When "<user>" logs in
		    And opens Marketing Page
		    And clicks Manage Filters dropdown
		    Then "<user>" sees all five filters selected by default
		    
		    Examples: 
		    | user          |
		    | sales manager |
		    | store manager |

	#{color:#de350b}{*}User Story{*}:  {color}As a user, I want to manage filters on the Marketing page. 
	#
	# 
	#
	#{color:#de350b}*AC #2:* {color}any amount of boxes should be unchecked. (can check only 1, or multiple)
	@B30G6-156
	Scenario Outline: US14_AC2_TC2_Marketing Page Filters (custom selections)
		Given login page is open
		    When "<user>" logs in
		    And opens Marketing Page
		    And clicks Manage Filters dropdown
		    Then "<user>" can select any amount of checkboxes
		    
		    Examples: 
		    | user          |
		    | sales manager |
		    | store manager |