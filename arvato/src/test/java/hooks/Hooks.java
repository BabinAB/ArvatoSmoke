package hooks;



import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Configuration.*;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public static void setup() {
        timeout = 10000;
        baseUrl = "https://idemo.bspb.ru/";

        fastSetValue = false;
        open("/");
    }

    @After
    public static void clearCache() {
        clearBrowserCookies();
    }
}