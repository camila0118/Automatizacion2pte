Feature: Login into the web app
  As a web user
  I want to login to phptravels
  to see my profile page
  @LoginExitoso
  Scenario: Successful login
    Given that bob has an active account
    When he sends user credentials email "user@phptravels.com" and password "demouser"
    Then he should see the account page "https://www.phptravels.net/account/"