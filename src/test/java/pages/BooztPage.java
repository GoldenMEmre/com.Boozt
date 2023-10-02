package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.Assert.assertTrue;

public class BooztPage {

    String password;
    String email;

    public BooztPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Cookies Accept Method
    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookiesButton;


    public void cookiesAccept() {
        acceptCookiesButton.click();

    }
    //Creating Account Method
   @FindBy(xpath = "(//div[@class='icon icon--size-small palette-button__icon'])[2]")
   private WebElement profilIkonButton;

    @FindBy(xpath = "//*[text()='Create account']")
    private WebElement createAccountButton;

    public void clickCreateAccountButton(){
    profilIkonButton.click();
    createAccountButton.click();

    }
    //Header Section Method

    @FindBy(xpath = "//a[@href='/eu/en/women']")
    private WebElement homePageWomenLink;

    @FindBy(xpath = "//a[@href='/eu/en/menswear']")
    private WebElement homePageMenLink;

    @FindBy(xpath = "//a[@href='/eu/en/kids']")
    private WebElement homePageKidsLink;

    @FindBy(xpath = "(//*[text()='Sport'])[1]")
    private WebElement homePageSportLink;

    @FindBy(xpath = "//a[@href='/eu/en/homeware']")
    private WebElement homePageHomewareLink;

    @FindBy(className = "header-logo__svg")
    private WebElement homePageLink;

    @FindBy(xpath = "(//div[@class='icon icon--size-small palette-button__icon'])[3]")
    private WebElement clubIconButton;

    @FindBy(xpath = "(//div[@class='icon icon--size-small palette-button__icon'])[4]")
    private WebElement favoriteIconButton;

    @FindBy(xpath = "(//div[@class='icon icon--size-small palette-button__icon'])[5]")
    private WebElement cartButton;

    public void headerSectionVisibilityandEnableTest(){

        SoftAssert softAssert= new SoftAssert();

        softAssert.assertTrue(homePageWomenLink.isDisplayed());
        softAssert.assertTrue(homePageMenLink.isDisplayed());
        softAssert.assertTrue(homePageKidsLink.isDisplayed());
        softAssert.assertTrue(homePageSportLink.isDisplayed());
        softAssert.assertTrue(homePageHomewareLink.isDisplayed());
        softAssert.assertTrue(homePageLink.isDisplayed());
        softAssert.assertTrue(profilIkonButton.isDisplayed());
        softAssert.assertTrue(clubIconButton.isDisplayed());
        softAssert.assertTrue(favoriteIconButton.isDisplayed());
        softAssert.assertTrue(cartButton.isDisplayed());

        softAssert.assertTrue(homePageWomenLink.isEnabled());
        softAssert.assertTrue(homePageMenLink.isEnabled());
        softAssert.assertTrue(homePageKidsLink.isEnabled());
        softAssert.assertTrue(homePageSportLink.isEnabled());
        softAssert.assertTrue(homePageHomewareLink.isEnabled());
        softAssert.assertTrue(homePageLink.isEnabled());
        softAssert.assertTrue(profilIkonButton.isEnabled());
        softAssert.assertTrue(clubIconButton.isEnabled());
        softAssert.assertTrue(favoriteIconButton.isEnabled());
        softAssert.assertTrue(cartButton.isEnabled());

        softAssert.assertAll();
    }
    //Creating Account Method(Cont.)

    @FindBy(xpath = "(//input[@class='skip-generic-styling'])[2]")
    private WebElement creatingAccountFirstNameBox;

    @FindBy(xpath = "(//span[@class='palette-button__label'])[1]")
    private WebElement createAccountPageCreateAccountButton;

    @FindBy(xpath = "//h1[@class='dashboard-title__headline']")
    public WebElement myAccountMyBooztText;

    public void createAnAccount(){
//Please make sure the password contains upper cases,
// lower cases, numbers and is at least 6 characters long
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        password = "12345Aa";
        email = faker.internet().emailAddress();

        actions.click(creatingAccountFirstNameBox)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .perform();

        actions.scrollToElement(createAccountPageCreateAccountButton).perform();
        createAccountPageCreateAccountButton.click();
        ReusableMethods.bekle(5);
    }
    @FindBy (xpath = "(//input[@class='skip-generic-styling'])[2]")
    public WebElement loginEmailBox;

    @FindBy (xpath = "(//input[@class='skip-generic-styling'])[3]")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "(//span[@class='palette-button__label'])[1]")
    public WebElement loginPageLoginButton;

    @FindBy(xpath = "(//img[@draggable='true'])[1]")
    public WebElement selectedPopup;

    @FindBy(xpath = "(//img[@draggable='true'])[2]")
    public WebElement dontMissPopup;


        public void userLogin(){
            profilIkonButton.click();
            ReusableMethods.bekle(7);
            dontMissPopup.click();
            selectedPopup.click();
            loginEmailBox.sendKeys(email);
            loginPasswordBox.sendKeys(password);
            loginPageLoginButton.click();
            ReusableMethods.bekle(3);



    }


}
