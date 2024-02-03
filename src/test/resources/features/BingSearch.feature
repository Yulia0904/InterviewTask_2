Feature: Bing search functionality
  Agile story: As a user, when I am on the Bing search page
  I should be able to search anything and see relevant results

  @bing
  Scenario: Search result title verification
    Given user is on the Bing search page
    When user enters "bmw" in the Bing search box
    Then user should see "bmw - Search" in the title

