package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import utilities.Driver;

public class BooztPage {

    String password;
    String email;
    String itemAddedToCartTextstr;

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
   @FindBy(xpath = "(//div[@class='icon icon--size-small icon--stroke-width-regular palette-button__icon'])[2]")
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

    @FindBy(xpath = "(//div[@class='icon icon--size-small icon--stroke-width-regular palette-button__icon'])[3]")
    private WebElement clubIconButton;

    @FindBy(xpath = "(//div[@class='icon icon--size-small icon--stroke-width-regular palette-button__icon'])[4]")
    private WebElement favoriteIconButton;

    @FindBy(xpath = "(//div[@class='icon icon--size-small icon--stroke-width-regular palette-button__icon'])[5]")
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

    //Positive Login Method
    @FindBy (xpath = "(//input[@class='skip-generic-styling'])[2]")
    public WebElement loginEmailBox;

    @FindBy (xpath = "(//input[@class='skip-generic-styling'])[3]")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "(//span[@class='palette-button__label'])[1]")
    public WebElement loginPageLoginButton;

    @FindBy(xpath = "//div[@data-id='Element162']")
    public WebElement selectedStylePopup;

    @FindBy(xpath = "//div[@data-id='Element564']")
    public WebElement dontMissPopup;

        public void userLogin(){

            email="muleyke.cevik@gmail.com";
            password="12345mM";

            profilIkonButton.click();
            //ReusableMethods.bekle(7);
            //dontMissPopup.click();
            //selectedPopup.click();
            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(loginEmailBox,email).perform();
            //loginEmailBox.click();
            //loginEmailBox.sendKeys(email);
            //loginPasswordBox.click();
            //loginPasswordBox.sendKeys(password);
            actions.sendKeys(loginPasswordBox,password).perform();
            loginPageLoginButton.click();
            ReusableMethods.bekle(3);
    }

    @FindBy (xpath = "//label[@class='text text--error']")
    public WebElement notLoginErrorMessage;

    public void userNotLogin(){

        email="muleyke.cevik@gmail.com";
        password="0000aA";
        profilIkonButton.click();
        ReusableMethods.bekle(7);
        //dontMissPopup.click();
        //selectedPopup.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(loginEmailBox,email).perform();
        actions.sendKeys(loginPasswordBox,password).perform();
        loginPageLoginButton.click();
        ReusableMethods.bekle(3);
    }
    //Search Product Method
    @FindBy (xpath = "//input[@class=\'skip-generic-styling\']")
    private WebElement searchBox;

    public void userProductSearch(){
        searchBox.sendKeys("candle");
        searchBox.sendKeys(Keys.ENTER);
    }
    @FindBy (xpath = "(//*[text()='Candles'])[4]")
    public WebElement searchResults;

    @FindBy (xpath = "(//img[@class='palette-image palette-image--loaded palette-image--lazy palette-product-card-main-image__image'])[4]")
    public WebElement candlesPageFourthItem;

    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement candlesPageFourthItemAddToCartButton;

    @FindBy(xpath = "//span[text()='Go to cart']")
    public WebElement candlesPageFourthItemGoToCartButton;

    @FindBy(xpath = "//div[@class='add-to-cart-feedback-slide-panel__header']")
    public WebElement itemAddedToCartText;

    public void clickProduct(){

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(candlesPageFourthItem);
        ReusableMethods.bekle(5);
        candlesPageFourthItem.click();
        ReusableMethods.bekle(3);
        //booztPage.dontMissPopup.click();
        //booztPage.selectedStylePopup.click();
        actions.scrollToElement(candlesPageFourthItemAddToCartButton);
        }
        public String itemAddedToCartGetText(){

        itemAddedToCartTextstr= itemAddedToCartText.getText().replaceAll("\\W", "");

        return itemAddedToCartTextstr;
        }

    @FindBy(xpath = "//select[@class='select__dropdown skip-generic-styling']")
    public WebElement cartItemNumberIncreaseDecrease;

    @FindBy(xpath = "(//div[@class='icon icon--size-x-small icon--stroke-width-regular palette-button__icon'])[2]")
    public WebElement removeItemIcon;

    public void increaseDecreaseAndRemoveProduct(){

        candlesPageFourthItemAddToCartButton.click();
        candlesPageFourthItemGoToCartButton.click();
        Select select = new Select(cartItemNumberIncreaseDecrease);
        select.selectByVisibleText("3");
        ReusableMethods.bekle(2);
        select.selectByVisibleText("1");
        ReusableMethods.bekle(2);
        removeItemIcon.click();
    }

    @FindBy(xpath = "//div[@class='checkout-secondary-text shopcart-item__name']")
    public WebElement cartPageProductName;

    @FindBy(xpath = "(//a[@class='left-navigation-item__link'])[17]")
    public WebElement homeDecorOfficeSupplies;

    @FindBy(xpath = "(//div[@style='transition-property: background-color;'])[4]")
    public WebElement priceLowToHigh;

    @FindBy(xpath = "//span[text()='Sort by']")
    public WebElement searchPageSortBy;

    @FindBy(xpath = "//input[@id='price_asc'] ")
    public WebElement priceAscendingButton;

    @FindBy(xpath = "(//div[@data-navigation-id='80660'])[1]")
    public WebElement candlesSearchPageFirstProduct;

    @FindBy(xpath = "(//span[@class='palette-button__label'])[5]")
    public WebElement candlesSearchPageFirstProductAddToSaveAsFavoriteButton;

    @FindBy(xpath = "//div[@class='icon icon--color-red-700 icon--size-small icon--stroke-width-regular palette-button__icon']")
    public WebElement candlesSearchPageFirstProductAddFavoriteRedHeart;

    public void addFavoriteProduct(){

        candlesSearchPageFirstProduct.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(candlesSearchPageFirstProductAddToSaveAsFavoriteButton).perform();
        candlesSearchPageFirstProductAddToSaveAsFavoriteButton.click();
        ReusableMethods.bekle(5);
    }

    @FindBy(xpath = "(//span[text()='Checkout'])[2]")
    public WebElement searchPageFourthItemCheckoutButton;

    @FindBy(xpath = "(//span[@class='palette-button__label'])[7]")
    public WebElement searchPageFourthItemContinueToCheckout;

    @FindBy(xpath = "//input[@class='skip-generic-styling'][1]")
    public WebElement bilingAndDeliveryInformationEmailBox;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement bilingAndDeliveryInformationFirstNameBox;

    @FindBy(xpath = "(//div[@style='transition-property: background-color;'])[6]")
    public WebElement termsAndConditionsBox;

    @FindBy(xpath = "(//*[text()='Go to secure payment'])[1]")
    public WebElement goToSecurePaymentButton;

    @FindBy(xpath = "//iframe[@class='style_checkoutIframe__-lnG5']")
    public WebElement paymentFrameBox;

    @FindBy(xpath = "(//input[@class='form-control rp-content-card-input config-input ng-star-inserted'])[1]")
    public WebElement creditCardNumberBox;

    @FindBy(xpath = "//input[@name='cc-exp']")
    public WebElement creditCardExpiryDateBox;

    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement creditCardSecurityCodeBox;

    @FindBy(xpath = "//button[@id='rp-card-button']")
    public WebElement paymentWithLoginButton;

    //Payment Without Login
    public void paymentWithoutLogin(){

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(candlesPageFourthItem);
        ReusableMethods.bekle(5);
        candlesPageFourthItem.click();
        ReusableMethods.bekle(3);
        //booztPage.dontMissPopup.click();
        //booztPage.selectedStylePopup.click();
        actions.scrollToElement(candlesPageFourthItemAddToCartButton);
        candlesPageFourthItemAddToCartButton.click();
        candlesPageFourthItemGoToCartButton.click();
        //actions.scrollToElement(cartItemNumberIncreaseDecrease).perform();
        Select select = new Select(cartItemNumberIncreaseDecrease);
        select.selectByVisibleText("3");
        searchPageFourthItemCheckoutButton.click();
        //booztPage.searchPageFourthItemContinueToCheckout.click();
        Faker faker = new Faker();
        actions.click(bilingAndDeliveryInformationEmailBox)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                //.sendKeys(Keys.TAB)
                .perform();

        (bilingAndDeliveryInformationEmailBox).click();
        bilingAndDeliveryInformationFirstNameBox.click();
        ReusableMethods.bekle(3);
    }
    //Payment With Login
    public void paymentWithLogin(){

        Actions actions= new Actions(Driver.getDriver());
        actions.scrollToElement(candlesPageFourthItem);
        ReusableMethods.bekle(5);
        candlesPageFourthItem.click();
        ReusableMethods.bekle(3);
        //booztPage.dontMissPopup.click();
        //booztPage.selectedStylePopup.click();
        actions.scrollToElement(candlesPageFourthItemAddToCartButton);
        candlesPageFourthItemAddToCartButton.click();
        candlesPageFourthItemGoToCartButton.click();
        Select select = new Select(cartItemNumberIncreaseDecrease);
        select.selectByVisibleText("3");
        searchPageFourthItemCheckoutButton.click();
        //booztPage.searchPageFourthItemContinueToCheckout.click();
        termsAndConditionsBox.click();
        //goToSecurePaymentButton.click();
        //ReusableMethods.bekle(5);
        //Driver.getDriver().switchTo().frame(paymentFrameBox);
        //booztPage.creditCardNumberBox.click();
        //creditCardNumberBox.sendKeys("4263982640269299");
        //creditCardExpiryDateBox.sendKeys("0226");
        //creditCardSecurityCodeBox.sendKeys("837");
        //paymentWithLoginButton.click();
    }

}

