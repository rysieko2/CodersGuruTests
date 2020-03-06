package codersguru.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class PayuPage extends BasePage{
    WebDriver driver;

    public PayuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        }

    @FindBy(xpath="//article")
    private WebElement choosePay;

    @FindBy(xpath="//article/div/a[2]")
    private WebElement paymentCard;



    @FindBy(name="number")
    private WebElement cardNumber;

    @FindBy(name="date")
    private WebElement validThru;

    @FindBy(name="cvv")
    private WebElement cvv;

    @FindBy(name="name")
    private WebElement nameAndSurname;

    @FindBy(name="email")
    private WebElement emailAddress;

    @FindBy(name="submit")
    private WebElement buttonPay;

    @FindBy(css=".invalid")
    private WebElement invalidEnterCardDetails;


    public Boolean validPayuSite(){
        return choosePay.isDisplayed();
    }

    public void enterPaymentCardDetailes() throws IOException {
        paymentCard.click();
        cardNumber.sendKeys("1234567897891052004");
        validThru.sendKeys("10/19");
        cvv.sendKeys("454");
        nameAndSurname.sendKeys("Killer Killer");
        emailAddress.sendKeys("kordecki@kordecki.pl");
        buttonPay.click();
        takeScreenshot(driver,  "bookingVisiteSelectedMentor");
    }

    public Boolean validInvalidEnterCardDetails(){
        return invalidEnterCardDetails.isDisplayed();
    }
}