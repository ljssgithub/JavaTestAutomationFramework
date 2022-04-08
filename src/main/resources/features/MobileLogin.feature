# language: en
Feature: Login Mobile

  @appium
  Scenario: Login on Facebook not authorized
    Given User opens the application
    When User types "123" in password and email "test@gmail.com"
    And User clicks on Login
    Then System should show an alert that contains a ok button


