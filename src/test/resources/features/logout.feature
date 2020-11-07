Feature: Logout feature

	@EUG8-116 @EUG8-111 @wip
	Scenario Outline: Logout Functionality-TC
		Given user on the login page
		When user should enter valid "<Email>" and "<Password>" than click login button
		And user should able to log out
		Then user on the login page
		    Examples:
		      | Email               | Password |
		      | student38@library   | r3sqckHs |
		      | student39@library   | GCTOZ0Yk |
		      | student40@library   | sK7ctVOS |
		      | librarian51@library | dBq7G87s |

