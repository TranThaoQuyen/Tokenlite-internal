package pageobjects.cryptoadvisory;

import helpers.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotPasswordPage extends BasePageCryptoadvisory{

    @FindBy(how = How.CSS, using = "input[type='email']")
    private WebElement emailField;

    @FindBy(how = How.CSS, using = "input[type='password']")
    private WebElement passwordField;

    @FindBy(how = How.CSS, using = ".button.entry__button")
    private WebElement sendResetLink;

    @FindBy(how = How.XPATH, using = "//a[@href ='/password/restore']")
    private WebElement forgotPassword;

    @FindBy(how = How.CSS, using = ".entry__note")
    private WebElement notiDescription;

    private static final String PAGE_URL = "/password/restore";

    public ForgotPasswordPage() {
        super();
        this.pageUrlCryptoadvisory = PAGE_URL;
    }

    public WebElement getNotiDescription() {
        new WebDriverWait(this.driver, Duration.ofMillis(Long.parseLong(Config.getConfig().getProperty("app.timeout"))))
                .until(ExpectedConditions.textToBePresentInElement(this.notiDescription,"Password reset link sent. Please check your mail!"));
        return this.notiDescription;
    }

    public void forgotPassword(String email) {
        this.forgotPassword.click();
        this.emailField.clear();
        this.emailField.sendKeys(email);
        this.passwordField.clear();
    }
}
