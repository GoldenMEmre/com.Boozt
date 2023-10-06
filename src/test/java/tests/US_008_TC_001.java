package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_008_TC_001 {
    //As a user, I should be able to add an item as a favorite.

    BooztPage booztPage = new BooztPage();
    Actions actions=new Actions(Driver.getDriver());
    @Test (groups = "smoke")
    public void searchBoxTest() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.userProductSearch();
        booztPage.addFavoriteProduct();
        Assert.assertTrue(booztPage.candlesSearchPageFirstProductAddFavoriteRedHeart.isDisplayed());
        Driver.closeDriver();
    }
}

