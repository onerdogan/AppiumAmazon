Feature: create card
  Scenario: create card
    Given Post request for create a card "akff" with POJO
    And get response with POJO
    And Assert response "akff"
    And delete card
