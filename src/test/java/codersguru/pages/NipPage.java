package codersguru.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static codersguru.pages.BasePage.takeScreenshot;

public class NipPage {
    private WebDriver driver;

    public NipPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String nipWebside() throws IOException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://generatory.it");
        String nip = driver.findElement(By.id("nipBox")).getText();
        takeScreenshot(driver, "WebsideWithNip");
        driver.close();
        return (nip);
    }
}
