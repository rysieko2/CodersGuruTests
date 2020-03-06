package codersguru.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class MentorPage {
    private WebDriver driver;

    public MentorPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="button")
    private List<WebElement> mentorButtonList;

    @FindBy(xpath="//*[@id='dateSelect']/ul/li[1]")
    private WebElement firstDateElement;

    @FindBy(xpath="//*[@id='hourSelect']/ul/li[1]")
    private WebElement firstHourElement;

    @FindBy(className="reservation__modal-textarea")
    private WebElement textBoxElement;

    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[2]/div[3]/a/button")
    private WebElement bookMentorButton;

    public void selectMentorNumber(int number){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mentorButtonList.get(number).click();
    }

    public void selectFirstDateAndHour(String message) {
        firstDateElement.click();
        firstHourElement.click();
        textBoxElement.sendKeys(message);
        bookMentorButton.click();
    }
}