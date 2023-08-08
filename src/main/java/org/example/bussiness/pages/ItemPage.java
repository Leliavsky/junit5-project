package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {
    public ItemPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//select[@id='variantSelector']")
    private WebElement sizeDropDownWindow;

    @FindBy(xpath = "//option[@value='203030845']")
    private WebElement size42;

    @FindBy(xpath = "//button[@class='jAEfQ LLfrW']")
    private WebElement addToBagButton;

    @FindBy(xpath = "//span[@type='bagUnfilled']")
    private WebElement myBagIcon;

    @FindBy(xpath = "//span[text()='View Bag']")
    private WebElement viewBagButton;
    public void clickOnSizeDropDownWindow(){
        sizeDropDownWindow.click();
    }
    public void clickOnSize42(){
        size42.click();
    }

    public void clickOnAddToBagButton(){
        addToBagButton.click();
    }

    public WebElement getMyBagIcon(){
        return myBagIcon;
    }

    public WebElement getViewBagButton(){
        return viewBagButton;
    }

    public void clickOnViewBagButton(){
        viewBagButton.click();
    }
}
