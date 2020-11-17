Feature: Get list of users
  I need to get the list of all users for future evaluations

  Scenario: List of all users
    Given I have access to the API with the list of users 
    When I request the listing of all users
    Then I see that the return of the list occurs successfully