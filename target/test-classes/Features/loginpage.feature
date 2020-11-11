Feature: Verify the login page

  Scenario Outline: User is able to login
    Given The browser is opened
    And the login page is open
    When the <username> and <passowrd> is given
    And the login button is clicked
    Then the user is redirected to the next page

    Examples: 
      | username | password |
      | Maddy    |    12345 |
      | Mads     |    12345 |
