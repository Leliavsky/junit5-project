package org.example.core;

import org.example.bussiness.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryManager {
    private WebDriver driver;
    private static PageFactoryManager instance;

    private PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public static PageFactoryManager getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new PageFactoryManager(driver);
        }
        return instance;
    }

    public HomePage getHomePage() {
        return PageFactory.initElements(driver, HomePage.class);
    }
    public LoginPage getLoginPage() {
        return PageFactory.initElements(driver, LoginPage.class);
    }

    public ManPage getManPage() {
        return PageFactory.initElements(driver, ManPage.class);
    }

    public AdidasShoesPage getAdidasPage(){
        return PageFactory.initElements(driver, AdidasShoesPage.class);
    }

    public ItemPage getItemPage(){
        return PageFactory.initElements(driver, ItemPage.class);
    }
}
