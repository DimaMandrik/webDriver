Feature: Login in WIW
  Scenario: Test Login with valid credentials
    Given I open chrome and start application
    When I click enter valide email and valide password
		Then I can login successfully