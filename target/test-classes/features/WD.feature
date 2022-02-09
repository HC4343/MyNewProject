@LoginPage
Feature: Home Page Validation
  Scenario: Login with credentials-Happy Path
    Given user come to home page
    When user enters username
    And user enters password
    And user clicks login button
#    Then user sees success message

  Scenario: Login with credentials-Negative Path
    Given user come to home page
    When user enters incorrect username
    And user enters incorrect password
    And user clicks login button
#    Then user sees error message