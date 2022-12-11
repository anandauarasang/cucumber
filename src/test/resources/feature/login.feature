Feature: feature to test login functionalities

  Scenario: check login is succesful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login buton
    Then user is navigated to the home page
