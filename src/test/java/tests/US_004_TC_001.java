package tests;

public class US_004_TC_001 {
    //As a user, I should be able to login with valid credentials.

    @Test (groups = "smoke")
    public void loginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.userLogin();
        Driver.closeDriver();
    }
}



