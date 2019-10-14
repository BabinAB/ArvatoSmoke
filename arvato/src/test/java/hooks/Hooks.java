package hooks;

//import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.PropertyLoader;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public static void setup() {
        timeout = 20000;
        baseUrl = "http://arvato.ee";
        //Configuration.browserSize = PropertyLoader.loadProperty("browser.size");
        fastSetValue = true;
        open("/");
    }

    @After
    public static void clearCache() {
        clearBrowserCookies();
    }
}