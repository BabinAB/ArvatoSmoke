package steps.mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.mobile.MobileLoginPage;
import pages.mobile.MobileMemberHomePage;

public class LoginSteps {
   MobileLoginPage loginPage = new MobileLoginPage();
   MobileMemberHomePage memberHomePage = new MobileMemberHomePage();

   @Given("User is on mobile login page")
    public void checkPage() {
       loginPage.checkPage();
   }
   @When("User clicks on login button")
    public void clickLogin() {
       loginPage.login();
   }

    @When("User enters {string} in the username field")
    public void enterUsername(String username) {
       loginPage.enterUsername(username);
    }

    @When("User enters {string} in the password field")
    public void entersPassword(String password) {
       loginPage.enterPass(password);
    }

    @When("User clicks on Proceed button")
    public void clicksProceedBtn() {
       loginPage.clickProceedBtn();
    }

    @Then("User should see OTP page")
    public void checkOTPPage() {
        loginPage.checkOtp();
    }

    @Then("User enters {string} in the OTP field")
    public void enterOTP(String otp) {
       loginPage.enterOtpCode(otp);
       loginPage.confirmOtp();
    }

    @Then("User should see MainHomePage")
    public void userShouldSeeMainHomePage() {
       memberHomePage.checkPage();
    }

}
