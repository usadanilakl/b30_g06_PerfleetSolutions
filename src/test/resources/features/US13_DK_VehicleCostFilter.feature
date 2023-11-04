@B30G6-153
Feature: Default


  @B30G6-151
  Scenario Outline: US13_AC1_TC1_Vehicle Cost Filters Table
    When user opens login page
    And "<user>" logs in
    And clicks on Vehicle Costs Page
    Then table with the following columns should be shown
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
    Examples:
      | user          |
      | sales manager |
      | store manager |
      | driver        |


  @B30G6-152
  Scenario Outline: US13_AC2_TC2_Vehicle Cost Filter Checkboxes
    When user opens login page
    And "<user>" logs in
    And clicks on Vehicle Costs Page
    Then all checkboxes should be deselected
    When user clicks on checkbox next to type column
    Then all checkboxes should be selected
    When user clicks on checkbox next to type column
    Then all checkboxes should be deselected
    Examples:
      | user          |
      | sales manager |
      | store manager |
