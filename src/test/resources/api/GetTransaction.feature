Feature: Get All Transaction
  @get-all-transaction
  Scenario: Get All Transaction
    Given I set GET api endpoints for get all transaction
    When I send GET HTTP Request for for get all transaction
    Then I receive valid HTTP response code 200

  @get-invalid-all-transaction
  Scenario: Get All Transaction With Invalid Transaction
    Given I set GET api endpoints for get all transaction
    When I send Wrong GET HTTP Request for for get all transaction
    Then I receive valid HTTP response code 401