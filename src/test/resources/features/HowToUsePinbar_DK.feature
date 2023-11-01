@pinbar
Feature: As a user, I want to learn how to use the pinbar.


  Background: get to login page
    Given login page is open

  Scenario Outline: click on "how to learn" link from driver account
    Given "<user>" is logged in
    When user click the “Learn how to use this space” link on the homepage, users should see:

    Examples:
      | user          |
      | driver        |
      | sales manager |
      | store manager |