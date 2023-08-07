package org.example.bussiness.pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManPage extends BasePage {
    public ManPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//button[@data-id='87a52035-f6fa-401f-bd58-0d259e403cbb']//span[text()=\"Shoes\"]")
    private WebElement shoesIcon;

    @FindBy(xpath = "//span[text()='adidas Originals']")
    private WebElement adidasOriginalButton;

    public WebElement getShoesIcon(){
        return shoesIcon;
    }

    public WebElement getAdidasOriginalButton(){
        return adidasOriginalButton;
    }
    public void clickOnAdidasOriginalButton(){
        adidasOriginalButton.click();
    }
}
