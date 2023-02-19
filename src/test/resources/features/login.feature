Feature: Library app login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And
  dashboard should be displayed.

  Accounts are: librarian, student, admin

  @librarian
  Scenario: Login as Librarian
    When user enters librarian username
    And user enter librarian username
    Then user enter librarian password

    @student
  Scenario: Login as student
    When user enter student username
    And user enter student password
    Then user should see dashboard

  @admin
  Scenario: Login as admin
    When user enter admin username
    And user enter admin password
    Then user should see dashboard

