package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BooksPage extends BasePage {

    public BooksPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//select[@id='book_categories']")
    public WebElement categoriesDropdown;

    @FindBy(xpath = "//tbody//td[5]")
    public List<WebElement> categoryRows;



}
