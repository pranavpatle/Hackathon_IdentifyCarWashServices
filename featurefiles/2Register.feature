Feature: Registering the users

  @regression @functional
  Scenario: Capture the error message
    Given the user should click on the Register
    When the User  should enter their Firstname
    And the User should enter the invalid Email
    And User should enter the password
    And User should click on SignUp
    Then User should capture Error message
