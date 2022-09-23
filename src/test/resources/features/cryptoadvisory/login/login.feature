Feature: Login Cryptoadvisory
  Background:
    Given user is on login page

  @Login
  Scenario Outline: Proper login Cryptoadvisory credential
    When user logins with "<email>" and "<password>" as credentials
    Then user is on dashboard page
    Examples:
      | email             | password |
      | kirk+uuser01@equanimity.sg | 123456789   |
