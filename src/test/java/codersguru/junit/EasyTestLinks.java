package codersguru.junit;

import codersguru.pages.HomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EasyTestLinks {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resource/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://tester.codersguru.pl/");
    }

    @Test
    public void allLinkValidationTest() throws IOException {
        HomePage home = new HomePage(driver);
        List<String> titles = home.allWebsiteTitles();

        for (String title : titles) {
                 Assert.assertTrue(title.contains("Coders"));
        }
        driver.close();
    }
}