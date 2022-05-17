Feature: Get Product's Comments
  @get-product-comments
  Scenario: Get Product's Comment In AltaShop
    Given I set GET api endpoints for get comment
    When I send GET HTTP Request for get comment
    Then I receive valid HTTP response code 200


  @get-wrong-product-comments
  Scenario: Get Wrong Product's Comment In AltaShop
    Given I set wrong GET api endpoints for get comment
    When I send wrong GET HTTP Request for get comment
    And I receive valid HTTP response code 404