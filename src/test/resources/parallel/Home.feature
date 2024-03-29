@Home_page
Feature: Home page Login
@tag1
 Scenario Outline: Home page without login
  Given Enter DS Algo portal
  When Click <Names> Get Started buttons
  Then "You are not logged in" message displayed
  Examples: 
      |Names                       |
      |Data Structures-Introduction|          
      |Array|
      |Linked List|
      |Stack|
      |Queue|
      |Tree|
      |Graph|
  
 
 