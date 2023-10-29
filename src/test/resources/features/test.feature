Feature: test new project

  Scenario Outline: open google and search something
    Given google home page is open
    When "<search value>" is inputed into google search and enter is pressed
    Then google search results are shown for "<search value>"
    Examples:
    |search value|
    |SDET        |
    |how to test dropdown|
    |Cucumber framework  |