Feature: Post
@create-success-category
    Scenario: Successful Create Category
    Given I set POST api endpoints
    When I create new category
    And I receive valid HTTP response code 200
    Then I receive valid data for new category

#Negative Scenario
  # Category filled with combine int and character
  @create-failed-category
  Scenario: Failed Create Category With Combine String and character
    Given I set POST api endpoints
    When I Create New Category with combine String and character
    And I receive valid HTTP response code 200
    # Failed

  @create-failed-category
  Scenario: Failed Create Category With Combine Int
    Given I set POST api endpoints
    When I create New Category with int
    And I receive valid HTTP response code 400
    # Successfull

  @create-failed-category
  Scenario: Failed Create Category With Combine int and character
    Given I set POST api endpoints
    When I create New Category with combine int and character
    And I receive valid HTTP response code 200
    #failed

  @create-failed-category
  Scenario: Failed Create Category With Combine Character and Int
    Given I set POST api endpoints
    When I create Two New Category In One Response
    And I receive valid HTTP response code 200
    #failed

  @create-failed-category
  Scenario: Failed Create Category Without Body
    Given I set POST api endpoints
    When I create New Category without body
    And I receive valid HTTP response code 500
    # Successfull



