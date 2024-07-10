package com.cucumber.step;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SmokeStepDefinition {

    private int value;

    @When("I set value to {int}")
    public void iSetValueToValue(int value) {
        this.value = value;
    }

    @Then("I verify that it's even")
    public void iVerifyThatItSEven() {
        Assert.assertTrue(value % 2 != 0);
    }
}
