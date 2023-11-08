package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.BooztPage;
import pages.JavaLog;
<<<<<<< HEAD
import utilities.BaseTest;
=======
>>>>>>> main
import utilities.ConfigReader;
import utilities.Driver;

public class US_001_TC_001 extends JavaLog {

    BooztPage booztPage = new BooztPage();
    JavaLog javaLog=new JavaLog();


    //As a user, I should be able to verify that I can access the website.

    //Tarayıcıyı aç ve "https://www.boozt.com/" adresine git.

<<<<<<< HEAD
    @Test (groups = "smoke")
    public void WebPageAccessTest(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        logger.info("User goes to Url");
=======
    @Test(groups = "smoke")
    public void WebPageAccessTest() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        javaLog.logger.info("Url e gider");
>>>>>>> main
        booztPage.cookiesAccept();
        logger.info("User accepts cookies");
        Driver.closeDriver();
    }
<<<<<<< HEAD
    }
=======
}




>>>>>>> main




