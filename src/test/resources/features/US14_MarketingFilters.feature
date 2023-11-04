@B30G6-157
Feature: Default


  @B30G6-155
  Scenario Outline: US14_AC1_TC1_Marketing Page Filters (default selections)
    When user opens login page
    And "<user>" logs in
    And clicks on Marketing Page
    And clicks Manage Filters dropdown
    Then user sees all five filters selected by default

    Examples:
      | user          |
      | sales manager |
      | store manager |


  @B30G6-156
  Scenario Outline: US14_AC2_TC2_Marketing Page Filters (custom selections)
    When user opens login page
    And "<user>" logs in
    And clicks on Marketing Page
    And clicks Manage Filters dropdown
    Then user can select any amount of checkboxes

    Examples:
      | user          |
      | sales manager |
      | store manager |