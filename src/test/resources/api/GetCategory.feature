Feature: Get Categories
  # Positive Test Cases
  @get-all-categories
  Scenario: Get All Categories
    Given I set GET api endpoints
    When I send GET HTTP Request
    Then I receive valid HTTP response code 200

  @get-category-by-id
  Scenario: Get Category by ID
    Given I set GET api endpoints by Category ID
    When I send GET HTTP Request for get category
    Then I receive valid HTTP response code 200

    #Negative Test Cases
  @Invalid-url
  Scenario: Get Invalid Categories with Wrong URL1
    Given I set wrong URL https to http
    When I send Wrong GET HTTP Request1
    Then I receive valid HTTP response code 200
    # Test Case Failed

  @Invalid-url
  Scenario: Get Invalid Categories with Wrong URL2
    Given I set wrong URL https to https_
    When I send Wrong GET HTTP Request2
    Then I receive valid HTTP response code 403

  @Invalid-url
  Scenario: Get Invalid Categories with Wrong URL3
    Given I set wrong URL to URL Facebook
    When I send Wrong GET HTTP Request3
    Then I receive valid HTTP response code 404

  @Invalid-url
  Scenario: Get Invalid Categories with Wrong URL4
    Given I set wrong URL to empty URL
    When I send Wrong GET HTTP Request4
    Then I receive valid HTTP response code 403

  @Invalid-url
  Scenario: Get Invalid Categories with Wrong URL5
    Given I set wrong URL to double url
    When I send Wrong GET HTTP Request5
    Then I receive valid HTTP response code 404

     @Wrong-Target-Request-WithID
    Scenario: Get Invalid Categories With Wrong Target Request1
      Given I set wrong GET api endpoints
      When I send Wrong GET HTTP Request
      Then I receive valid HTTP response code 404
#
  @Wrong-Target-Request-WithID
  Scenario: Get Invalid Categories With Wrong Target Request2
    Given I set wrong GET api endpoints1
    When I send Wrong GET HTTP Request_1
    Then I receive valid HTTP response code 400

  @Wrong-Target-Request-WithID
  Scenario: Get Invalid Categories With Wrong Target Request3
    Given I set wrong GET api endpoints2
    When I send Wrong GET HTTP Request_2
    Then I receive valid HTTP response code 400

  @Wrong-Target-Request-WithID
  Scenario: Get Invalid Categories With Wrong Target Request4
    Given I set wrong GET api endpoints3
    When I send Wrong GET HTTP Request_3
    Then I receive valid HTTP response code 404

  @Wrong-Target-Request-WithID
  Scenario: Get Invalid Categories With Wrong Target Request5
    Given I set wrong GET api endpoints4
    When I send Wrong GET HTTP Request_4
    Then I receive valid HTTP response code 200
    # Failed

  @Wrong-Target-Request-WithID
  Scenario: Get Invalid Categories With Wrong Target Request6
    Given I set wrong GET api endpoints5
    When I send Wrong GET HTTP Request_5
    Then I receive valid HTTP response code 200
    #Failed


