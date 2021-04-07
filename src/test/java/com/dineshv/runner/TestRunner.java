package com.dineshv.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
      features = {"src/test/resources/features"},
      glue = {"com.dineshv.steps"},
      plugin = {
            "html:build/html-reports.html",
            "progress",
            "summary",
            "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
      },
      monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
   @DataProvider(parallel = true)
   @Override
   public Object[][] scenarios() {
      return super.scenarios();
   }

   @BeforeClass
   public static void beforeClass() {
      System.out.println("Hook - @BeforeClass");
   }

   @AfterClass
   public static void afterClass() {
      System.out.println("Hook - @AfterClass");
   }
}
