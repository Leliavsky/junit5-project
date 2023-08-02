package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.example.core.PageFactoryManager;
import org.openqa.selenium.WebDriver;

public class RozetkaPage extends BasePage {

    public RozetkaPage(WebDriver driver) {
        super(driver);
    }
    public void openRozetkaPage(String url) {
        driver.get(url);
    }
}
