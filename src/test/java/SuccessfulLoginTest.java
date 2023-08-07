import org.example.bussiness.pages.HomePage;
import org.example.bussiness.pages.LoginPage;
import org.example.core.PageFactoryManager;
import org.example.core.TestBase;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class SuccessfulLoginTest extends TestBase {

    @Test
    public void successfulLogin(){
        HomePage homePage = PageFactoryManager.getInstance(driver).getHomePage();
        homePage.moveToElement(homePage.getAccountIcon());
        homePage.waitForElementToAppear(homePage.getSignInButton());
        homePage.clickOnSignInButton();
        LoginPage loginPage = PageFactoryManager.getInstance(driver).getLoginPage();
        loginPage.waitForPageLoadComplete(Duration.ofSeconds(10));
        loginPage.enterEmailAddress("testertestoletka@gmail.com");
        loginPage.enterPassword("Test123456");
        loginPage.clickOnSignInButton();
        sleep(3);
        homePage.moveToElement(homePage.getMyAccountIcon());
    }

}
