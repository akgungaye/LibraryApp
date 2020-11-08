Feature:Manipulating users

  Scenario:Librarian users page abilities
    Given user on the login page
    When user should able to login with following credential
      | email    | librarian51@library |
      | password | dBq7G87s            |

    Then user should be able navigate "Users"
    When user should be able to add user
    And  user should be able to edit user


