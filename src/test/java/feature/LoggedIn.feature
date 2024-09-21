Feature: LoggedIn user view

  Scenario: validate user is able to view after Login
    Given User navigates to the login page
    When user successfully enters the log in details
    Then User should be  able to view the product category page
