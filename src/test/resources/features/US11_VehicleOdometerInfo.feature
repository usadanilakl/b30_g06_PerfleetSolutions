@Odometer
Feature: Car Odometer Info
  User Story:  As a user, I want to view car odometer info on the Vehicles Odometers page.

  Background: Login Page
    Given user opens login page

  Scenario: Sales Manager
    When "sales manager" logs in
    And clicks on Vehicle Odometer link
    Then error message is displayed "You do not have permission to perform this action."

  Scenario: Store Manager
    When "store manager" logs in
    And clicks on Vehicle Odometer link
    Then error message is displayed "You do not have permission to perform this action."

  Scenario: Driver
    When "driver" logs in
    And clicks on Vehicle Odometer link
    Then page 1 is selected by default
    And 25 items are displayed per page

