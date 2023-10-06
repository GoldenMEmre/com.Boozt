package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_009_TC_001 {

    //As a user, I should be able to go shopping and complete all process until the payment
    // done without login.
    BooztPage booztPage = new BooztPage();
    @Test
    public void searchBoxTest() {
        Actions actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.userProductSearch();
        booztPage.paymentWithoutLogin();
        Driver.closeDriver();
    }
}