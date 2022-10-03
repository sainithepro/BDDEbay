Feature: Ebay Home Page Scenarios

  @P1
  Scenario: Advance Search Link
    Given I am on Ebay Home Page
    When I click on Advaned Link
    Then I navigate to Advaned Search page

  @P2 @setCookies @Test
  Scenario: Search item count
    Given I am on Ebay Home Page
    When I search for 'iphone 11'
    Then I validate atleast 1000 search items present

  @P3 @setCookies
  Scenario: Search item count2
    Given I am on Ebay Home Page
    When I search for 'Toy car'
    Then I validate atleast 500 search items present

  @P4 @setCookies
  Scenario: Search item in category
    Given I am on Ebay Home Page
    When I search for 'Shampoo' in 'Baby' category

  @P5
  Scenario Outline: Home Page links
    Given I am on Ebay Home Page
    When I click on '<url>'
    Then I validate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | LINKK        | url                                                            | title                                |
      | Motors      | https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334 | eBay Motors: Auto Parts and Vehicles |
      | Toys        | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497             | Toys & Hobbies products for sale     |
      | Electronics | https://www.ebay.com/b/Electronics/bn_7000259124               | Electronics products for sale        |
