package steps;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

        @Given("User is on login page")
        public void checkPage() {
            loginPage.checkPage();
        }

}
