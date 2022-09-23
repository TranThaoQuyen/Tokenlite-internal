package pageobjects.calidris;

import helpers.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DashboardPageCalidris extends BasePageCalidris {

    @FindBy(how = How.CSS, using = ".page__title.h3")
    private WebElement pageHeader;

    @FindBy(how = How.CSS, using = ".h2.entry__title")
    private WebElement KYCApplication;

    @FindBy(how = How.CSS, using = ".login__preview")
    private WebElement calidrisImage;

    @FindBy(how = How.XPATH, using = "//a[@href ='/docs/configuration']")
    private WebElement KYCBtn;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(2) div:nth-of-type(2) input.field__input")
    private WebElement companyName;

    @FindBy(how = How.CSS, using = "input[value='FORM_T']")
    private WebElement radioFormT;

    @FindBy(how = How.CSS, using = "input[value='FORM_C']")
    private WebElement radioFormC;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(4) div:nth-of-type(2) input.field__input")
    private WebElement companyRegisterNumber;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(5) div:nth-of-type(2) .MuiSelect-root.MuiSelect-select.MuiSelect-selectMenu.MuiSelect-outlined.MuiInputBase-input.MuiOutlinedInput-input")
    private WebElement legalForm;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(8) div:nth-of-type(2) input.field__input")
    private WebElement placeOfCommercialRegister;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(9) div:nth-of-type(2) input.field__input")
    private WebElement companyShareCapital;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(10) div:nth-of-type(2) input.field__input")
    private WebElement companyPlace;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(11) div:nth-of-type(2) input.field__input")
    private WebElement companyAddress;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(12) div:nth-of-type(2) .MuiSelect-root.MuiSelect-select.MuiSelect-selectMenu.MuiSelect-outlined.MuiInputBase-input.MuiOutlinedInput-input")
    private WebElement companyCountry;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(13) div:nth-of-type(2) input.field__input")
    private WebElement companyPostalCode;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(14) div:nth-of-type(2) textarea:first-child")
    private WebElement descriptionRegister;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(15) div:nth-of-type(2) textarea:first-child")
    private WebElement incomeOfTheCompany;

    @FindBy(how = How.CSS, using = "input[value='true']")
    private WebElement radioYes;

    @FindBy(how = How.CSS, using = "input[value='false']")
    private WebElement radioNo;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(18) div:nth-of-type(2) input.field__input")
    private WebElement investmentPurpose;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(19) div:nth-of-type(2) input")
    private WebElement commercialRegisterExtractFile;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(20) div:nth-of-type(2) input")
    private WebElement chartOfTheCompanyFile;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(21) div:nth-of-type(2) input")
    private WebElement articlesOfAssociationFile;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(22) div:nth-of-type(2) input")
    private WebElement lastBalanceSheetAvailableFile;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(23) div:nth-of-type(2) input")
    private WebElement certificateOfGoodStandingFile;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(24) div:nth-of-type(2) input")
    private WebElement shareholderListFile;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(26) div:nth-of-type(2) input.field__input")
    private WebElement token;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(28) div:nth-of-type(2) .MuiSelect-root.MuiSelect-select.MuiSelect-selectMenu.MuiSelect-outlined.MuiInputBase-input.MuiOutlinedInput-input")
    private WebElement wallet;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(29) div:nth-of-type(2) input.field__input")
    private WebElement receivingWalletAddress;

    @FindBy(how = How.CSS, using = "button.button")
    private WebElement continueBtn;

    @FindBy(how = How.CSS, using = ".MuiSelect-root.MuiSelect-select.MuiSelect-selectMenu.MuiSelect-outlined.MuiInputBase-input.MuiOutlinedInput-input")
    private WebElement selectDirector;

    @FindBy(how = How.CSS, using = "input.file__input")
    private WebElement uploadDirectorFile;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(2) div:nth-of-type(2) div div .switch__box")
    private WebElement acknowledgementOfReceiptsSwitchBtn;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(3) div:nth-of-type(2) div div .switch__box")
    private WebElement clientStatementSwitchBtn;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(4) div:nth-of-type(2) div div:first-child .switch__box")
    private WebElement declarationOfConsentSwitchBtn1;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(4) div:nth-of-type(2) div div:nth-of-type(2) .switch__box")
    private WebElement declarationOfConsentSwitchBtn2;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(4) div:nth-of-type(2) div div:nth-of-type(3) .switch__box")
    private WebElement declarationOfConsentSwitchBtn3;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(5) div:nth-of-type(2) div div .switch__box")
    private WebElement confirmationsSwitchBtn;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(6) div:nth-of-type(2) div div .switch__box")
    private WebElement declarationOfConsent2SwitchBtn1;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(6) div:nth-of-type(3) div div .switch__box")
    private WebElement declarationOfConsent2SwitchBtn2;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(6) div:nth-of-type(5) div div .switch__box")
    private WebElement declarationOfConsent2SwitchBtn3;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(6) div:nth-of-type(6) div div .switch__box")
    private WebElement declarationOfConsent2SwitchBtn4;

    @FindBy(how = How.CSS, using = ".page__title.h3")
    private WebElement companyDetailPageHeader;

    @FindBy(how = How.CSS, using = ".card__head.card__head-kyc-1 .title-primary.card__title")
    private WebElement pageSubHeader;

    @FindBy(how = How.CSS, using = ".h3.entry__title")
    private WebElement submissionHeader;

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

    public DashboardPageCalidris() {
        super();
        this.pageUrl = PAGE_URL;
    }

    public WebElement getHeaderElement() {
        return this.pageHeader;
    }

    public WebElement getKYCApplication() {
        return this.KYCApplication;
    }

    public WebElement getCalidrisIcon() {
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.visibilityOf(this.calidrisImage));
        return this.calidrisImage;
    }

    public WebElement getSubmissionHeader() {
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.textToBePresentInElement(this.submissionHeader, "Thank you for your Submission"));
        return this.submissionHeader;
    }

    public void createKYB(String companyName, String companyRegisterNumber, String placeOfCommercialRegister, String companyShareCapital, String companyPlace, String companyAddress, String companyPostalCode, String companyCountry, String incomeOfTheCompany, String descriptionRegister, String investmentPurpose, String token, String receivingWalletAddress) throws InterruptedException {
        this.driver.get("https://dev-kyc.calidrisfintech.com/easy-onboarding-company");
        this.companyName.sendKeys(companyName);
        Thread.sleep(2000);
        this.radioFormC.click();
        Thread.sleep(2000);
        this.companyRegisterNumber.sendKeys(companyRegisterNumber);
        Thread.sleep(2000);
        this.legalForm.click();
        Thread.sleep(2000);
        List<WebElement> listOfLegal = driver.findElements(By.xpath(".//*[@role='listbox']/li"));
        for (WebElement webElement : listOfLegal) {
            if (webElement.getText().trim().equals("Limited Liability Company (ex. GmbH)")) {
                webElement.click();
                break;
            }
        }
        this.placeOfCommercialRegister.sendKeys(placeOfCommercialRegister);
        Thread.sleep(2000);
        this.companyShareCapital.sendKeys(companyShareCapital);
        Thread.sleep(2000);
        this.companyPlace.sendKeys(companyPlace);
        Thread.sleep(2000);
        this.companyAddress.sendKeys(companyAddress);
        Thread.sleep(2000);
        this.companyCountry.click();
        Thread.sleep(2000);
        List<WebElement> listOfCountry = driver.findElements(By.xpath(".//*[@role='listbox']/li"));
        for (WebElement webElement : listOfCountry) {
            if (webElement.getText().trim().equals("Albania")) {
                webElement.click();
                break;
            }
        }
        this.companyPostalCode.sendKeys(companyPostalCode);
        Thread.sleep(2000);
        this.descriptionRegister.sendKeys(descriptionRegister);
        Thread.sleep(2000);
        this.incomeOfTheCompany.sendKeys(incomeOfTheCompany);
        Thread.sleep(2000);
        this.investmentPurpose.sendKeys(investmentPurpose);
        Thread.sleep(2000);
        this.commercialRegisterExtractFile.sendKeys(System.getProperty("user.dir") + "/src/test/resources/testdatafile/dummy.pdf");
        Thread.sleep(2000);
        this.chartOfTheCompanyFile.sendKeys(System.getProperty("user.dir") + "/src/test/resources/testdatafile/dummy.pdf");
        Thread.sleep(2000);
        this.articlesOfAssociationFile.sendKeys(System.getProperty("user.dir") + "/src/test/resources/testdatafile/dummy.pdf");
        Thread.sleep(2000);
        this.lastBalanceSheetAvailableFile.sendKeys(System.getProperty("user.dir") + "/src/test/resources/testdatafile/dummy.pdf");
        Thread.sleep(2000);
        this.certificateOfGoodStandingFile.sendKeys(System.getProperty("user.dir") + "/src/test/resources/testdatafile/dummy.pdf");
        Thread.sleep(2000);
        this.shareholderListFile.sendKeys(System.getProperty("user.dir") + "/src/test/resources/testdatafile/dummy.pdf");
        Thread.sleep(2000);
        this.token.sendKeys(token);
        Thread.sleep(2000);
        this.wallet.click();
        Thread.sleep(2000);
        List<WebElement> listOfWallet = driver.findElements(By.xpath(".//*[@role='listbox']/li"));
        for (WebElement webElement : listOfWallet) {
            if (webElement.getText().trim().equals("Polygon")) {
                webElement.click();
                break;
            }
        }
        this.receivingWalletAddress.clear();
        this.receivingWalletAddress.sendKeys(receivingWalletAddress);
        Thread.sleep(2000);
        this.continueBtn.click();
        Thread.sleep(2000);
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.textToBePresentInElement(this.pageSubHeader,"Add authorized signatories"));
        this.continueBtn.click();
        Thread.sleep(2000);
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.textToBePresentInElement(this.pageSubHeader,"UBOs"));
        this.selectDirector.click();
        Thread.sleep(2000);
        List<WebElement> listOfDirector = driver.findElements(By.xpath(".//*[@role='listbox']/li"));
        for (WebElement webElement : listOfDirector) {
            if (webElement.getText().trim().equals("user user")) {
                webElement.click();
                break;
            }
        }
        this.uploadDirectorFile.sendKeys(System.getProperty("user.dir") + "/src/test/resources/testdatafile/dummy.pdf");
        Thread.sleep(2000);
        this.continueBtn.click();
        Thread.sleep(2000);
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.textToBePresentInElement(this.pageSubHeader,"Legal disclaimers"));
        Thread.sleep(2000);
        this.acknowledgementOfReceiptsSwitchBtn.click();
        Thread.sleep(2000);
        this.clientStatementSwitchBtn.click();
        Thread.sleep(2000);
        this.declarationOfConsentSwitchBtn1.click();
        Thread.sleep(2000);
        this.declarationOfConsentSwitchBtn2.click();
        Thread.sleep(2000);
        this.declarationOfConsentSwitchBtn3.click();
        Thread.sleep(2000);
        this.confirmationsSwitchBtn.click();
        Thread.sleep(2000);
        this.declarationOfConsent2SwitchBtn1.click();
        Thread.sleep(2000);
        this.declarationOfConsent2SwitchBtn2.click();
        Thread.sleep(2000);
        this.declarationOfConsent2SwitchBtn3.click();
        Thread.sleep(2000);
        this.declarationOfConsent2SwitchBtn4.click();
        Thread.sleep(2000);
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.elementToBeClickable(this.continueBtn));
        Thread.sleep(2000);
        this.continueBtn.click();
        Thread.sleep(2000);
    }

    public void restoreTestDataKYB() throws InterruptedException {
        driver.get("https://dev-kyc.calidrisfintech.com/admin/kyc-list/company");
        List<WebElement> listOfTransaction = driver.findElements(By.cssSelector(".transactions__row"));
        for (WebElement webElement: listOfTransaction) {
            List<WebElement> listOfEmail = driver.findElements(By.cssSelector(".transactions__col.vert__middle .shorten__text.v2"));
            for (WebElement webElement2: listOfEmail){
                if (webElement2.getText().trim().equals("hendrix+user01@equanimity.sg")){
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
