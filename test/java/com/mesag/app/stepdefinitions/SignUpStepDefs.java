package com.mesag.app.stepdefinitions;

import com.mesag.app.HookDriver;
import com.mesag.app.pageobjects.SignUpServices;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpStepDefs {
    @Given("^User wants have an account$")
    public void user_wants_have_an_account() throws InterruptedException {


        SignUpServices signUp = new SignUpServices(HookDriver.driver);
        signUp.go("http://demo.automationtesting.in/Register.html");
        signUp.writeFirstName("David");
        signUp.writeLastName("Smith");
        signUp.writeAddress("Zarcero");
        signUp.writeEmail("davidcubillo@gmail.com");
        signUp.writePhone();
        signUp.clickGender();
        signUp.selectCountry("Bolivia");
        signUp.selectYear("1984");
        signUp.selectMonth("October");
        signUp.selectDay("14");
        signUp.writePassword("Cualquiera1984");
        signUp.writeConfirmPassword("Cualquiera1984");
        signUp.clickSubmitButton();
        Thread.sleep(4000);
        
    }
    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
