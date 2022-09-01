
Feature: Login Functionality Scenarios

  @Login
  Scenario: User should be able to login Sucessfully with valid credentials
    Given I launch the application 
    And I navigate to Login Page
    When I enter Username and password into the fields
    And I click on Login button
    Then I should be able to login successfully

 