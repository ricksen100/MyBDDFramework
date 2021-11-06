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

Feature: Contact Us Feature

 
 
  Scenario Outline: Contact Us scenario with different set of data
    Given user navigates to contact us page
    When user fiils the form from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on send button
    Then it shows a successful message "Your message has been successfully sent to our team."

    Examples: 
      |SheetName|RowNumber|
      |contactus|0|
      |contactus|1|
     
