package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/com/cucumber/features"},
        glue = "classpath:com/cucumber",
        plugin = {"summary", "json:target/cucumber.json", "rerun:target/failures.txt"},
        tags = "@SmokeTest"
)
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
}
