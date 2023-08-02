import org.example.core.PageFactoryManager;
import org.example.core.TestBase;
import org.example.bussiness.pages.RozetkaPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class RozetkaPageTest extends TestBase{
    private RozetkaPage rozetkaPage;

    @BeforeEach
    public void setUpPage() {
        rozetkaPage = pageFactoryManager.getRozetkaPage();
    }

    @Test
    public void test(){
        rozetkaPage.openRozetkaPage("https://rozetka.com.ua/");
        rozetkaPage.clickOnLaptopAndComputerButton();
        rozetkaPage.waitForSearchInputToAppear();
    }
}
