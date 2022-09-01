Feature: Cart Sauce Demo
  Background: User login into Sauce Demo page
    Given Im in sauce demo web page

  @verifyCartNumber
  Scenario: Verify cart number increase
    Given I  set the user name field with "standard_user"
    And I  set the password field with "secret_sauce"
    When I click on login  button
    Then I click Backpack add to cart button
    And Verify the cart number is 1
    Then I click on Bike add to cart button
    And Verify the cart number is 2


