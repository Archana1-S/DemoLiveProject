
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
