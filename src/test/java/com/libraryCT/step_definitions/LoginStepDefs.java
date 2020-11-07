package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.MainPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String expectedTitle="Login - Library";
        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user should enter valid {string} and {string} than click login button")
    public void user_should_enter_valid_and_than_click_login_button(String email, String password) {
        new LoginPage().logIn(email, password);
    }

    @Then("user should able to log in")
    public void user_should_able_to_log_in() throws InterruptedException {
        String expectedTitle="Library";
        BrowserUtils.waitFor(3);
        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }


}
