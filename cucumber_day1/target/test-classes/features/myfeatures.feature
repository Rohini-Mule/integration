Feature: Test registration

Description: user story(optional)

Scenario: Test registration with valid data
  Given user open application newtours.demoaut.com
  When user clicks on registration 
  Then user validates registration page
  When user enter firstname
  And user enter lastname
  And user enter password
  And user enter confirm password 
  And user click on register button
  Then user validates registration page successed
