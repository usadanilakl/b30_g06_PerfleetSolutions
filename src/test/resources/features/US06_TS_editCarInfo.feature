@Treisy
Feature: User Story :  As a user, I want to see edit car info icons from the Vehicle page.
  Background: Login Page
    Given user opens login page
@wip
  Scenario:
  When "driver" logs in
    And users open vehicle page
    And user hover the mouse over the three dots “…”
    And see following options
    |View|
    |Edit|
    |Delete|




#AC #1:  users should see “view, edit, delete” when they hover the mouse over the 3 dots “…”