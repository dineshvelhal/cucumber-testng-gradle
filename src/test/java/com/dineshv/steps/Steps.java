package com.dineshv.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    int sum = 0;

    @Before
    public void before() {
        System.out.println("HOOK - @Before ------------------------------------------------");
    }

    @After
    public void after() {
        System.out.println("HOOK -  @After ------------------------------------------------");
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("HOOK - @BeforeStep ------------------------------------------------");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("HOOK -  @AfterStep ------------------------------------------------");
    }

    @Given("Two numbers")
    public void two_numbers() {

    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer a, Integer b) {
        sum = a + b;
    }

    @Then("the addition is {int}")
    public void the_addition_is(Integer addition) throws Exception {
        if( sum != addition) {
            throw new Exception("Incorrect addition");
        }
    }

}
