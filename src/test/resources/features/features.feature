Feature: Artithmatic Operations

  Sample feature file for Arithmatic Operations


  Scenario Outline: Addition
    Given Two numbers
    When  I add <A> and <B>
    Then  the addition is <SUM>

    Examples:
      | A  | B  | SUM |
      | 2  | 5  | 7   |
      | 3  | 15 | 18  |

