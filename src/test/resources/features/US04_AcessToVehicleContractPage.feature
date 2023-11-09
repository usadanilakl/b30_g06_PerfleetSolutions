@Access
Feature:Access to Vehicle contract page
  User Story:As a user, I want to access to Vehicle contracts page






  Scenario Outline: Store manager
    Given user opens login page

    And "<user>" logs in
    When user access the Vehicle contracts page.
    Then Expected URL: "https://qa.perfleet.com/entity/Extend_Entity_VehicleContract"
    And Expected title: "All - Vehicle Contract - Entities - System - Car - Entities - System"
    Examples:
      | user          |
      | sales manager |
      | store manager |


  Scenario: Drivers
    Given user opens login page

    And "driver" logs in
    When user access the Vehicle contracts page.
    Then  the app  display "You do not have permission to perform this action."











