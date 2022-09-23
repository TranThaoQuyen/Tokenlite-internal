Feature: Login Calidris
  Background:
    Given user is on login Calidris page

  @LoginCalidris
  Scenario Outline: Proper login Calidris credential
    When user logins Calidris with "<email>" and "<password>" as credentials
    Then user is on dashboard Calidris page
    Examples:
      | email             | password |
      | hendrix+user02@equanimity.sg | 123456789   |
