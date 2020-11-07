package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "#inputEmail")
    public WebElement userNameBox;

    @FindBy(css = "#inputPassword")
    public WebElement passwordBox;

    @FindBy(css = ".btn.btn-lg.btn-primary.btn-block")
    public WebElement signInButton;


    public void logIn(String email, String password){
        BrowserUtils.waitForVisibility(userNameBox,3);
        userNameBox.sendKeys(email);
        BrowserUtils.waitForVisibility(passwordBox,3);
        passwordBox.sendKeys(password);
        signInButton.click();
    }






}
