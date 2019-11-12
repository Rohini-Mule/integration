
Feature: Registration to TestMe app


  @register
  Scenario: Test registration with valid data 
     Given user open application Testme app
     When user click on sign in
     Then user click on register
     When user enter userName as "rohini" in userName field
     When user enter firstName as "Rohini" in firstName field
     When user enter lastName as "Mule" in lastName field
     When user enter Password as "Rohini123" in password field
     When user enter Confirmpassword as "Rohini123" in confirm password field
     When user select gender 
    When user enter E-mail as "rohinimule@gmail.com" in email field
     When user enter mobileno as"9890103135" in mobileno field
     When user select DOB as"23/09/1997" in dob field
     When user enter address as "230/A swami vivekanand nager hatture wasti, solapur." in address field
     #When user select security question 
     When user enter answer as "abc" in answer field
     When user click on Register button
     Then user validate Registration page successed
     
 