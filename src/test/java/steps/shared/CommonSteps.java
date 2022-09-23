package steps.shared;

import io.cucumber.java.After;
import steps.BaseSteps;

public class CommonSteps extends BaseSteps {
    @After
    public void close() {
        BaseSteps.quit();
    }
}
