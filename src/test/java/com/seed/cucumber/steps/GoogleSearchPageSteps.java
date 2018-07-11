package com.seed.cucumber.steps;

import com.seed.cucumber.TestRunner;
import com.seed.cucumber.pages.GoogleSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class GoogleSearchPageSteps {

    private static GoogleSearchPage googlePage;

    public void initGoogleSearchPage() {
            googlePage = new GoogleSearchPage();
    }

    @Given("^I am on google homepage$")
    public void i_am_on_google_homepage() throws Throwable {
        TestRunner.webDriver.get(TestRunner.baseUrl);
    }

    @When("^I search (.*?)$")
    public void i_search_Abercrombie_and_Fitch_home_office_address(String query) throws Throwable {
        initGoogleSearchPage();
        googlePage.query.sendKeys(query);
        googlePage.query.submit();
    }

    @Then("^I should see (.*?)$")
    public void i_should_see_Address_Fitch_Path_New_Albany_OH_on_Google(String result) throws Throwable {
        boolean found = TestRunner.webDriver.getPageSource().contains(result);
        assertTrue(found);
    }



}
