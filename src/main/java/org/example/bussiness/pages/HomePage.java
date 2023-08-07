package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.print.attribute.standard.Fidelity;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[@type='accountUnfilled']")
    private WebElement accountIcon;

    @FindBy(xpath = "//span[@type='accountFilled']")
    private WebElement myAccountIcon;


    @FindBy(xpath = "//span[@class='imGTA3b']//*[contains(text(), 'Sign In')]")
    private WebElement signInButton;//span[@class='DwRt6tf']

    @FindBy(xpath = "//a[@data-testid='men-floor']")
    private WebElement manButton;

    public WebElement getAccountIcon(){
        return accountIcon;
    }

    public WebElement getMyAccountIcon(){
        return myAccountIcon;
    }

    public void clickOnSignInButton(){
        signInButton.click();
    }

    public WebElement getSignInButton(){
        return signInButton;
    }

    public void clickOnManButton(){
        manButton.click();
    }
}
