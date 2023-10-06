package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_005_TC_001 {

    BooztPage booztPage = new BooztPage();

    //As a user, I should be able to verify that when
    // I insert any item in the search box, I should be able to see the results related to the search.

    @Test (groups = "smoke")
    public void searchBoxTest() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.userProductSearch();
        String myBooztText = "Candles";
        Assert.assertEquals(myBooztText,booztPage.searchResults.getText());
        Driver.closeDriver();
    }
}
