Feature: Address modification
  Modify a subscriber's address

  Scenario Outline: Modify an subscriber's address
    Given a subscriber with an main address "<address>" in France
    When the advisor connected to "<channel>" modify the subscriber's address to "<newAddress>" with effect date "<date>"
    Then the active should be "<active>"
    And the address should be changed to "<newAddress>" if main address is active and date is empty
    Examples:
      | channel   | active    |   date      | address     | newAddress  |
      | FACE      | inactive  | 2020-12-25  | address     | address     |
      | FACE      | inactive  |             | address     | address     |
      | EC        | active    | 2020-12-25  | address     | address     |
      | EC        | active    |             | address     | newAddress  |