Feature: Login feature with valid credantials

	@EUG8-114 @EUG8-111
	Scenario Outline:Login Functionality -with valid credantial
		Given user on the login page
		When user should enter valid "<Email>" and "<Password>" than click login button
		Then user should able to log in
		    Examples:
		      | Email               | Password |
		      | student38@library   | r3sqckHs |
		      | student39@library   | GCTOZ0Yk |
		      | student40@library   | sK7ctVOS |
		      | librarian51@library | dBq7G87s |

