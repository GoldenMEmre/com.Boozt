package tests;

import logger.Log;
import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_002_TC_001 {

    BooztPage booztPage = new BooztPage();

    Log log = new Log();

    //As a user, I should be able to verify that the menus in the header section of the Home page
    // are visible and active.


    @Test(groups = "smoke")
    public void headerVisibilityandEnableTest() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(2);
        log.info("Kullanıcı siteye gitti");
        booztPage.cookiesAccept();
        log.info("Kullanıcı cookies'i kabul etti");
        booztPage.headerSectionVisibilityandEnableTest();
        log.info("Kullanıcı tüm başlıkların görünür olduğunu kontrol etti");
        Driver.closeDriver();
        log.info("Kullanıcı sayfayı kapatır");
    }
}
