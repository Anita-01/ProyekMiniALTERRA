Feature: Post Ratings
  @create-success-rating
  Scenario: Successful Create Rating for Product
    Given I set POST api endpoints for rating product
    When I set the bearer token
    And I create new rating for product
    Then I receive valid HTTP response code 200

  @failed-rating
  Scenario: Failed to Create Rating for Product
    Given I set POST api endpoints for rating product
    When I set the wrong bearer token
    And I create new rating for product
    Then I receive valid HTTP response code 200