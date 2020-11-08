package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage {
    public MainPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//li[@class='nav-item']")
    public List<WebElement> navbarLink;

    @FindBy(css = ".nav-item.dropdown")
    public WebElement usernameNavDropDown;

    @FindBy(css = ".navbar-brand")
    public WebElement libraryMain;

    @FindBy(linkText = "Users")
    public WebElement users;


}
