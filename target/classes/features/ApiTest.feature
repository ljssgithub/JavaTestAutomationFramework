# language: en
Feature:  Api Test

  @api
  Scenario: Validate status code  and response format - /new/shuffle/?deck_count=1 [200] (http://deckofcardsapi.com)
    Given User is logged in
    When User sends a GET request to get a card id and status code 200
    Then Validate JSON schema