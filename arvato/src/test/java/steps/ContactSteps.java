package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContactPage;

public class ContactSteps {

    ContactPage contact = new ContactPage();

    @Then("^User fills Name field$")
    public void userFillsNameField() throws Throwable {
        contact.checkingNameField();
        contact.setName();
    }

    @Then("^User fills Company field$")
    public void userFillsCompanyField() throws Throwable {
        contact.checkingCompanyField();
        contact.setCompany();
    }

    @Then("^User fills Email field$")
    public void userFillsEmailField() throws Throwable {
        contact.checkingEmailField();
        contact.setEmail();
    }

    @Then("^User fills Phone field$")
    public void userFillsPhoneField() throws Throwable {
        contact.checkingPhoneField();
        contact.setPhone();
    }

    @Then("^User fills Message form$")
    public void userFillsMessageForm() throws Throwable {
        contact.checkingMessageField();
        contact.setMessage();
    }

    @When("^User clicks on Submit button$")
    public void userClicksOnSubmitButton() throws Throwable {
        contact.clickSubmit();
    }

    @Then("^User see message of successfully operation$")
    public void userSeeMessageOfSuccessfullyOperation() throws Throwable {
        contact.checkSuccess();
    }

    @Then("^User see errors on Contact page$")
    public void userSeeErrorsOnContactPage() throws Throwable {
        contact.checkError();
    }

    @Then("^User fills \"([^\"]*)\" in Name field$")
    public void userFillsInNameField(String name) throws Throwable {
        contact.fillNameField(name);
    }

    @Then("^User fills \"([^\"]*)\" Company field$")
    public void userFillsCompanyField(String company) throws Throwable {
        contact.fillCompanyField(company);
    }

    @Then("^User fills \"([^\"]*)\" Email field$")
    public void userFillsEmailField(String email) throws Throwable {
        contact.fillEmailField(email);
    }

    @Then("^User fills \"([^\"]*)\" Phone field$")
    public void userFillsPhoneField(String phone) throws Throwable {
        contact.fillPhoneField(phone);
    }

    @Then("^User fills \"([^\"]*)\" Message form$")
    public void userFillsMessageForm(String message) throws Throwable {
        contact.fillMessageField(message);
    }
}
