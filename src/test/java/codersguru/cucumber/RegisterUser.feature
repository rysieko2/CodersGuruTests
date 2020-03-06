Feature: Register user

  Scenario Outline: Register private user
    Given I open site codersguru
    When I click on register new user
    And I register private user with "<email>" "<name>" "<surname>" "<pass>" "<city>" "<code>" "<street>" "<number>"
    Then User should be successfully registered

    Examples:
      | email        | name      | surname  | pass     | city    | code   | street       | number |
      | @kordecki.pl | Krzysztof | Kordecki | pass1!@# | Wroclaw | 52-129 | Kielbasnicza | 28     |

  Scenario Outline: Register company user
    Given I open site codersguru
    When I click on register new user
    And I click on button 'Firma'
    And I register company user with "<email>" "<name>" "<surname>" "<pass>" "<city>" "<code>" "<street>" "<number>" "<company>" 'NIP'
    Then User should be successfully registered

    Examples:
      | email        | name      | surname  | pass     | city    | code   | street       | number | company |
      | @kordecki.pl | Krzysztof | Kordecki | pass1!@# | Wroclaw | 52-129 | Kielbasnicza | 28     | Kross   |