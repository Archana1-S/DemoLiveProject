
@Register
Feature: Registration Functionality scenario
  @Register 
  Scenario: verify whether the user is able to register 
    Given I launch the application
    And I navigate to Registration page
    When I fill the bellow valide details
    
      | first name  |ravi | 
      | last name  |kumar51|
      | email       | ravi.kumar51@gmail.com| 
      |telephone    |9986753457|
      |password     |rKumar51|
    
    And I select the privacy policy
    And I click on continue button
    Then I should see that user account has successfully created
    @Register @two
    Scenario: Verify whetherthe user is not allowed to register
      Given I launch the application
      And I navigate to Registration page 
      When I click on continue button
      Then I should see that user Account has not created
      And I should see the Error message informing user to fill the mandatory fields
      