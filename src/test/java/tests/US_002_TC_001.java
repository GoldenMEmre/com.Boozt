package tests;

import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_002_TC_001 {

    BooztPage booztPage = new BooztPage();

    //As a user, I should be able to verify that the menus in the header section of the Home page
    // are visible and active.

    @Test
    public void headerVisibilityandEnableTest(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.headerSectionVisibilityandEnableTest();
        Driver.closeDriver();

    }
}
