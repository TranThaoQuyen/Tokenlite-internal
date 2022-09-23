package steps.calidris.login;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobjects.calidris.LoginPageCalidris;
import pageobjects.calidris.DashboardPageCalidris;
import steps.BaseSteps;

@RunWith(Cucumber.class)
public class LoginSteps extends BaseSteps {
    private LoginPageCalidris loginPage;
    DashboardPageCalidris dashboardPage;

    @Before("@LoginCalidris")
    public void setup() {
        this.loginPage = new LoginPageCalidris();
        this.dashboardPage = new DashboardPageCalidris();
    }

    @Given("user is on login Calidris page")
    public void openPage() {
        this.loginPage.open();
    }

    @Given("user logins Calidris with {string} and {string} as credentials")
    public void enterCredential(String email, String password) throws InterruptedException {
        this.loginPage.login(email, password);
        Thread.sleep(7000);
    }

    @Then("user is on dashboard Calidris page")
    public void isOnDashboardPage() {
        WebElement calidrisIcon = this.dashboardPage.getCalidrisIcon();

        Assert.assertTrue(calidrisIcon.isDisplayed());
    }
}
