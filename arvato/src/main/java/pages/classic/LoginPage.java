package pages.classic;

import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement securityInfo = $(byId("security-info"));
    private SelenideElement username = $(byName("username"));

    public void checkPage(){
        securityInfo.shouldBe(visible);
        securityInfo.shouldNotBe(hidden);
    }
}
