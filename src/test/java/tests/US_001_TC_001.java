package tests;

import org.testng.annotations.Test;
import pages.BooztPage;
import pages.JavaLog;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001_TC_001 {

    BooztPage booztPage = new BooztPage();
    JavaLog javaLog=new JavaLog();


    //As a user, I should be able to verify that I can access the website.

    //Tarayıcıyı aç ve "https://www.boozt.com/" adresine git.

    @Test(groups = "smoke")
    public void WebPageAccessTest() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        javaLog.logger.info("Url e gider");
        booztPage.cookiesAccept();
        Driver.closeDriver();
    }
}








