package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006_TC_001 {

    BooztPage booztPage = new BooztPage();
    Actions actions=new Actions(Driver.getDriver());

    //As a user, I should be able to add, increase, decrease and remove an item from the shopping cart.

    @Test
    public void searchBoxTest() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        booztPage.cookiesAccept();
        booztPage.userProductSearch();
        booztPage.clickProduct();
        String added= "Item";
        String itemAddedToCartTextStr= booztPage.itemAddedToCartGetText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(itemAddedToCartTextStr.contains(added));
        booztPage.increaseDecreaseAndRemoveProduct();
        softAssert.assertTrue(booztPage.cartPageProductName.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
