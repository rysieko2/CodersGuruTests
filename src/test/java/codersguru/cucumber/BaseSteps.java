package codersguru.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class BaseSteps {
    static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resource/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() {
         driver.quit();
    }
}