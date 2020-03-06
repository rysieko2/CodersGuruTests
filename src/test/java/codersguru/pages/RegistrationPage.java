package codersguru.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class RegistrationPage extends BasePage{
        WebDriver driver;

        public RegistrationPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(css=".main-page-top__email-input-sent")
        private WebElement registerNewUser;

        @FindBy(id="fos_user_registration_form_email")
        private WebElement emailTextBox;

        @FindBy(id="fos_user_registration_form_name")
        private WebElement nameTextBox;

        @FindBy(id="fos_user_registration_form_lastname")
        private WebElement lastnameTextBox;

        @FindBy(id="fos_user_registration_form_plainPassword_first")
        private WebElement passfirstTextBox;

        @FindBy(id="fos_user_registration_form_plainPassword_second")
        private WebElement passsecondTextBox;

        @FindBy(id="form_city")
        private WebElement citylTextBox;

        @FindBy(id="form_postal_code")
        private WebElement codeTextBox;

        @FindBy(id="form_street")
        private WebElement streetTextBox;

        @FindBy(id="form_number")
        private WebElement numberTextBox;

        @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[12]/input")
        private WebElement regulaminCheeckBox;

        @FindBy(id="register-submit-btn")
        private WebElement registerClickButton;

        @FindBy(id="user-name")
        private WebElement userIsRegistred;

        //Company
        @FindBy(id="fos_user_registration_form_company_name")
        private WebElement companyTextBox;

        @FindBy(id="fos_user_registration_form_nip")
        private WebElement nipTextBox;

        public void clickOnRegisterNewUser(){
            registerNewUser.click();
        }

        public void registerPrivateUser(String email, String name, String surname, String pass, String city, String code, String street, String number) throws IOException {
            emailTextBox.sendKeys(generate(6) + email);
            nameTextBox.sendKeys(name);
            lastnameTextBox.sendKeys(surname);
            passfirstTextBox.sendKeys(pass);
            passsecondTextBox.sendKeys(pass);
            citylTextBox.sendKeys(city);
            codeTextBox.sendKeys(code);
            streetTextBox.sendKeys(street);
            numberTextBox.sendKeys(number);

            regulaminCheeckBox.click();
            registerClickButton.click();
            takeScreenshot(driver,  "registerPrivateUser");
        }
        public Boolean validRegistration() {
            return userIsRegistred.isDisplayed();
        }

        public void registerCompanyUser(String email, String name, String surname, String pass, String city, String code, String street, String number, String company) throws IOException {
            emailTextBox.sendKeys(generate(6) + email);
            nameTextBox.sendKeys(name);
            lastnameTextBox.sendKeys(surname);
            passfirstTextBox.sendKeys(pass);
            passsecondTextBox.sendKeys(pass);
            citylTextBox.sendKeys(city);
            codeTextBox.sendKeys(code);
            streetTextBox.sendKeys(street);
            numberTextBox.sendKeys(number);
            companyTextBox.sendKeys(company);

            NipPage nipPage = new NipPage(driver);
            nipTextBox.sendKeys(nipPage.nipWebside());

            regulaminCheeckBox.click();
            registerClickButton.click();
            takeScreenshot(driver,  "registerCompanyeUser");
        }
    }

