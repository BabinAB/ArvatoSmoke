package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class ContactPage {

    private SelenideElement name = $(byName("your")); // element with Name
    private SelenideElement company = $(byName("company")); // element with Company
    private SelenideElement email = $(byName("email")); // element with email
    private SelenideElement phone = $(byName("phone")); // element with phone
    private SelenideElement message = $(byName("message")); // Empty field for writing text
    private SelenideElement submit = $(".wpcf7-form-control.wpcf7-submit"); // Submit button
    private SelenideElement contentField = $(".contact-content"); // Content of page
    private SelenideElement error = $(".wpcf7-validation-errors"); // Error
    private SelenideElement successSubmit = $(".wpcf7-mail-sent-ok"); // success submit



    public void checkContactPage() {
        name.shouldBe(Condition.visible);
        company.shouldBe(Condition.visible);
        email.shouldBe(Condition.visible);
        phone.shouldBe(Condition.visible);
        submit.shouldBe(Condition.visible);
        contentField.shouldBe(Condition.visible);
    }

    public void checkingNameField() {
        name.shouldBe(Condition.enabled).shouldBe(Condition.visible);
    }

    public void setName() {
        name.val("Test");
    }

    public void checkingCompanyField() {
        company.shouldBe(Condition.enabled).shouldBe(Condition.visible);
    }

    public void setCompany() {
        company.val("Test");
    }

    public void checkingEmailField() {
        email.shouldBe(Condition.enabled).shouldBe(Condition.visible);
    }

    public void setEmail() {
        email.val("testing@test.net");
    }

    public void checkingPhoneField() {
        phone.shouldBe(Condition.enabled).shouldBe(Condition.visible);
    }

    public void setPhone() {
        phone.val("Test");
    }

    public void checkingMessageField() {
        message.shouldBe(Condition.enabled).shouldBe(Condition.visible);
    }
    public void setMessage() {
        message.val("Test");
    }

    public void clickSubmit() {
        submit.click();
    }

    public void checkError() {
        error.shouldBe(Condition.visible);
    }

    public void checkSuccess() {
        successSubmit.shouldHave(text("Thank you for your message. It has been sent."))
                .shouldNotHave(text("One or more fields have an error. Please check and try again."));
    }

    public void fillNameField(String text) {
        name.val(text);
    }
    public void fillCompanyField(String text) {
        company.val(text);
    }

    public void fillEmailField(String text) {
        email.val(text);
    }

    public void fillPhoneField(String text) {
        phone.val(text);
    }

    public void fillMessageField(String text) {
        message.val(text);
    }

}
