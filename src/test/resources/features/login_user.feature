Feature: Login eribank app
  As a user
  I want to login in in the app Eribank
  to have access to the app

  Scenario: Login eribank valid
    Given that Juan open the app
    When he enters with a valid user data
    Then he can see the main menu
