Feature: Librarian can see book records

  @wip
  Scenario Outline: Librarian should be able to change book records on user page
    Given user on the login page
    When user should able to login with following credential
      | email    | librarian51@library |
      | password | dBq7G87s          |
    And  user should be able navigate "Users"
    Then verify default type is "10" records
    Then show records for "<count>" options
    Examples:
      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |