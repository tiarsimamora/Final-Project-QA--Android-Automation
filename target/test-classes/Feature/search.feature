@search
Feature: Search

  @positive-test
  Scenario: Searching ticket
    Given user is on homepage
    And user click booknow button
    And user click deparature button
    And user input deparature with "Padang"
    And user confirm depart location
    And user click arrive button
    And user input arrive with "Surabaya"
    And user confirm arrive location
    And user select deparature date
    And user select passenger
    And user select cabin class
    And user click on search flight button
    Then user is on ticket page