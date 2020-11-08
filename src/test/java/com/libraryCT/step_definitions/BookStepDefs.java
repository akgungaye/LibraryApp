package com.libraryCT.step_definitions;

import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookStepDefs {


    @Then("verify default type is {string} records")
    public void verifyDefaultTypeIsRecords(String defaultValue) {
        UsersPage usersPage = new UsersPage();
        Select select = new Select(usersPage.recordsDropdown);
        String actual = select.getFirstSelectedOption().getText();
        String expected =defaultValue;
        Assert.assertEquals(expected,actual);
    }


    @Then("show records for {string} options")
    public void showRecordsForOptions(String chooseValue) {
        UsersPage usersPage = new UsersPage();
        Select select = new Select(usersPage.recordsDropdown);
        select.selectByVisibleText(chooseValue);
        BrowserUtils.waitFor(3);
        int actual = Integer.parseInt(chooseValue);
        System.out.println("actual = " + actual);

        int expected=usersPage.rows.size();
        System.out.println("expected = " + expected);
        Assert.assertEquals(expected,actual);


    }
}
