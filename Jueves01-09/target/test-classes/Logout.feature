Feature: Logout Sauce Demo
  Background: User login into Sauce Demo page
    Given Im in sauce demo web page

  @logout
  Scenario: Logout from Sauce Demo
    Given I. set the user name field with "standard_user"
    And I. set the password field with "secret_sauce"
    When I. click on login button
    And I. click on menu icon
    And I. click on logout option
    Then The. login page should be displayed
