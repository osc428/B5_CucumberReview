Feature: Login Test - The user should be able to login with valid credentials

  Background: Go to home page
    Given The user is on the login page

@wip
  Scenario: Positive scenario 1 - user should be able to login
    When The user enters valid credentials
    Then verify welcome message