# language: en
Feature:  Login Facebook Web

  @web
  Scenario Outline: Login not authorized
    Given user is on login page
    When user types email "<email>" and password "<password>"
    And clicks on enter button
    Then System should show an error message

    Examples:
    |email        | password     |
    |test2@gm.com | abc          |
    |test3@gm.com |              |
    |             | abc          |











