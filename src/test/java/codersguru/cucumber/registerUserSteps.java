package codersguru.cucumber;

import codersguru.pages.RegistrationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class registerUserSteps {
    RegistrationPage registrationPage = new RegistrationPage(BaseSteps.driver);
    WebDriver driver = BaseSteps.driver;

    @Given("^I open site codersguru$")
    public void iOpenSiteCodersguru() {
        driver.get("https://tester.codersguru.pl/");
    }

    @When("^I click on register new user$")
    public void iClickOnRegisterNewUser() {
        registrationPage.clickOnRegisterNewUser();
    }

    @And("^I register private user with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iRegisterPrivateUserWith(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws IOException {
        registrationPage.registerPrivateUser(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
    @Then("^User should be successfully registered$")
    public void userShouldBeSuccessfullyRegistered() {
        Assert.assertTrue(registrationPage.validRegistration());
    }

    //Company
    @And("^I click on button 'Firma'$")
    public void iClickOnButtonFirma() {
        driver.findElement(By.id("company")).click();
    }

    @And("^I register company user with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" 'NIP'$")
    public void iRegisterCompanyUserWithNIP(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
        registrationPage.registerCompanyUser(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }
}
