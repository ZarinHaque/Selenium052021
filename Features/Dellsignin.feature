

Feature: Validate user login
 

  Scenario Outline: Dell Login
    Given User visit dell homepage.
    When User clcik on Sign in button.
    When User clcik on Signin 
    When User clcik enter email address "<emailaddress>"
    When User clcik enter password "<password>" 
    Then User clcik on signin Option & go to profilepage
    Then I verify the <status> of my profilepage

    Examples: 
    
      |  emailaddress  |  password  |  status  |
      |  zarin@thaque.com  |  12345678Dell  |  passed  |
    
