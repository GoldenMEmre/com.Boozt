package tests;

import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_003_TC_001 {

    BooztPage booztPage=new BooztPage();

    //As a user, I should be able to verify that when I fill up the necessary information on the create account page,
    // I should be able to create an account.

    @Test
    public void createAccountTest(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.clickCreateAccountButton();
    }


}

