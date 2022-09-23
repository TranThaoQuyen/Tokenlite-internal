package steps.calidris.createKYB;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
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
public class CreateKYB extends BaseSteps{
    private LoginPageCalidris loginPage;
    DashboardPageCalidris dashboardPage;

    @Before("@CreateKYBCalidris")
    public void setup() {
        this.loginPage = new LoginPageCalidris();
        this.dashboardPage = new DashboardPageCalidris();
    }

    @Given("logged in Calidris")
    public void openPage() {
        this.loginPage.open();
    }

    @Given("user create KYB Calidris with {string} and {string} and {string} and {string} and {string}  and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} as credentials")
    public void createKYB(String companyName, String companyRegisterNumber, String placeOfCommercialRegister, String companyShareCapital, String companyPlace, String companyAddress, String companyPostalCode, String companyCountry, String incomeOfTheCompany, String descriptionRegister, String investmentPurpose, String token, String receivingWalletAddress) throws InterruptedException {
        this.loginPage.login("hendrix+user01@equanimity.sg", "123456789");
        Thread.sleep(2000);
        this.dashboardPage.createKYB(companyName, companyRegisterNumber, placeOfCommercialRegister, companyShareCapital, companyPlace, companyAddress, companyPostalCode, companyCountry, incomeOfTheCompany, descriptionRegister, investmentPurpose, token, receivingWalletAddress);
    }

    @Then("Calidris show Thank you for your Submission")
    public void isThankYouHeader() {
        WebElement thankYouHeader = this.dashboardPage.getSubmissionHeader();

        Assert.assertEquals(thankYouHeader.getText(),"Thank you for your Submission");
    }

    @And("Restore KYB Calidris")
    public void restoreTestData() throws InterruptedException {
        this.dashboardPage.logOut();
        this.loginPage.login("kirk+aadmin02@equanimity.sg", "123456789");
        Thread.sleep(2000);
        this.dashboardPage.restoreTestDataKYB();
    }
}