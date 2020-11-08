package com.libraryCT.step_definitions;

import com.libraryCT.pages.MainPage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UsersStepDefs {

    String userName="";

    @Then("user should be able navigate {string}")
    public void user_should_be_able_navigate(String string) {
        new MainPage().users.click();
        Assert.assertEquals("http://library2.cybertekschool.com/#users", new MainPage().getCurrentUrl(new UsersPage().addUser));
    }

    @When("user should be able to add user")
    public void user_should_be_able_to_add_user() {
        new UsersPage().addUser.click();
        new UsersPage().fillForm();

        Assert.assertNotEquals(new UsersPage().userIDVerify,new UsersPage().userID.getText());
        //System.out.println("new UsersPage().verificationMessage.getText() = " + new UsersPage().verificationMessage.getText());
       // Assert.assertEquals("The user has been created",new UsersPage().verificationMessage.getText());
        // How can I take green verification messages

    }

    @When("user should be able to edit user")
    public void user_should_be_able_to_edit_user() {
        System.out.println("Test1");

        new UsersPage().editUser.get(1).click();
        System.out.println("Test2");
        new UsersPage().address.sendKeys("Time is 02:00 now I am still working enough is enough");
        new UsersPage().saveChanges.click();


        System.out.println("new UsersPage().userID.getText() = " + new UsersPage().address.getText());

        Assert.assertTrue(new UsersPage().address.getText().contains("Time"));


    }

    @Then("user should be able to see following table names")
    public void user_should_be_able_to_see_following_table_names(List<String> tables) {


        new UsersPage().booksModule.click();
        System.out.println("BrowserUtils.getElementsText(new UsersPage().tableNames) = " + BrowserUtils.getElementsText(new UsersPage().tableNames));

        Assert.assertEquals(tables, BrowserUtils.getElementsText(new UsersPage().tableNames));

    }



}
