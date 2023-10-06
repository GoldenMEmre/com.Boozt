package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_010_TC_001 {

    BooztPage booztPage = new BooztPage();
    Actions actions = new Actions(Driver.getDriver());

    //As a user, I should be able to go shopping and complete all process until
    // the payment done with login.

    @Test (groups = "smoke")
    public void loginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.userLogin();
        booztPage.userProductSearch();
        booztPage.paymentWithLogin();
    }
}
