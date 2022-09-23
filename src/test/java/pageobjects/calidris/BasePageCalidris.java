package pageobjects.calidris;

import helpers.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.Properties;

public class BasePageCalidris {
    protected String pageUrl;
    protected WebDriver driver;
    private Properties config;

    public BasePageCalidris() {
        this.driver = BaseSteps.getDriver();
        this.config = Config.getConfig();
        PageFactory.initElements(this.driver, this);
    }

    protected String getAbsolutePath(String path) {
        return this.config.getProperty("app.pageURL") + path;
    }

    public void open() {
        this.driver.get(getAbsolutePath(pageUrl));
        this.driver.manage().window().maximize();
    }

    public Boolean isOnPage(String path) {
        return this.driver.getCurrentUrl().equals(getAbsolutePath(path));
    }

    public void close() {
        this.driver.close();
    }
}
