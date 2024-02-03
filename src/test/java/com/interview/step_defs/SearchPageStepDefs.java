package com.interview.step_defs;


import com.interview.utilities.BrowserUtils;
import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import com.interview.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchPageStepDefs {

    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        BrowserUtils.getUrl(ConfigurationReader.getProperty("url"));
        System.err.println(System.getProperty("headless"));
    }
    @When("user enters {string} in the Bing search box")
    public void user_enters_in_the_bing_search_box(String SearchWord) {
        Pages.getBigSearch().searchBox.click();
        Pages.getBigSearch().searchBox.sendKeys(SearchWord);
        Pages.getBigSearch().searchBox.sendKeys(Keys.ENTER);
    }
    @Then("user should see {string} in the title")
    public void user_should_see_in_the_title(String title) {
     Assert.assertTrue(Driver.getDriver().getTitle().equalsIgnoreCase(title));
     Driver.getDriver().close();
    }


}
