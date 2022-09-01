Feature: Filter Sauce Demo
  Background: User login into Sauce Demo page
    Given Im in sauce demo web page

    @orderLowToHighPrice
    Scenario: Order products from the lowest price to the highest
      Given I set the user name with "standard_user"
      And I set the password with "secret_sauce"
      When Click on login button
      Then I click on the low to high order filter
      And The products must be ordered with that filter
