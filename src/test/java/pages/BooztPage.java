package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BooztPage {

    public BooztPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Cookies Accept Method
    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookiesButton;


    public void cookiesAccept() {
        acceptCookiesButton.click();

    }

}
