package codersguru.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class HomePage extends BasePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    private WebElement emailTextBox;

    @FindBy(xpath = "/html/body/section[1]/div/div[1]/a/img")
    private WebElement homePageLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[1]/a")
    private WebElement jakToDzialaLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[2]/a")
    private WebElement cennikLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[3]/a")
    private WebElement zostanMentoremLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[3]/a/button")
    private WebElement loginLink;

    @FindBy(xpath = "/html/body/section[3]/div/form/input[2]")
    private WebElement accountLink;

    @FindBy(xpath = "/html/body/footer/div/div[1]/a[1]")
    private WebElement rulesLink;

    @FindBy(xpath = "/html/body/footer/div/div[1]/a[2]")
    private WebElement howItWorksLink;

    @FindBy(xpath = "/html/body/footer/div/div[2]/a")
    private WebElement facebookLink;

    @FindBy(xpath = "/html/body/footer/div/legal/a")
    private WebElement codersLabLink;

    @FindBy(className = "main-page-top__select")
    private WebElement topicDropdown;

    @FindBy(xpath = "/html/body/section[3]/div/div[1]/input")
    private WebElement findMentorButton;

    public void selectTopic(String topic) throws IOException {
        topicDropdown.click();
        topicDropdown.findElement(By.xpath("./ul/li[contains(text(),'" + topic + "')]")).click();
        takeScreenshot(driver, "Topic" + topic + "IsSelected");
  /*
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            takeScreenshot(driver, topic);
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        findMentorButton.click();
    }

    public List<String> allWebsiteTitles() {
        WebElement[] allLinks = {
                emailTextBox,
                homePageLink,
                jakToDzialaLink,
                cennikLink,
                //zostanMentoremLink,
                loginLink,
                accountLink,
                rulesLink,
                howItWorksLink};
        //facebookLink};

        List<String> titles = new ArrayList<String>();

        for (WebElement e : allLinks) {
            e.click();
            titles.add(driver.getTitle());
            driver.navigate().back();
        }

        return titles;
    }
}