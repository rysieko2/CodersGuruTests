Feature: Book mentor

  Scenario Outline: Book mentor
    Given I open site codersguru
    When I click on register new user
    And I register private user with "<email>" "<name>" "<surname>" "<pass>" "<city>" "<code>" "<street>" "<number>"
    Then User should be successfully registered
    When I select "GIT"
    And I select mentor 3
    And I select first date and hour possible with message "I need help!"
    Then I'm redirected to PayU site
    When I enter fake credit card details
    Then Payment is refused


    Examples:
      | email        | name      | surname  | pass     | city    | code   | street       | number |
      | @kordecki.pl | Krzysztof | Kordecki | pass1!@# | Wroclaw | 52-129 | Kielbasnicza | 28     |