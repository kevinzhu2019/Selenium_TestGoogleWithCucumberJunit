Feature: Test the google search function

  Background: User is on the testing page
    Given user go to main page

	@regression
  Scenario: Use enter key to search
    When user enters text in search page and press enter
    Then user navigates to result page

	@smoke
  Scenario: Use search button to search
    When user enters text in search page
    And clicks search button
    Then user navigates to result page
