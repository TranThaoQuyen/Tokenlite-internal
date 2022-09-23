package pageobjects.cryptoadvisory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageCryptoadvisory extends BasePageCryptoadvisory{

    @FindBy(how = How.CSS, using = "input[type='email']")
    private WebElement emailField;

    @FindBy(how = How.CSS, using = "input[type='password']")
    private WebElement passwordField;

    @FindBy(how = How.CSS, using = "button[type='button'].button.entry__button")
    private WebElement signInBtn;

    @FindBy(how = How.XPATH, using = "//a[@href ='/password/restore']")
    private WebElement forgotPassword;

    private static final String PAGE_URL = "/login";

    public LoginPageCryptoadvisory() {
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
