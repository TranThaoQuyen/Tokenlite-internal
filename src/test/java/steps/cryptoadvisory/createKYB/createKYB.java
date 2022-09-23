package steps.cryptoadvisory.createKYB;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobjects.cryptoadvisory.DashBoardCryptoadvisory;
import pageobjects.cryptoadvisory.LoginPageCryptoadvisory;
import steps.BaseSteps;
import steps.cryptoadvisory.login.LoginStepsCryptoadvisory;

@RunWith(Cucumber.class)
public class createKYB extends BaseSteps {
    private LoginPageCryptoadvisory loginPageCryptoadvisory;

    DashBoardCryptoadvisory dashBoardCryptoadvisory;

    @Before("@CreateKYBCryptoadvisory")
    public void setup() {
        this.loginPageCryptoadvisory = new LoginPageCryptoadvisory();
        this.dashBoardCryptoadvisory = new DashBoardCryptoadvisory();
    }

    @Given("logged in Cryptoadvisory")
    public void openKYBPage() {
        this.loginPageCryptoadvisory.openCryptoadvisory();
    }

    @Given("user create KYB Cryptoadvisory with {string} and {string} and {string} and {string} and {string}  and {string} and {string} as credentials")
    public void createKYB(String companyName, String registerNumber, String placeOfCommercialRegister, String companyShareCapital, String companyPlace, String companyAddress, String companyPostalCode) throws InterruptedException {
        this.loginPageCryptoadvisory.login("kirk+uuser04@equanimity.sg", "123456789");
        Thread.sleep(2000);
        this.dashBoardCryptoadvisory.createKYB(companyName, registerNumber, placeOfCommercialRegister, companyShareCapital, companyPlace, companyAddress, companyPostalCode);
    }

    @Then("Cryptoadvisory show Thank you for your Submission")
    public void isThankYouHeader() {
        WebElement thankYouHeader = this.dashBoardCryptoadvisory.getSubmissionHeader();

        Assert.assertEquals(thankYouHeader.getText(),"Thank you for your Submission");
    }

    @And("Restore KYB")
    public void restoreTestData() throws InterruptedException {
        this.dashBoardCryptoadvisory.logOut();
        this.loginPageCryptoadvisory.login("kirk+aadmin02@equanimity.sg", "123456789");
        Thread.sleep(2000);
        this.dashBoardCryptoadvisory.restoreTestDataKYB();
    }
}
