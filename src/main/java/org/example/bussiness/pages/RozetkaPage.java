package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.example.core.PageFactoryManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RozetkaPage extends BasePage {

    public RozetkaPage(WebDriver driver) {
        super(driver);
    }
    public void openRozetkaPage(String url) {
        driver.get(url);
    }

    @FindBy(xpath = "//*[.='Ноутбуки та комп’ютери']//a[@class='menu-categories__link']")
    private WebElement laptopAndComputersButton;

    @FindBy(xpath = "//h1[@class='portal__heading ng-star-inserted']")
    private WebElement laptopAndComputerTitle;

    public void clickOnLaptopAndComputerButton(){
        laptopAndComputersButton.click();
    }
    public void waitForSearchInputToAppear() {
        waitForElementToAppear(laptopAndComputerTitle);
    }
}
