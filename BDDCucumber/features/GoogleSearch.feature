@production
Feature: Google Search

  @s1
  Scenario: Search for DigiSoft
    Given user is on Google page
    When user enter "DigiSoft" in searchBox
    And click on Search button
    Then user Navigate to results page
    And user save all the hyperlinks

  @s2
  Scenario: Search for IBM
    Given user is on Google page
    When user enter "IBM" in searchBox
    And click on Search button
    Then user Navigate to result page
    And user print all the hyperlinks

  @s1 @s2
  Scenario: Search for WIPRO
    Given user is on Google page
    When user enter "WIPRO" in searchBox
    And click on Search button
    Then user Navigate to results page
    And user print all the hyperlinks

  @s3
  Scenario: Search for Oracle
    Given user is on Google page
    When user enter "Oracle" in searchBox
    And click on Search button
    Then user Navigate to results page
    And user print all the hyperlinks

  @s1 @s3
  Scenario: Search for Squareroot
    Given user is on Google page
    When user enter 25 in searchBox
    And click on Search button
    Then user Navigate to results page
    And user print all the hyperlinks

  @s1 @s2 @s3
  Scenario: Search for Squareroot
    Given user is on Google page
    When user enter 25.5 in searchBox
    And click on Search button
    Then user Navigate to results page
    And user print all the hyperlinks
