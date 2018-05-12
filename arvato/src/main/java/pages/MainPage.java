package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.id;
import static com.codeborne.selenide.Condition.visible;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private static String page = new String("crm-customer-services/");
    // Header elements
    private SelenideElement label = $("[alt=\"Arvato Estonia\"]"); // element with logo of Arvato
    private SelenideElement homePageHeader = $("#menu-item-56"); // element of Home
    private SelenideElement crmAndCustomerServicesHeader = $("#menu-item-58"); // element of CRM & Customer Services
    private SelenideElement itDevelopmentCentreHeader = $("#menu-item-57"); // element of IT Development Centre
    private SelenideElement crmOpenPositionsHeader = $("#menu-item-442"); //element of Open positions CRM
    private SelenideElement itCentreOpenPositionsHeader = $("#menu-item-59"); // IT Centre open positions
    private SelenideElement euProjectHeader = $("#menu-item-506"); // element of EU Project
    private SelenideElement contactHeader = $("#menu-item-101"); // element of Contacts
    private SelenideElement estLanguage = $("[lang=\"et\"]"); // element of choose Estonian language
    private SelenideElement engLanguage = $("[lang=\"en-US\"]"); //element of choosing English language

    // Content elements
    private SelenideElement leftPicture = $("[class=\"alignnone wp-image-185 size-full\"]"); //element left picture
    private SelenideElement rightPicture = $("[class=\"alignnone wp-image-184 size-full\"]"); //element right picture
    private SelenideElement moreInfoLeft = $(".content [href*=crm-customer-services]"); //element More Info from left
    private SelenideElement moreInfoRight = $(".content [href*=it-development-centre]"); //element More Info from right

    // Footer elements
    private SelenideElement homePageFooter = $("[id=\"menu-top-menu-1\"] [href*=frontpage]"); // element of Home in Footer
    private SelenideElement crmAndCustomerServicesFooter = $("[id=\"menu-top-menu-1\"] [href*=crm-customer-services]");
    private SelenideElement itDevelopmentCentreFooter = $("[id=\"menu-top-menu-1\"] [href*=it-development-centre]");
    private SelenideElement crmOpenPositionsFooter = $("[id=\"menu-top-menu-1\"] [href*=open-positions-crm]");
    private SelenideElement itCentreOpenPositionsFooter = $(By.xpath("//ul[@id='menu-top-menu-1']//a[@href='http://arvato.ee/en/open-positions/']"));
    private SelenideElement euProjectFooter = $("[id=\"menu-top-menu-1\"] [href*=eu-project]");
    private SelenideElement contactFooter = $("[id=\"menu-top-menu-1\"] [href*=contact]");
    private SelenideElement labelFooter = $(By.xpath("//footer/div[1]/div[3]/div[1]/a"));


    //This method can be used for making a Scenario output.
    public void click(String element) {
        $(By.id(element)).click();
    }

    public void clickHomeHead() {
        homePageHeader.click();
    }

    public void checkHomePage() {
        leftPicture.shouldBe(visible).shouldBe(visible);
        rightPicture.shouldBe(visible);
        moreInfoLeft.shouldBe(visible);
        moreInfoRight.shouldBe(visible);
    }

    public void clickCrmAndCustomsHead() {
        crmAndCustomerServicesHeader.click();
    }

    public void clickItDevelopmentCentreHead() {
        itDevelopmentCentreHeader.click();
    }

    public void clickCrmOpenPositionsHead() {
        crmOpenPositionsHeader.click();
    }

    public void clickItCentreOpenPositionsHead() {
        itCentreOpenPositionsHeader.click();
    }

    public void clickEuProjectHead() {
        euProjectHeader.click();
    }

    public void clickContactHead() {
        contactHeader.click();
    }


    public void clickEstonianButton() {
        estLanguage.click();
    }

    public void clickCrmAndCustomsFooter() {
        crmAndCustomerServicesFooter.click();
    }

    public void clickItDevelopmentCentreFooter() {
        itDevelopmentCentreFooter.click();
    }

    public void clickCrmOpenPositionsFooter() {
        crmOpenPositionsFooter.click();
    }

    public void clickItCentreOpenPOsitionsFooter() {
        itCentreOpenPositionsFooter.click();
    }

    public void clickEuPOjectFooter() {
        euProjectFooter.click();
    }

    public void clickContactFooter() {
        contactFooter.click();
    }

    public void clickHomePageFooter() {
        homePageFooter.click();
    }

    public void clickCrmCustomerServicesContent() {
        moreInfoLeft.click();
    }

    public void clickItDevelopmentCentreContent() {
        moreInfoRight.click();
    }
}
