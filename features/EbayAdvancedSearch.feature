Feature: Ebay Advanced Search Page

  @P24
  Scenario: Ebay Logo on Advances Search Page
    Given I am on Ebay Advanced Page
    When I click on Ebay logo
    Then I land on Ebay Home Page

  @P300 @setCookies
  Scenario: Advaned search an item
    Given I am on Ebay Advanced Page
    When I advanced search an item
      | keyword   | exclude     | min | max |
      | iphone 12 | refurbished | 300 | 800 |
