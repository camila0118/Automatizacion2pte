Feature: Registration

@Register
  Scenario: registered user
    Given he user is on the page
    When enter requested data
    Then he user enters the page

