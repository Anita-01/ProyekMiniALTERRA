Feature: Post Product
  @create-success-product
  Scenario: Successful Create Product
    Given I set POST api endpoints for product
    When I create new product
    And I receive valid HTTP response code 200
    Then I receive valid data for new product

  @create-invalid-product
  Scenario: Failed to Create Product
    Given I set POST api endpoints for product
    When I create invalid product
    And I receive valid HTTP response code 400
