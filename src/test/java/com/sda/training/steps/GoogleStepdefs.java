package com.sda.training.steps;
import com.sda.training.pages.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class GoogleStepdefs {
    GooglePage googlePage = new GooglePage();
    @Given("Google Page is opened")
    public void googlePageIsOpened() {
        googlePage.openGooglePage();
    }
    @When("I close Cookie frame")
    public void iCloseCookieFrame() {
        googlePage.closeCookieMessage();
    }
    @When("I search for phrase {string}")
    public void iSearchForPhrase(String searchPhrase) {
        googlePage.searchInGoogle(searchPhrase);
    }
    @Then("I can see search results")
    public void iCanSeeSearchResults() {
        googlePage.verifyIfResultsAreVisible();
    }

    @And("I search for phrase Selenium Cucumber")
    public void iSearchForPhraseSeleniumCucumber() {
    }
}