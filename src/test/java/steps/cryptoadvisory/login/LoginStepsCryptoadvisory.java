package steps.cryptoadvisory.login;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobjects.calidris.LoginPageCalidris;
import pageobjects.cryptoadvisory.DashBoardCryptoadvisory;
import pageobjects.cryptoadvisory.LoginPageCryptoadvisory;
import steps.BaseSteps;

@RunWith(Cucumber.class)
public class LoginStepsCryptoadvisory extends BaseSteps {

    private LoginPageCryptoadvisory loginPage;
    DashBoardCryptoadvisory dashBoardCryptoadvisory;

    @Before("@Login")
    public void setup() {
        this.loginPage = new LoginPageCryptoadvisory();
        this.dashBoardCryptoadvisory = new DashBoardCryptoadvisory();
    }

    @Given("user is on login page")
    public void openPage() {
        this.loginPage.openCryptoadvisory();
    }

    @Given("user logins with {string} and {string} as credentials")
    public void enterCredential(String email, String password) throws InterruptedException {
        this.loginPage.login(email, password);
        Thread.sleep(7000);
    }

    @Then("user is on dashboard page")
    public void isOnDashboardPage() {
        WebElement profileHeader = this.dashBoardCryptoadvisory.getHeaderElement();

        Assert.assertTrue(profileHeader.isDisplayed());
    }
}
