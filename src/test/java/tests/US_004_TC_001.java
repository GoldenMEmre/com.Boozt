package tests;

import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_004_TC_001 {
    BooztPage booztPage = new BooztPage();


    //As a user, I should be able to login with valid credentials.

    @Test (groups = "smoke")
    public void loginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(2);
        booztPage.cookiesAccept();
        booztPage.userLogin();
        Driver.closeDriver();
    }
}