Feature: Login

  Scenario: Login Successful
    Given he user is on the page
    When he user his log
      | username   | password    |
      | 1152696923 | Agosto2022* |
    Then he could see id