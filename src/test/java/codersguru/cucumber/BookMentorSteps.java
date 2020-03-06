package codersguru.cucumber;

import codersguru.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import java.io.IOException;

public class BookMentorSteps {
    MentorPage mentor = new MentorPage(BaseSteps.driver);
    HomePage home = new HomePage(BaseSteps.driver);
    PayuPage pay = new PayuPage(BaseSteps.driver);

    @When("^I select \"([^\"]*)\"$")
    public void iSelect(String topic) throws IOException {
        home.selectTopic(topic);
    }
    @And("^I select mentor (\\d+)$")
    public void iSelectMentor(int mentorNumber) {
        mentor.selectMentorNumber(mentorNumber);
    }

    @And("^I select first date and hour possible with message \"([^\"]*)\"$")
    public void iSelectFirstDateAndHourPossibleWithMessage(String message) {
        mentor.selectFirstDateAndHour(message);
    }

    @Then("^I'm redirected to PayU site$")
    public void iMRedirectedToPayUSite() {
        Assert.assertTrue(pay.validPayuSite());
    }

    @When("^I enter fake credit card details$")
    public void iEnterFakeCreditCardDetails() throws IOException {
        pay.enterPaymentCardDetailes();
    }
    @Then("^Payment is refused$")
    public void paymentIsRefused(){
        pay.validInvalidEnterCardDetails();

    }
}
