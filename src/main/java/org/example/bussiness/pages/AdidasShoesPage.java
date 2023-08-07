package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdidasShoesPage extends BasePage {
    public AdidasShoesPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@class='productHeroContainer_dVvdX productTileProductHero_ANcmA']")
    private WebElement firstItem;

    public void clickOnFirstItem(){
        firstItem.click();
    }
}
