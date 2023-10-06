package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_007_TC_001 {

    BooztPage booztPage = new BooztPage();
    Actions actions = new Actions(Driver.getDriver());

    //As a user, I should be able to sort the products by price.

    @Test (groups = "smoke")
    public void searchBoxTest() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.userProductSearch();
        actions.scrollToElement(booztPage.homeDecorOfficeSupplies).perform();
        booztPage.searchPageSortBy.click();
        booztPage.priceLowToHigh.click();
        Assert.assertFalse(booztPage.priceLowToHigh.isSelected());

        //Select select = new Select(booztPage.searchPageSortBy);
        //select.selectByVisibleText("Price low-high");






    }
}
