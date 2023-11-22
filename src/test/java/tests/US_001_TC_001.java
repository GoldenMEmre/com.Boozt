package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import logger.Log;
import org.testng.annotations.Test;
import pages.BooztPage;



import utilities.ConfigReader;
import utilities.Driver;

public class US_001_TC_001 {

    BooztPage booztPage = new BooztPage();
    Log log = new Log();


    //As a user, I should be able to verify that I can access the website.

    //Tarayıcıyı aç ve "https://www.boozt.com/" adresine git.

    @Test(groups = "smoke")
    @Description("Web Page Access test")
    @Severity(SeverityLevel.CRITICAL)
    public void WebPageAccessTest() {
        log.info("Boozt UI Testi basladi");
        Driver.getDriver().get(ConfigReader.getProperty("url"));


        booztPage.cookiesAccept();
        log.info("Cookies kabul edildi");

        Driver.closeDriver();
    }

    }











