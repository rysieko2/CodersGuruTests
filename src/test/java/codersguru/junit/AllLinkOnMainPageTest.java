package codersguru.junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;


        // checking the correctness of link redirection
public class AllLinkOnMainPageTest {

    WebDriver driver;
    HttpURLConnection huc = null;
    int respCode = 200;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "src/test/resource/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testAllLinks() {
        driver.get("https://tester.codersguru.pl/");

        // save all links to the list
        List<String> links = new ArrayList<String>();
        List<WebElement> allLinkElements = driver.findElements(By.tagName("a"));    //

       // click and check if they redirect to an existing page
        for (WebElement e : allLinkElements) {
            String link = e.getAttribute("href");

            if (!link.startsWith("mailto:")) {
                links.add(link);
            }else {
                if (isValid(link.split(":")[1])) {
                    System.out.println("Mail is ok: " + link);
                } else {
                    System.out.println("Fail mail link: " + link);
                }
            }
        }

        for (String link : links) {

            // validates page loading
            // copy with: https://www.guru99.com/find-broken-links-selenium-webdriver.html
            try {
                huc = (HttpURLConnection) (new URL(link).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();

                if (respCode >= 300) {
                    System.out.println("Fail: " + link);
                } else {
                    System.out.println(link + " is a valid link");
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }


    // method with owasp
    // https://www.geeksforgeeks.org/check-email-address-valid-not-java/
    public static boolean isValid(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}