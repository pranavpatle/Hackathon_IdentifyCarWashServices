Feature: Select ServiceType and Subcategory

  @smoke
  Scenario: Check whether the application can be accessed
    Given the user navigates to the Application
    Then the page NavaBar has to be displayed

  @regression
  Scenario: Display All service type and Subcategory
    Given the user is on the Doorstepwash home page
    When the User select Service type as Car
    And the User select SubCategory as SUV
    And User should click on 'Go for it'
    Then User should see all service name and amount
