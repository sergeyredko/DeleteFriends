package autotesting.screen;

import autotesting.utils.WebDriverRunner;
import autotesting.utils.WebDriverWrapper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BaseScreen {
    protected WebDriverWrapper driver = new WebDriverRunner().getDriver();
    protected static final Logger log = Logger.getLogger(WebDriver.class);
}
