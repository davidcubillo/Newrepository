Feature: Client sign up
  Scenario: User wants to sign up successfully
    Given User wants have an account
    When he sends required information to get the account
    Then he should be told that the account was created