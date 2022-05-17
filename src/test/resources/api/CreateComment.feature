Feature: Create Product's Comments
  @create-product-comments
  Scenario: Create Product's Comment In AltaShop
    Given I set POST api endpoints for create comment
    When I send POST HTTP Request for create comment
    Then I receive valid HTTP response code 200

  @create-wrong-product-comments
  Scenario: Failed to createProduct's Comment In AltaShop
    Given I set POST api endpoints for create comment
    When I send Wrong POST HTTP Request for create comment
    Then I receive valid HTTP response code 500

