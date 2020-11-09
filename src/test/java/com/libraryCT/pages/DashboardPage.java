package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage  {
    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);
    }

}
