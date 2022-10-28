Feature: Login

  Scenario: Login Successful
    Given he user is in the webpage
    When he user login
      | user          | password     |
      | standard_user | secret_sauce |

    Then he could see login successful

  Scenario: Login Fails
    Given he user is in the webpage
    When he user login
      | user          | password     |
      | standard_user | secret_sauce |

    Then he could see login successful

