package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//div[@class='input-wrapper not-unified-signin-page-element']/input[@class='qa-email-textbox']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='signin']")
    private WebElement signInButton;

    public void enterEmailAddress(String email) {
        emailAddressField.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickOnSignInButton(){
        signInButton.click();
    }
}
