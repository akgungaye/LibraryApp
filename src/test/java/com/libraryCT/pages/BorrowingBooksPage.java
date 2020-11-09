package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BorrowingBooksPage extends BasePage  {
    public BorrowingBooksPage(){
        PageFactory.initElements(Driver.get(),this);
    }

}
