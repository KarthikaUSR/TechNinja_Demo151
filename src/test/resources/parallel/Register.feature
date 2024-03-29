
@Register_page
Feature: Test Automation DS Algo register page
Background:
    Given Enter DS Algo portal
    And   Click Register link

  
@Registerpage_with_Empty_fields
 Scenario: User try to submit registration with empty fields
   
    When Clicks register button
    Then Error message "Please fill out this field." below username
    And  Error message "Please fill out this field." below password 
    And  Error message "Please fill out this field." below confirm password 
    When Click "login" Link
    Then Enter login page
@Registerpage_with_Valid_Input   
 Scenario: User try to submit registration with Valid details
   
    When Enters username as "Karthika" in username textbox 
    And  Enter password as "Numpy@12345" in password textbox
    And  Enters "Numpy@12345" in confirmpassword textbox
    Then Clicks register button
    And  Account created with message " New Account Created. You are logged in as Karthika "
    
@Registerpage_with_Duplicate_Input   
 Scenario: User try to submit registration with Valid details
   
    When Enters username as "Karthika" in username textbox 
    And  Enter password as "Numpy@12345" in password textbox
    And  Enters "Numpy@12345" in confirmpassword textbox
    Then Clicks register button
    And " password_mismatch:The two password fields didn’t match. " message displayed

@Registerpage_with_InValid_Input     
 Scenario: User try to submit registration with InValid details
   
    When Enters username as "Karthika" in username textbox 
    And  Enter password as "Numpy@12345" in password textbox
    And  Enters "Numpy@1234" in confirmpassword textbox
    Then Clicks register button
    And " password_mismatch:The two password fields didn’t match. " message displayed
    When Enters username as "Test" in username textbox 
    And  Enter password as "xxx" in password textbox
    And  Enters "xxx" in confirmpassword textbox
    Then Clicks register button
    And " password_mismatch:The two password fields didn’t match. " message displayed
    When Enters username as "Test" in username textbox 
    And  Enter password as "12345678" in password textbox
    And  Enters "12345678" in confirmpassword textbox
    Then Clicks register button
    And " password_mismatch:The two password fields didn’t match. " message displayed
    


    
 