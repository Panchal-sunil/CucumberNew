Feature: Validating Login functionality

  Scenario: Check login is successful with valid cridencials
    Given user open crome browser
    Given user is on login page
    When user enter valid <username> and <password>
    And click on login button
    Then user naviagte home page
    And user click on logout button

    Examples:
    |username|password|
    |sunil|12345|
    |mahesh|12345|
    |rajesh|12345|