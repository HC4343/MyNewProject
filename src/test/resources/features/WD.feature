@LoginPage
Feature: Login Page Validation
  Scenario: Validate successful login
    Given user accesses login page
    When user enters "webdriver"
    And user enters password webdriver123
    And user clicks login button
    Then user sees success message

#  Scenario: Login with credentials-Negative Path
#    Given user accesses login page
#    When user enters "webdriver1"
#    And user enters webdriver1234
#    And user clicks login button
#    Then user sees error message