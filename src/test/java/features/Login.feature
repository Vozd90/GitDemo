Feature: Application Login


Scenario: Home page default login

Given user is on landing page
When User login into application with "Jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login

Given user is on landing page
When User login into application with "John" and password "4321"
Then Home page is populated
And Cards displayed are "false"
