package steps.classic;

import io.cucumber.java.en.Given;
import pages.classic.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

        @Given("User is on login page")
        public void checkPage() {
            loginPage.checkPage();
        }

}
