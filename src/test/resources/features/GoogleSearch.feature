Feature: Google search
  'When I go to google search page and i search for a cucumber.
  I expect to get 1 or more links.'

  Scenario:
    Given That I have enter to the Google search page
    When I search for "cucumber"
    Then I should get more than 1 link