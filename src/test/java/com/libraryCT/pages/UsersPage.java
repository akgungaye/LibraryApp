package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UsersPage extends BasePage {

    public UsersPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = ".btn.btn-lg.btn-outline.btn-primary.btn-sm")
    public WebElement addUser;

    @FindBy(name = "full_name")
    public WebElement fullName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "start_date")
    public WebElement startDate;

    @FindBy(name = "end_date")
    public WebElement endDate;

    @FindBy(name = "address")
    public WebElement address;

    @FindBy(id = "user_group_id")
    public WebElement userGroup;

    @FindBy(id = "status")
    public WebElement status;

    @FindBy(xpath = "//button[text()='Close']")
    public WebElement closeButton;

    @FindBy(xpath = "//button[text()='Save changes']")
    public WebElement saveChanges;

    @FindBy(css = ".btn.btn-primary.btn-sm")  // second Element for Edit
    public List<WebElement> editUser;


    @FindBy(xpath = "//tbody/tr[@role='row'][1]/td[3]")  //  first element is new User
    public WebElement addedUser;

    @FindBy(xpath = "//tbody/tr[@role='row'][1]/td[2]")  //  first element is new User
    public WebElement userID;

    @FindBy(css = ".toast.toast-success")
    public WebElement verificationMessage;

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement usersButton;

    @FindBy(xpath = "//select[@aria-controls='tbl_users']")
    public WebElement recordsDropdown;

    @FindBy(xpath = "//div[@class='dataTables_info']")
    public WebElement dataTablesInfo ;

    @FindBy(xpath = "//table[@id='tbl_users']/tbody/tr")
    public List<WebElement> rows;


     public String userIDVerify="";

    public  void fillForm(){

        Select userDropdown=new Select(userGroup);
        BrowserUtils.waitFor(3);
        userDropdown.selectByIndex(0);

        Select statusDropdown=new Select(status);
        BrowserUtils.waitFor(3);
        statusDropdown.selectByIndex(0);

            userIDVerify=userID.getText();
            System.out.println("new UsersPage().userIDVerify = " + userIDVerify);

        fullName.sendKeys("Mike Tyson");
            password.sendKeys("88888888");
            email.sendKeys("ankarali06@gücü.com");
            userDropdown.selectByIndex(0);
            statusDropdown.selectByIndex(0);
            startDate.sendKeys("2020-11-08", Keys.ENTER);
            endDate.sendKeys("2020-12-08", Keys.ENTER);
            address.sendKeys("Uzun ince bir yoldayım");


        System.out.println("new UsersPage().userID.getText() = " + userID.getText());
            saveChanges.click();
            closeButton.click();


    }



}
