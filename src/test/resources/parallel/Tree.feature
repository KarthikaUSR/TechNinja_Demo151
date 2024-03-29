
@Tree_page
Feature: Tree page and links
  Background:
    Given Enter DS Algo portal
    And   Do Login 
    |username_a |password_a |
    |karthika   |Numpy@12345|    
    When Click on 'Get Started' button in Tree      
    Then 'Tree' page should open


  @Tree_page_links
  Scenario Outline: Tree links in Topics Covered section. 


    When Click <Name> Tree links 
    Then <Name> Page should open    
    When Click "Practice Questions" link in Tree
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
      |Name                          | Python Code  |Result|
      |Overview of Trees             |print "hello" |hello |
      |Terminologies                 |print "karthi"|karthi|
      |Types of Trees                |print "karthi"|karthi|
      |Tree Traversals               |print "karthi"|karthi|
      |Traversals-Illustration       |print "karthi"|karthi|
      |Binary Trees                  |print "karthi"|karthi|
      |Types of Binary Trees         |print "karthi"|karthi|
      |Implementation in Python      |print "karthi"|karthi|
      |Binary Tree Traversals        |print "karthi"|karthi|
      |Implementation of Binary Trees|print "karthi"|karthi|
      |Applications of Binary trees  |print "karthi"|karthi|
      |Binary Search Trees           |print "karthi"|karthi|
      |Implementation Of BST         |print "karthi"|karthi|
 
 
         
    
    
   
 