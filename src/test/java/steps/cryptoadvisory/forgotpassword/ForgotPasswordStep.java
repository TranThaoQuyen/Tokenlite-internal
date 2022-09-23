package steps.cryptoadvisory.forgotpassword;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobjects.cryptoadvisory.DashBoardCryptoadvisory;
import pageobjects.cryptoadvisory.ForgotPasswordPage;
import pageobjects.cryptoadvisory.LoginPageCryptoadvisory;


@RunWith(Cucumber.class)
public class ForgotPasswordStep {

    private ForgotPasswordPage forgotPasswordPage;
    LoginPageCryptoadvisory loginPage;

    @Before("@ForgotPassword")
    public void setup() {
        this.loginPage = new LoginPageCryptoadvisory();
        this.forgotPasswordPage = new ForgotPasswordPage();
    }

    @Given("user is on login page")
    public void openPage() {
        this.loginPage.openCryptoadvisory();
    }

    @Given("user forgot password with {string} as credentials")
    public void enterCredential(String email) throws InterruptedException {
        this.forgotPasswordPage.forgotPassword(email);
        Thread.sleep(7000);
    }

    @Then("user is on dashboard page")
    public void isOnDashboardPage() {
        WebElement notiDescription = this.forgotPasswordPage.getNotiDescription();

        Assert.assertTrue(notiDescription.isDisplayed());
    }
}
