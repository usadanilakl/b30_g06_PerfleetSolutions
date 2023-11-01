@wip
Feature: Car Odometer Info
  User Story:  As a user, I want to view car odometer info on the Vehicles Odometers page.
  Background: Login Page
    Given login page is open

  Scenario: Sales Manager
    When "sales manager" clicks on Vehicle Odometer link
    Then error message is displayed

  Scenario: Store Manager
    When "store manager" clicks on Vehicle Odometer link
    Then error message is displayed

    Scenario: Driver
      When "driver" clicks on Vehicle Odometer link
      Then page 1 is selected by default
      And 25 items are displayed per page

