@US01
Feature:User Story : As a user, I should be accessing all the main modules of the app.

  AC #1: Store and sales managers should view 8 module names.
  Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System

  AC #2: drivers should view 4 module names
  Expected module names: Fleet, Customers, Activities, System

Scenario Outline:
  When user opens login page
  And "<user>" logs in
  Then should view all modules names :
  |Dashboards|
  |Fleet |
  |Customers|
  |Sales    |
  |Activities|
  |Marketing |
  |Reports & Segments  |
  |System    |
  Examples:
  |user|
  |sales manager|
  |store manager|
  Scenario:
    When user opens login page
    And "driver" logs in
    Then should view all modules names :
      |Fleet |
      |Customers|
      |Activities|
      |System    |
