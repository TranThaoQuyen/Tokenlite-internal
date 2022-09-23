package pageobjects.cryptoadvisory;

import helpers.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.Properties;

public class BasePageCryptoadvisory {

    protected String pageUrlCryptoadvisory;
    protected WebDriver driver;
    private Properties config;

    public BasePageCryptoadvisory() {
        this.driver = BaseSteps.getDriver();
        this.config = Config.getConfig();
        PageFactory.initElements(this.driver, this);
    }

    protected String getAbsolutePath(String path) {
        return this.config.getProperty("app.pageURLCryptoadvisory") + path;
    }

    public void openCryptoadvisory() {
        this.driver.get(getAbsolutePath(pageUrlCryptoadvisory));
        this.driver.manage().window().maximize();
    }

    public Boolean isOnCryptoadvisoryPage(String path) {
        return this.driver.getCurrentUrl().equals(getAbsolutePath(path));
    }

    public void close() {
        this.driver.close();
    }
}
