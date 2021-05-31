Feature: Login User

  Scenario: Login User
    Then Click "Log In" button
    Then Input email
    Then Input password
    Then Click "Log in" button span
    Then Content with "Courses you might be interested in" visible
