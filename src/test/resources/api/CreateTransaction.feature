Feature: Create Transaction
  @create-transaction
  Scenario: Create Transaction In AltaShop
    Given I set POST api endpoints for create transaction
    When I send POST HTTP Request for create transaction
    Then I receive valid HTTP response code 200

  @create-wrong-transaction
    #Failed Test Case
  Scenario: Create Wrong Transaction In AltaShop
    Given I set POST api endpoints for create transaction
    When I send Wrong POST HTTP Request for create transaction
    Then I receive valid HTTP response code 401