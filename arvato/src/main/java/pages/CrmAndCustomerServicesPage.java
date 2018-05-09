package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class CrmAndCustomerServicesPage {

    private SelenideElement openPositionsCRMbutton = $(".crm-content .btn"); // Open Positions button
    private SelenideElement crmCustomerServicesContentText = $(".crm-content"); // element with text in Content part of the page
    private SelenideElement crmCustomerServicesPicture = $(".crm"); // picture in Content

// checking the element with text in Content
    public void checkContentCrmAndCustomerServices() {
        crmCustomerServicesContentText.shouldBe(Condition.visible);
    }
// Checking the picture in Content
    public void checkPictureCustomerService() {
        crmCustomerServicesPicture.shouldBe(Condition.visible);
    }

//Click on Open Positions CRM button
    public void clickOpenPositionsCrmButton() {
        openPositionsCRMbutton.click();
    }


}
