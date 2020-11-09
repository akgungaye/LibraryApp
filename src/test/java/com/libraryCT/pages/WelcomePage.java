package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage {
    public WelcomePage(){
        PageFactory.initElements(Driver.get(),this);
    }

}
