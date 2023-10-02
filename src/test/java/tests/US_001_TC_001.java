package tests;


import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001_TC_001 {

    BooztPage booztPage= new BooztPage();

    //As a user, I should be able to verify that I can access the website.

    //Tarayıcıyı aç ve "https://www.boozt.com/" adresine git.

    @Test
    public void Test01(){


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        Driver.quitDriver();

    }



}
