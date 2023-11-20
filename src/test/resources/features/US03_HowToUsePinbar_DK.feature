@hello
Feature: As a user, I want to learn how to use the pinbar.


  Background: Login
    Given user opens login page

  Scenario Outline: click on "how to learn" link from driver account
    When "<user>" logs in
    Then user click the Learn how to use this space link on the homepage
    And users should see header "How To Use Pinbar"
    And paragraph "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    And picture that has the following url "https://qa.perfleet.com/bundles/oronavigation/images/pinbar-location.jpg"


    Examples:
      | user          |
      | driver        |
      | sales manager |
      | store manager |