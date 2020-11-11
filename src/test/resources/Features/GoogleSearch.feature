Feature: Google page search

  Scenario: Validate google search page is working
    Given The browser is open
    And user is on google search page
    When user enters a text in google search box
    And hits enter
    Then user is naviagted to the search page
