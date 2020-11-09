
Feature:Books features
  Scenario Outline: Librarian should be able to change book records on user page
    Given user on the login page
    When user should able to login with following credential
      | email    | librarian51@library |
      | password | dBq7G87s            |
    And  user should be able navigate Users
    Then verify default type is "10" records
    Then show records for "<count>" options
    Examples:
      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |


  @EUG8-120 @EUG8-111
  Scenario: Search Functionality
    Given user on the login page
    When user should able to login with following credential
      | email    | student38@library |
      | password | r3sqckHs          |

    Then user should be able to search following categories books
      | Action and Adventure    |
      | Anthology               |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective     |
      | Drama                   |
      | Fable                   |
      | Fairy Tale              |
      | Fan-Fiction             |
      | Fantasy                 |
      | Historical Fiction      |
      | Science Fiction         |
      | Horror                  |
      | Biography/Autobiography |
      | Humor                   |
      | Romance                 |
      | Short Story             |
      | Essay                   |
      | Memoir                  |
      | Poetry                  |