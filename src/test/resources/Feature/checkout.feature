@checkout
Feature: Checkout

  @positive-test
  Scenario: Success checkout
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
    When user select a ticket
    And user select ticket type
    And user select gender
    And user fills out the form with "Marcel Kurniawan", "87867126669", "marcelkurniawan26@gmail.com"
    And user click on switch button for passenger details
    And user click on next button
    Then user click on continue to payment button
