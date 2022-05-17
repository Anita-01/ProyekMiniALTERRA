Feature: Get Products
@get-all-products
Scenario: Get All Products
Given I set GET api endpoints for products
When I send GET HTTP Request for products
Then I receive valid HTTP response code 200

  @get-products-by-id
  Scenario: Get All Products By Id
    Given I set GET api endpoints for products by id
    When I send GET HTTP Request for products by id
    Then I receive valid HTTP response code 200

    # Invalid Test Case
  @get-invalid-product
  Scenario: Get Invalid All Products 1
    Given I set wrong GET api endpoints for product1
    When I send Wrong GET HTTP Request for product
    Then I receive valid HTTP response code 404

