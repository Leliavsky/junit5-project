package org.example.core;

import org.example.bussiness.pages.RozetkaPage;
import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    WebDriver driver;
    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }
    public RozetkaPage getRozetkaPage() {
        return new RozetkaPage(driver);
    }
}
