
Feature:Navigation between modules


  Scenario:Students Navigate module
    Given user on the login page
    When user should able to login with following credential
      | email    | student38@library |
      | password | r3sqckHs          |

    Then user should be able to navigate between tabs
      | Books           |
      | Borrowing Books |

Scenario:Librarian Navigate module
    Given user on the login page
    When user should able to login with following credential
      | email    | librarian51@library |
      | password | dBq7G87s            |

    Then user should be able to navigate between tabs
      | Dashboard |
      | Users     |
      | Books     |


