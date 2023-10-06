package tests;

public class US_003_TC_001 {

    BooztPage booztPage=new BooztPage();

    //As a user, I should be able to verify that when I fill up the necessary information on the create account page,
    // I should be able to create an account.

    @Test (groups = "smoke")
    public void createAccountTest(){

        String myBooztText = "My Boozt";
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.clickCreateAccountButton();
        booztPage.createAnAccount();
        Assert.assertEquals(myBooztText,booztPage.myAccountMyBooztText.getText());
        Driver.closeDriver();
    }

    //As a user, I should be able to verify that when I fill up the necessary
    // information on the create account page, I should be able to create an account.
}
