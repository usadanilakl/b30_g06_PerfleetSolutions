Feature: Default

  @B30G6-150
  Scenario Outline: US12_AC1_TC1_Verify customer filter function
    Given user opens login page
    When "<user>" logs in
    And clicks on Account Page
    And clicks on filter manager
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