@Login_page
Feature: Home page Login
@tag1
 Scenario Outline: Login page
    Given Enter Home page portal <title> 
    And   Enter login page
    When Enter User Name <username>
    And Enter Pasword <password>
    And Click login button
    Then User in Home page <username>
    And Logout
   
 Examples: 
      |title     |username |password   |
      |NumpyNinja|karthika |Numpy@12345|
      
