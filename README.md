# cucumber-testng-gradle
A starter Cucumber test framework using TestNG and Gradle

## Why another Cucumber framework?
Cucumber and JUnit has been a very popular combination since a long time. Ample resources are available online to learn and implement the automation using Cucumber and JUnit.
But not so much about TestNG. Cucumber documentation touches upon this topic a bit, but even there, the examples are based on Maven.

Recently I started working on Cucumber, TestNG and Gradle and learnt something. So putting together a starter kit, that can be extended further as needed.


## What are the key features?
This is a basic framework using
 - Gradle as a build tool
 - Cucumber BDD
 - TestNG as a testing tool
 
 It has a pre-configured build.gradle and runner file with test configuration added to it.
 
 Key features:
 - Latest versions of Cucumber and TestNG 
 - Logging to console output
 - Pretty reporting on console
 - HTML reporting
 - Parallel execution support
 - helpful comments added 
 
 It contains only one Cucumber feature file and just one `Scenario Outline` in it.
 
 ```Gherkin
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
```
 
 You can see that the scenario runs once for each row in the examples. Based on the thread count, the order and time of execution will vary accordingly.
 
 ## How to use it?
 Clone or download the master branch. then run `gradlew clean test`.
 
 Tweak the settings in `build.gradle` or `TestRunner.java` as needed.
 
 You can then add more libraries like Selenium and develop the framework to suit your needs.



