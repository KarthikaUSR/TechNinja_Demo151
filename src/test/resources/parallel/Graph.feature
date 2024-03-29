
@Graph_page
Feature: Graph page and links
  Background:
    Given Enter DS Algo portal
    And   Do Login 
    |username_a |password_a |
    |karthika   |Numpy@12345| 
    
    When Click on 'Get Started' button in Graph      
    Then 'Graph' page should open


  @Graph_page_links
  Scenario Outline: 'Graphs' links in Topics Covered section for Arrays page. 


    When Click <Name> Graphs links 
    Then <Name> Page should open    
    When Click "Practice Questions" link in graphs
    Then "Practice Questions" page should open
    When click browser right arrow to go back
    Then <Name> Page should open
    When Click 'Try here>>>' button
    Then Editor box should open with run button
    When Type Sample <Python Code> and click run button
    Then <Result> should displayed
    When Clear Editor Box and type "System.out.print(1+2);"
    And click run button
    Then Alert should displayed as "NameError:name <code > is not defined on line <line no>" with ok button
    
    
    Examples: 
      |Name                       | Python Code  |Result|
      | Graph                     |print "hello" |hello|
      | Graph Representations     |print "karthi"|karthi|
 
 
         
    
    
   
 