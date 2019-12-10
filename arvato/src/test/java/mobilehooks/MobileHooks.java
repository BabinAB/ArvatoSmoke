package mobilehooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class MobileHooks {
    @Before
    public static void setup() {
        timeout = 10000;
        baseUrl = "https://idemo.bspb.ru/";

        fastSetValue = true;
        browserSize = "375x667";
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=iPhone 6/7/8");
        open("/");
    }

    @After
    public static void clearCache() {
        clearBrowserCookies();
    }
}
