Feature: Parallel tests using testng

  Sample feature file for parallel execution demo

  Scenario Outline: Parallel Runs
    Given I configure parallel test <test_no> with testng
    When  I run test <test_no>
    Then  the test <test_no> runs in parallel mode

    Examples:
      | test_no |
      | "1"     |
      | "2"     |
      | "3"     |
      | "4"     |
      | "5"     |
      | "6"     |
      | "7"     |
      | "8"     |
      | "9"     |
      | "10"    |


