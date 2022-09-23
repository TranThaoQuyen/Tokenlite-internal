package pageobjects.cryptoadvisory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OnfidoPage extends BasePageCryptoadvisory{

    @FindBy(how = How.CSS, using = ".onfido-sdk-ui-Theme-actionsContainer button")
    private WebElement onfidoProceedBtn;

    @FindBy(how = How.CSS, using = ".onfido-sdk-ui-crossDevice-Intro-buttonContainer button")
    private WebElement getSecureLink;

    @FindBy(how = How.CSS, using = ".onfido-sdk-ui-QRCode-qrCodeHelp button")
    private WebElement howToScanAQRCode;

    @FindBy(how = How.CSS, using = ".onfido-sdk-ui-crossDevice-CrossDeviceLink-viewOptionsGroup a:first-child")
    private WebElement getLinkViaSMS;

    @FindBy(how = How.CSS, using = ".onfido-sdk-ui-crossDevice-CrossDeviceLink-viewOptionsGroup a:nth-of-type(2)")
    private WebElement copylink;

    private static final String PAGE_URL = "/onfido-ident";

    public OnfidoPage() {
        super();
        this.pageUrlCryptoadvisory = PAGE_URL;
    }

    public void login(String email, String password) {
        this.emailField.clear();
        this.emailField.sendKeys(email);
        this.passwordField.clear();
        this.passwordField.sendKeys(password);
        this.signInBtn.click();
    }
}
