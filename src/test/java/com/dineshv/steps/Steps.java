package com.dineshv.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("I configure parallel test {string} with testng")
    public void i_configure_parallel_test_with_testng(String testNo) {
        //System.out.println(testNo +": I configure parallel test with testng");
    }

    @When("I run test {string}")
    public void i_run_test(String testNo) {
        //System.out.println(testNo + ": I run test");
    }

    @Then("the test {string} runs in parallel mode")
    public void the_test_runs_in_parallel_mode(String testNo) {
        //System.out.println(testNo + ": the test runs in parallel mode");
    }
}
