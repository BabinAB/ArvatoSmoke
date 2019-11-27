package hooks;



import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Configuration.*;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public static void setup() {
        timeout = 20000;
        baseUrl = "https://idemo.bspb.ru/";
        //Configuration.browserSize = PropertyLoader.loadProperty("browser.size");
        fastSetValue = true;
        open("/");
    }

    @After
    public static void clearCache() {
        clearBrowserCookies();
    }
}