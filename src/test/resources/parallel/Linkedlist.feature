
@Linkedlist_page
Feature: Linkedlist page and links
  Background:
    Given Enter DS Algo portal
    And   Do Login 
    |username_a |password_a |
    |karthika   |Numpy@12345|    
    When Click on 'Get Started' button in Linkedlist      
    Then 'Linked List' page should open


  @Linkedlist_page_links
  Scenario Outline: Linkedlist links in Topics Covered section. 


    When Click <Name> Linkedlist links 
    Then <Name> Page should open    
    When Click "Practice Questions" link in Linkedlist
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
      |Name                                  | Python Code  |Result|
      |Introduction                          |print "hello" |hello |
      |Creating Linked LIst                  |print "karthi"|karthi|
      |Types of Linked List                  |print "karthi"|karthi|
      |Implement Linked List in Python       |print "karthi"|karthi|
      |Traversal                             |print "karthi"|karthi|
      |Insertion                             |print "karthi"|karthi|
      |Deletion                              |print "karthi"|karthi|
 
 
         
    
    
   
 