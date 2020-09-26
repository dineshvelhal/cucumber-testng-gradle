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
 
 
 ## How to use it?
 Clone or download the master branch. then run `gradlew clean test`.
 
 Tweak the settings in `build.gradle` or `TestRunner.java` as needed.



