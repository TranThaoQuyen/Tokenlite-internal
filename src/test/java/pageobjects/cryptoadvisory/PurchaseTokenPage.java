package pageobjects.cryptoadvisory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PurchaseTokenPage extends BasePageCryptoadvisory{

    @FindBy(how = How.XPATH, using = "//a[@href ='/contribute']")
    private WebElement purchaseTab;

    @FindBy(how = How.CSS, using = "input[value='usd']")
    private WebElement radioUSD;

    @FindBy(how = How.CSS, using = "input[value='usdc']")
    private WebElement radioUSDC;

    @FindBy(how = How.ID, using = "token-base-amount")
    private WebElement tokenBaseAmount;

    @FindBy(how = How.CSS, using = ".button.panel__button")
    private WebElement choosePaymentMethod;

    @FindBy(how = How.CSS, using = "input[value='BANK_TRANSFER']")
    private WebElement bankTransfer;

    @FindBy(how = How.CSS, using = "input[value='STRIPE']")
    private WebElement stripe;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(2) .switch__box")
    private WebElement toggle1;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(3) .switch__box")
    private WebElement toggle1;

    @FindBy(how = How.CSS, using = ".settings__fieldset div:nth-of-type(4) .switch__box")
    private WebElement toggle1;

    private static final String PAGE_URL = "/contribute";

    public PurchaseTokenPage() {
        super();
        this.pageUrlCryptoadvisory = PAGE_URL;
    }

    public void login(String email, String password) {

    }
}
