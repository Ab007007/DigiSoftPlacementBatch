@google @uat
Feature: GS using Data Table

	@development
  Scenario Outline: Google Search as List
    Given user is on Google page
    When user perform search and print the results
      | IBM       |
      | WIPRO     |
      | Infosys   |
      | Oracle    |
      | CapGemini |
    Then close the browser

  Scenario Outline: Google Search as Map
    Given user is on Google page
    When user perform search and print the results as Map
      | company   |
      | IBM       |
      | WIPRO     |
      | Infosys   |
      | Oracle    |
      | CapGemini |
    Then close the browser
