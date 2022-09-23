package pageobjects.cryptoadvisory;

import helpers.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DashBoardCryptoadvisory extends BasePageCryptoadvisory{
    @FindBy(how = How.CSS, using = ".page__title.h3")
    private WebElement pageHeader;

    @FindBy(how = How.XPATH, using = "//a[@href ='/docs/configuration']")
    private WebElement KYCBtn;

    @FindBy(how = How.CSS, using = ".packages__group div:first-child .button.packages__button")
    private WebElement signUpKYCIndividual;

    @FindBy(how = How.CSS, using = ".packages__group div:nth-of-type(2) .button.packages__button")
    private WebElement signUpKYCCompany;

    @FindBy(how = How.CSS, using = "input[value='usd']")
    private WebElement radioBtnUSD;

    @FindBy(how = How.CSS, using = "input[value='usdc']")
    private WebElement radioBtnUSDC;

    @FindBy(how = How.CSS, using = ".button.settings__button")
    private WebElement nextBtn;

    @FindBy(how = How.CSS, using = ".settings__list div:nth-of-type(2) .settings__fieldset div div:nth-of-type(5) .field__wrap .field__input")
    private WebElement identificationNum;

    @FindBy(how = How.CSS, using = "input[id='date-picker-dialog']")
    private WebElement dateOfBirth;

    @FindBy(how = How.CSS, using = ".settings__list div:nth-of-type(5) .settings__fieldset div div:first-child .field__wrap .field__input")
    private WebElement placeOfBirth;

    @FindBy(how = How.CSS, using = ".settings__list div:nth-of-type(5) .settings__fieldset div div:nth-of-type(2) .MuiSelect-root.MuiSelect-select.MuiSelect-selectMenu.MuiSelect-outlined.MuiInputBase-input.MuiOutlinedInput-input")
    private WebElement nationality;

    @FindBy(how = How.CSS, using = ".//*[@role='listbox']/li")
    private WebElement listBoxNationality;

    @FindBy(how = How.CSS, using = ".settings__list div:nth-of-type(5) .settings__fieldset div div:nth-of-type(3) .MuiSelect-root.MuiSelect-select.MuiSelect-selectMenu.MuiSelect-outlined.MuiInputBase-input.MuiOutlinedInput-input")
    private WebElement countryOfResidential;

    @FindBy(how = How.CSS, using = ".//*[@role='listbox']/li")
    private WebElement listBoxCountryOfResidential;

    @FindBy(how = How.CSS, using = ".settings__list div:nth-of-type(5) .settings__fieldset div div:nth-of-type(4) .field__wrap .field__input")
    private WebElement residentialAddress;

    @FindBy(how = How.CSS, using = ".settings__list div:nth-of-type(5) .settings__fieldset div div:nth-of-type(5) .field__wrap .field__input")
    private WebElement city;

    @FindBy(how = How.CSS, using = ".settings__list div:nth-of-type(5) .settings__fieldset div div:nth-of-type(6) .field__wrap .field__input")
    private WebElement postalCode;

    @FindBy(how = How.CSS, using = "button[type='button'].button")
    private WebElement submitBtn;

    @FindBy(how = How.CSS, using = ".onfido-sdk-ui-PageTitle-titleSpan")
    private WebElement identityHeader;

    @FindBy(how = How.CSS, using = ".h3.entry__title")
    private WebElement submissionHeader;

    @FindBy(how = How.CSS, using = ".settings__list .settings__item .settings__fieldset div:first-child div:nth-of-type(2) div:nth-of-type(2) input[type='text'].field__input")
    private WebElement companyName;

    @FindBy(how = How.CSS, using = ".settings__list .settings__item .settings__fieldset div:nth-of-type(2) div:first-child input[type='text'].field__input")
    private WebElement registerNumber;

    @FindBy(how = How.CSS, using = ".MuiSelect-root.MuiSelect-select.MuiSelect-selectMenu.MuiSelect-outlined.MuiInputBase-input.MuiOutlinedInput-input")
    private WebElement legalForm;

    @FindBy(how = How.CSS, using = ".settings__list .settings__item .settings__fieldset div:nth-of-type(3) div:nth-of-type(3) input[type='text'].field__input")
    private WebElement placeOfCommercialRegister;

    @FindBy(how = How.CSS, using = ".settings__list .settings__item .settings__fieldset div:nth-of-type(3) div:nth-of-type(4) input[type='text'].field__input")
    private WebElement companyShareCapital;

    @FindBy(how = How.CSS, using = ".settings__list .settings__item .settings__fieldset div:nth-of-type(3) div:nth-of-type(5) input[type='text'].field__input")
    private WebElement companyPlace;

    @FindBy(how = How.CSS, using = ".settings__list .settings__item .settings__fieldset div:nth-of-type(3) div:nth-of-type(6) input[type='text'].field__input")
    private WebElement companyAddress;

    @FindBy(how = How.CSS, using = ".settings__list .settings__item .settings__fieldset div:nth-of-type(3) div:nth-of-type(7) .MuiSelect-root.MuiSelect-select.MuiSelect-selectMenu.MuiInputBase-input.MuiInput-input")
    private WebElement companyCountry;

    @FindBy(how = How.CSS, using = ".settings__list .settings__item .settings__fieldset div:nth-of-type(3) div:nth-of-type(8) input[type='text'].field__input")
    private WebElement companyPostalCode;

    @FindBy(how = How.CSS, using = "div.file__wrap.flex__column input")
    private WebElement uploadBtn;

    @FindBy(how = How.CSS, using = ".settings__button.settings__buttons.d__flex.flex__row.flex__wrap.flex__justify_between button.button")
    private WebElement nextBtnKYB;

    @FindBy(how = How.CSS, using = ".settings__list div:first-child .settings__fieldset label.switch .switch__inner .switch__box")
    private WebElement authorizedSwitchBtn;

    @FindBy(how = How.CSS, using = ".settings__list div:nth-of-type(2) div:nth-of-type(2) label.switch .switch__inner .switch__box")
    private WebElement beneficialOwnershipSwitchBtn;

    @FindBy(how = How.CSS, using = ".settings__button.settings__buttons.d__flex.flex__row.flex__wrap.flex__justify_between button.button")
    private WebElement submitToVerifyBtn;

    @FindBy(how = How.CSS, using = ".title-primary.settings__title")
    private WebElement authorizedScreen;

    @FindBy(how = How.CSS, using = ".actions.actions__kyc")
    private WebElement actionBtn;

    @FindBy(how = How.CSS, using = ".actions__body button:nth-of-type(2)")
    private WebElement deleteKYC;

    @FindBy(how = How.CSS, using = ".button.button-danger")
    private WebElement deleteBtn;

    @FindBy(how = How.CSS, using = ".header__item.header__item_user .header__head")
    private WebElement profileIcon;

    @FindBy(how = How.CSS, using = ".header__body div:nth-of-type(4) a")
    private WebElement logoutBtn;

    private static final String PAGE_URL = "";

    public DashBoardCryptoadvisory() {
        super();
        this.pageUrlCryptoadvisory = PAGE_URL;
    }

    public WebElement getHeaderElement() {
        return this.pageHeader;
    }

    public WebElement getSubmissionHeader() {
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.textToBePresentInElement(this.submissionHeader,"Thank you for your Submission"));
        return this.submissionHeader;
    }

    public WebElement getIdentityHeader() {
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.textToBePresentInElement(this.identityHeader,"Please verify your identity."));
        return this.identityHeader;
    }

    public void createKYCIndividual(String identificationNum, String dateOfBirth, String placeOfBirth, String residentialAddress, String city, String postalCode ) throws InterruptedException {
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.visibilityOf(this.pageHeader));
        driver.get("https://dev-kyc.cryptoadvisory.li/application");
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.visibilityOf(this.signUpKYCIndividual));
        this.signUpKYCIndividual.click();
        this.radioBtnUSD.click();
        Thread.sleep(2000);
        this.nextBtn.click();
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.visibilityOf(this.identificationNum));
        Thread.sleep(2000);
        this.identificationNum.sendKeys(identificationNum);
        Thread.sleep(2000);
        this.dateOfBirth.sendKeys(dateOfBirth);
        Thread.sleep(2000);
        this.placeOfBirth.sendKeys(placeOfBirth);
        Thread.sleep(2000);
        this.nationality.click();
        Thread.sleep(2000);
        List<WebElement> listOfNationality = driver.findElements(By.xpath(".//*[@role='listbox']/li"));
        for (WebElement webElement: listOfNationality) {
            if (webElement.getText().trim().equals("Afghanistan")){
                webElement.click();
                break;
            }
        }
        Thread.sleep(2000);
        this.countryOfResidential.click();
        Thread.sleep(2000);
        List<WebElement> listOfCountry = driver.findElements(By.xpath(".//*[@role='listbox']/li"));
        for (WebElement webElement: listOfCountry) {
            if (webElement.getText().trim().equals("Afghanistan")){
                webElement.click();
                break;
            }
        }
        Thread.sleep(2000);
        this.residentialAddress.sendKeys(residentialAddress);
        Thread.sleep(2000);
        this.city.sendKeys(city);
        Thread.sleep(2000);
        this.postalCode.sendKeys(postalCode);
        Thread.sleep(2000);
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.elementToBeClickable(this.submitBtn));
        this.submitBtn.click();
        Thread.sleep(4000);
    }

    public void createKYB(String companyName, String registerNumber, String placeOfCommercialRegister, String companyShareCapital, String companyPlace, String companyAddress, String companyPostalCode ) throws InterruptedException {
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.visibilityOf(this.pageHeader));
        driver.get("https://dev-kyc.cryptoadvisory.li/application");
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.visibilityOf(this.signUpKYCCompany));
        this.signUpKYCCompany.click();
        this.companyName.sendKeys(companyName);
        this.registerNumber.sendKeys(registerNumber);
        this.legalForm.click();
        List<WebElement> listOfLegal = driver.findElements(By.xpath(".//*[@role='listbox']/li"));
        for (WebElement webElement: listOfLegal) {
            if (webElement.getText().trim().equals("Limited Liability Company (ex. GmbH)")){
                webElement.click();
                break;
            }
        }
        this.placeOfCommercialRegister.sendKeys(placeOfCommercialRegister);
        this.companyShareCapital.sendKeys(companyShareCapital);
        this.companyPlace.sendKeys(companyPlace);
        this.companyAddress.sendKeys(companyAddress);
        this.companyCountry.click();
        List<WebElement> listOfCountry = driver.findElements(By.xpath(".//*[@role='listbox']/li"));
        for (WebElement webElement: listOfCountry) {
            if (webElement.getText().trim().equals("India")){
                webElement.click();
                break;
            }
        }
        this.companyPostalCode.sendKeys(companyPostalCode);
        if(!driver.findElements(By.cssSelector("div.file__wrap.flex__column input")).isEmpty()){
            this.uploadBtn.sendKeys(System.getProperty("user.dir") + "/src/test/resources/testdatafile/dummy.pdf");
        }
        this.radioBtnUSD.click();
        this.nextBtnKYB.click();
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.visibilityOf(this.authorizedScreen));
        this.nextBtnKYB.click();
        this.authorizedSwitchBtn.click();
        Thread.sleep(2000);
        this.beneficialOwnershipSwitchBtn.click();
        Thread.sleep(2000);
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.elementToBeClickable(this.submitToVerifyBtn));
        this.submitToVerifyBtn.click();
    }

    public void restoreTestDataKYC() throws InterruptedException {
        driver.get("https://dev-kyc.cryptoadvisory.li/admin/kyc-list/individual");
        List<WebElement> listOfTransaction = driver.findElements(By.cssSelector(".transactions__row"));
        for (WebElement webElement: listOfTransaction) {
            List<WebElement> listOfEmail = driver.findElements(By.cssSelector(".transactions__col.vert__middle .shorten__text.v2"));
            for (WebElement webElement2: listOfEmail){
                if (webElement2.getText().trim().equals("kirk+uuser01@equanimity.sg")){
                    actionBtn.click();
                    Thread.sleep(2000);
                    deleteKYC.click();
                    Thread.sleep(2000);
                    deleteBtn.click();
                    Thread.sleep(2000);
                    break;
                }
                break;
            }
            break;
        }
    }

    public void restoreTestDataKYB() throws InterruptedException {
        driver.get("https://dev-kyc.cryptoadvisory.li/admin/kyc-list/company");
        List<WebElement> listOfTransaction = driver.findElements(By.cssSelector(".transactions__row"));
        for (WebElement webElement: listOfTransaction) {
            List<WebElement> listOfEmail = driver.findElements(By.cssSelector(".transactions__col.vert__middle .shorten__text.v2"));
            for (WebElement webElement2: listOfEmail){
                if (webElement2.getText().trim().equals("kirk+uuser04@equanimity.sg")){
                    actionBtn.click();
                    Thread.sleep(2000);
                    deleteKYC.click();
                    Thread.sleep(2000);
                    deleteBtn.click();
                    Thread.sleep(2000);
                    break;
                }
                break;
            }
            break;
        }
    }

    public void logOut(){
        this.profileIcon.click();
        this.logoutBtn.click();
    }
}
