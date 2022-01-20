
Feature: Validate Facebook Login




   Scenario Outline: As a user I want to login to Facebook
   
    Given I want to visit facebook homepage
    When I want to give valid "<email>" address
    Then I want to give valid "<password>" 
    And I want to click login button
    Then I verify the <status> of my homepage

    Examples: 
    
    
      | email  | password | status  |
      | zarin@thaque.com |  facebookFifi | success |
     
