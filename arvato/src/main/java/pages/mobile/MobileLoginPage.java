package pages.mobile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.AbstractPage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class MobileLoginPage extends AbstractPage {
    private SelenideElement mobileLoginBtn = $("#login-button.btn");
    private SelenideElement userName = $(byId("username"));
    private SelenideElement password = $(byName("password"));
    private SelenideElement proceedBtn = $("#login-btn-wrap > button");
    private SelenideElement otpfield = $(byName("otpCode"));
    private SelenideElement confirmOtpBtn = $(".form-actions .ui-btn");




    public void checkPage(){
        mobileLoginBtn.shouldBe(Condition.visible);
    }
    public void login() {
        mobileLoginBtn.click();
    }

    public void enterUsername(String username) {
        typeText(userName, username);
    }

    public void enterPass(String pass) {
        typeText(password, pass);
    }

    public void clickProceedBtn() {
        click(proceedBtn);
    }

    public void checkOtp() {
        checkVisibleElements(otpfield);
    }

    public void enterOtpCode(String otp) {
        typeText(otpfield, otp);
    }

    public void confirmOtp() {
        click(confirmOtpBtn);
    }

}
