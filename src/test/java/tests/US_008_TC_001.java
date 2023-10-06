package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class US_008_TC_001 {
    //As a user, I should be able to add an item as a favorite.

    BooztPage booztPage = new BooztPage();
    Actions actions=new Actions(Driver.getDriver());

    //As a user, I should be able to verify that when
    // I insert any item in the search box, I should be able to see the results related to the search.

    @Test
    public void searchBoxTest() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.userProductSearch();
        booztPage.candlesSearchPageFirstProduct.click();
        actions.scrollToElement(booztPage.candlesSearchPageFirstProductAddToSaveAsFavoriteButton);
        booztPage.candlesSearchPageFirstProductAddToSaveAsFavoriteButton.click();
        Assert.assertTrue(booztPage.candlesSearchPageFirstProductAddFavoriteRedHeart.isDisplayed());
        Driver.closeDriver();
    }
}
