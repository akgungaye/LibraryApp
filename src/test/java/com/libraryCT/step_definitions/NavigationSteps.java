package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class NavigationSteps {

    @When("user should able to login with following credential")
    public void user_should_able_to_login_with_following_credential(Map<String,String> userInfo) {
        String user=userInfo.get("email");
        String password=userInfo.get("password");
        new LoginPage().logIn(user,password);
    }

    @Then("user should be able to navigate between tabs")
    public void user_should_be_able_to_navigate_between_tabs(List<String> modules) {

    Assert.assertEquals(modules,BrowserUtils.getElementsText(new BooksPage().navbarLink));

    }

}
