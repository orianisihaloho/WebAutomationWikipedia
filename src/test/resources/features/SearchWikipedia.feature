@Web
Feature: Search Wikipedia
  Scenario: Search article about Apple on wikipedia
    Given User open wikipedia home page
    When User input search "Apple" on home page
    And User click button search on home page
    Then User see article with title "Apple" on article page

  Scenario: Search article about Pear on wikipedia
    Given User open wikipedia home page
    When User input search "Pear" on home page
    And User click button search on home page
    Then User see article with title "Pear" on article page
