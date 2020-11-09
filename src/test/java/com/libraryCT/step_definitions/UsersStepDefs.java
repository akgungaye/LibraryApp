package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;
import com.libraryCT.pages.WelcomePage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UsersStepDefs {
    String verify="";

    @Then("user should be able navigate Users")
    public void user_should_be_able_navigate_Users() {
        new WelcomePage().users.click();
        Assert.assertEquals("http://library2.cybertekschool.com/#users", new WelcomePage().getCurrentUrl(new UsersPage().addUser));
    }

    @Then("user should be able navigate Books")
    public void user_should_be_able_navigate_Books() {
        new WelcomePage().booksModule.click();
        Assert.assertEquals("http://library2.cybertekschool.com/#books", new WelcomePage().getCurrentUrl(new BooksPage().categoriesDropdown));
    }

    @When("user should be able to add user")
    public void user_should_be_able_to_add_user(){
        new UsersPage().addUser.click();
        new UsersPage().fillForm();

        Assert.assertNotEquals(new UsersPage().userIDVerify,new UsersPage().userID.getText());


    }

    @When("user should be able to edit user")
    public void user_should_be_able_to_edit_user() throws InterruptedException {

        new UsersPage().editUser.get(1).click();
        System.out.println("Test2");
        new UsersPage().address.sendKeys("Time is 02:00 now I am still working enough is enough");
        new UsersPage().saveChanges.click();
        BrowserUtils.waitForVisibility(new UsersPage().verificationMessage,2);

        Assert.assertEquals("The user updated.",new UsersPage().verificationMessage.getText());




    }

    @Then("user should be able to see following table names")
    public void user_should_be_able_to_see_following_table_names(List<String> tables) {


        new UsersPage().booksModule.click();
        System.out.println("BrowserUtils.getElementsText(new UsersPage().tableNames) = " + BrowserUtils.getElementsText(new UsersPage().tableNames));

        Assert.assertEquals(tables, BrowserUtils.getElementsText(new UsersPage().tableNames));

    }



}
