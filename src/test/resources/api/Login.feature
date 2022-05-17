Feature: Login
@Valid-login
Scenario: Successfully Login
Given I set POST api endpoints for login
When I send POST HTTP Request for login
Then I receive valid HTTP response code 200

  @Invalid-login
  Scenario: Successfully Login
    Given I set Wrong POST api endpoints for login
    When I send Wrong POST HTTP Request for login
    Then I receive valid HTTP response code 400