package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"@target/failures.txt"},
        glue = "classpath:com/cucumber",
        plugin = {"summary", "json:target/cucumber-rerun-report/cucumber.json"}
)
public class TestNGFailuresCucumberRunner extends AbstractTestNGCucumberTests {
}
