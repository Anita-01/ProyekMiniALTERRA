Feature: Get Ratings

  @get-ratings
  Scenario: Get Product's Rating In AltaShop
    Given I set GET api endpoints for get rating
    And I send GET HTTP Request for get rating
    And I receive valid HTTP response code 200

  @get-wrong-ratings
  Scenario: Get Wrong Product's Rating In AltaShop
    Given I set Wrong GET api endpoints for get rating
    When I send Wrong GET HTTP Request for get rating
    Then I receive valid HTTP response code 404

  # https://be-qa.alta.id/api/products/_/ratings
