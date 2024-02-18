@search
Feature: Login

  @negative-test
  Scenario: User shouldn't be able to login their accounts with invalid credentials
    Given user is on splash screen
    And user click next on splash screen
    When user fill login form with "marcelkurniawan25@gmail.com", "Passw0rds"
    And user click the login button
    Then user should not be logged in

  @positive-test
  Scenario: User should be able to login their accounts with valid credentials
    Given user is on splash screen
    And user click next on splash screen
    When user fill login form with "marcelkurniawan25@gmail.com", "Passw0rd."
    And user click the login button
    Then user should be directed to homepage