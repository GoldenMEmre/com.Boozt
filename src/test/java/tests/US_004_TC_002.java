package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_004_TC_002 {
    BooztPage booztPage = new BooztPage();

    //As a user, I should be able to login with valid credentials.

    @Test
    public void negativeLoginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.userNotLogin();
        String errorMessage = "incorrect";
        Assert.assertTrue(booztPage.notLoginErrorMessage.getText().contains(errorMessage));
        Driver.closeDriver();
    }



}
