package steps.cryptoadvisory.createKYC;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobjects.cryptoadvisory.DashBoardCryptoadvisory;
import pageobjects.cryptoadvisory.LoginPageCryptoadvisory;
import steps.BaseSteps;

@RunWith(Cucumber.class)
public class createKYC extends BaseSteps {
    private LoginPageCryptoadvisory loginPageCryptoadvisory;

    DashBoardCryptoadvisory dashBoardCryptoadvisory;

    @Before("@CreateKYCIndividualCryptoadvisory")
    public void setup() {
        this.loginPageCryptoadvisory = new LoginPageCryptoadvisory();
        this.dashBoardCryptoadvisory = new DashBoardCryptoadvisory();
    }

    @Given("user logged in Cryptoadvisory")
    public void openKYCPage() {
        this.loginPageCryptoadvisory.openCryptoadvisory();
    }

    @Given("user create KYC Cryptoadvisory with {string} and {string} and {string} and {string} and {string} and {string} as credentials")
    public void enterCredential(String identificationNum, String dateOfBirth, String placeOfBirth, String residentialAddress, String city, String postalCode) throws InterruptedException {
        this.loginPageCryptoadvisory.login("kirk+uuser01@equanimity.sg", "123456789");
        Thread.sleep(2000);
        this.dashBoardCryptoadvisory.createKYCIndividual(identificationNum, dateOfBirth, placeOfBirth,residentialAddress, city,postalCode);
    }

    @Then("Cryptoadvisory show submission header")
    public void isShowIdentityHeader() {
        WebElement identityHeader = this.dashBoardCryptoadvisory.getIdentityHeader();
        Assert.assertEquals(identityHeader.getText(),"Please verify your identity.");
    }

    @And("Restore KYC")
    public void restoreTestData() throws InterruptedException {
        this.dashBoardCryptoadvisory.logOut();
        this.loginPageCryptoadvisory.login("kirk+aadmin02@equanimity.sg", "123456789");
        Thread.sleep(2000);
        this.dashBoardCryptoadvisory.restoreTestDataKYC();
    }
}
