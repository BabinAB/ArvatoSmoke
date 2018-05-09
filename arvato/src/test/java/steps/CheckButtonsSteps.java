package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;

public class CheckButtonsSteps {

    MainPage main = new MainPage();
    ContactPage contactPage = new ContactPage();
    CrmAndCustomerServicesPage crmAndCustomerServicesPage = new CrmAndCustomerServicesPage();
    CRMOpenPositionsPage crmOpenPositionsPage = new CRMOpenPositionsPage();
    EstonianPage estonianPage = new EstonianPage();
    ItCentreOpenPositionsPage itCentreOpenPositionsPage = new ItCentreOpenPositionsPage();
    ITDevelopmentCentrePage itDevelopmentCentrePage = new ITDevelopmentCentrePage();
    EuProjectPage eu = new EuProjectPage();
    Support support = new Support();

    @Given("^User is on the Main Page$")
    public void userIsOnTheMainPage() throws Throwable {
        main.checkHomePage();
    }

    @When("^User clicks on CRM & Customer Services in Header$")
    public void userClicksOnCRMCustomerServicesInHeader() throws Throwable {
        main.clickCrmAndCustomsHead();
    }

    @Then("^User see CRM & Customer Services page$")
    public void userSeeCRMCustomerServicesPage() throws Throwable {
        crmAndCustomerServicesPage.checkContentCrmAndCustomerServices();
        crmAndCustomerServicesPage.checkPictureCustomerService();
    }

    @When("^User clicks on IT Development Centre in Header$")
    public void userClicksOnITDevelopmentCentreInHeader() throws Throwable {
        main.clickItDevelopmentCentreHead();
    }

    @Then("^User see IT Development Centre page$")
    public void userSeeITDevelopmentCentrePage() throws Throwable {
        itDevelopmentCentrePage.checkItDevelopmentCentreButton();
        itDevelopmentCentrePage.checkItDevelopmentCentrePicture();
    }

    @When("^User clicks on CRM Open positions in Header$")
    public void userClicksOnCRMOpenPositionsInHeader() throws Throwable {
        main.clickCrmOpenPositionsHead();
    }

    @Then("^User see CRM Open positions page$")
    public void userSeeCRMOpenPositionsPage() throws Throwable {
        crmOpenPositionsPage.checkCRMOpenPositionPage();
    }

    @When("^User clicks on IT Centre Open positions in Header$")
    public void userClicksOnITCentreOpenPositionsInHeader() throws Throwable {
        main.clickItCentreOpenPositionsHead();
    }

    @Then("^User see IT Centre Open positions page$")
    public void userSeeITCentreOpenPositionsPage() throws Throwable {
        itCentreOpenPositionsPage.checkItCentreOpenPositionPage();
    }

    @When("^User clicks on EU Project in Header$")
    public void userClicksOnEUProjectInHeader() throws Throwable {
        main.clickEuProjectHead();
    }

    @Then("^User see EU Project page$")
    public void userSeeEUProjectPage() throws Throwable {
        eu.checkingEuPage();
    }

    @When("^User clicks on Contact in Header$")
    public void userClicksOnContactInHeader() throws Throwable {
        main.clickContactHead();
    }

    @Then("^User see Contact page$")
    public void userSeeContactPage() throws Throwable {
        contactPage.checkContactPage();
    }

    @When("^User clicks on Home in Header$")
    public void userClicksOnHomeInHeader() throws Throwable {
        main.clickHomeHead();
    }

    @Then("^User see Home page$")
    public void userSeeHomePage() throws Throwable {
        main.checkHomePage();
    }

    @When("^User switch to Estonian localization of the home page$")
    public void userSwitchToEstonianLocalizationOfTheHomePage() throws Throwable {
        main.clickEstonianButton();
    }

    @Then("^User see Estonian version of the Home page$")
    public void userSeeEstonianVersionOfTheHomePage() throws Throwable {
        estonianPage.checkEstonian();
    }

    @When("^User clicks on CRM & Customer Services in Footer$")
    public void userClicksOnCRMCustomerServicesInFooter() throws Throwable {
        main.clickCrmAndCustomsFooter();
    }

    @When("^User click on IT Development Centre in Footer$")
    public void userClickOnITDevelopmentCentreInFooter() throws Throwable {
        main.clickItDevelopmentCentreFooter();
    }

    @When("^User clicks on CRM Open positions in Footer$")
    public void userClicksOnCRMOpenPositionsInFooter() throws Throwable {
        main.clickCrmOpenPositionsFooter();
    }

    @When("^User clicks on IT Centre Open positions in Footer$")
    public void userClicksOnITCentreOpenPositionsInFooter() throws Throwable {
        main.clickItCentreOpenPOsitionsFooter();
    }

    @When("^User clicks on EU Project in Footer$")
    public void userClicksOnEUProjectInFooter() throws Throwable {
        main.clickEuPOjectFooter();
    }

    @When("^User clicks on Contact in Footer$")
    public void userClicksOnContactInFooter() throws Throwable {
        main.clickContactFooter();
    }

    @When("^User clicks on Home in Footer$")
    public void userClicksOnHomeInFooter() throws Throwable {
        main.clickHomePageFooter();
    }

    @When("^User clicks on CRM & Customer Services in Content$")
    public void userClicksOnCRMCustomerServicesInContent() throws Throwable {
        main.clickCrmCustomerServicesContent();
    }

    @When("^User clicks on IT Development Centre in Content$")
    public void userClicksOnITDevelopmentCentreInContent() throws Throwable {
        main.clickItDevelopmentCentreContent();
    }

}
