#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Account Page feature
  
Background:
Given user has already logged in to application
|username|password|
|dec2020secondbatch@gmail.com|Selenium@12345|

  
  Scenario: Accounts page title
    Given user is on Accounts page
    When user gets the title of the page
    Then page title should be "My account - My Store"
    

  Scenario: Accounts section count
    Given user is on Accounts page
    Then user gets accounts section
    |ORDER HISTORY AND DETAILS|
    |MY CREDIT SLIPS|
    |MY ADDRESSES|
    |MY PERSONAL INFORMATION|
    |MY WISHLISTS|
    |Home|
    And accounts section count should be 6

    
