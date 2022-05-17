Feature: Register
  @create-new-account
  Scenario: Successful Create Account
    Given I set POST api endpoints for make account
    When I create new account
    And I receive valid HTTP response code 200
    Then I receive valid data for new account

  @failed-create-account
  Scenario: Failed to Create Account
    Given I set POST api endpoints for make account
    When I create invalid new account
    And I receive valid HTTP response code 400