import org.example.bussiness.pages.AdidasShoesPage;
import org.example.bussiness.pages.HomePage;
import org.example.bussiness.pages.ItemPage;
import org.example.bussiness.pages.ManPage;
import org.example.core.PageFactoryManager;
import org.example.core.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddItemToBagTest extends TestBase {

    @Test
    @DisplayName("Add Item To Bag Test")
    public void addItemToBag(){
        HomePage homePage = PageFactoryManager.getInstance(driver).getHomePage();
        homePage.clickOnManButton();
        ManPage manPage = PageFactoryManager.getInstance(driver).getManPage();
        manPage.moveToElement(manPage.getShoesIcon());
        manPage.waitForElementToAppear(manPage.getAdidasOriginalButton());
        manPage.clickOnAdidasOriginalButton();
        AdidasShoesPage adidasShoesPage = PageFactoryManager.getInstance(driver).getAdidasPage();
        adidasShoesPage.clickOnFirstItem();
        ItemPage itemPage = PageFactoryManager.getInstance(driver).getItemPage();
        itemPage.clickOnSizeDropDownWindow();
        itemPage.clickOnSize42();
        sleep(2);
        itemPage.clickOnAddToBagButton();
        sleep(2);
        itemPage.moveToElement(itemPage.getMyBagIcon());
        itemPage.waitForElementToAppear(itemPage.getViewBagButton());
        itemPage.clickOnViewBagButton();
        sleep(3);
    }
}
