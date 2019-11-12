Feature: login to testme app
  Scenario Outline: login
    Given open the test me application
    When user click on SignIn
    And user enter UserName "<username>"
    And user enter Password "<password>"
    Then user click on login button
    

  

    Examples: 
     
   |username|password|
   |rohini|Rohini123|