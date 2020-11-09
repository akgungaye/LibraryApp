
@Reg
Feature:Manipulating users
@wip
  Scenario:Librarian users page abilities
    Given user on the login page
    When user should able to login with following credential
      | email    | librarian51@library |
      | password | dBq7G87s            |

    Then user should be able navigate Users
    When user should be able to add user
    And  user should be able to edit user



  Scenario: Student users should be able to see tableName

    Given user on the login page
    When user should able to login with following credential
      | email    | student38@library |
      | password | r3sqckHs          |
    Then user should be able navigate Books
    Then user should be able to see following table names
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |





