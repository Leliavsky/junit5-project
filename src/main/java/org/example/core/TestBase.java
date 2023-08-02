package org.example.core;

import org.example.bussiness.pages.RozetkaPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class TestBase {
    WebDriver driver;
    protected PageFactoryManager pageFactoryManager;

    @BeforeEach
    public void setUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
