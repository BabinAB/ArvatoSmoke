package util;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CustomWebDriverProvider implements WebDriverProvider {
    @SuppressWarnings("deprecation")
    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
        capabilities.setBrowserName("chrome");
        capabilities.setCapability(ChromeOptions.CAPABILITY, MyChromeBrowserMobile.getChromeOptions());

        System.out.println(capabilities);
        try {
            //ChromeDriver for local launch and RemoteWebDriver(getGridHubUrl(), capabilities); for Remote
            return new RemoteWebDriver(getGridHubUrl(), capabilities);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static URL getGridHubUrl() {
        URL hostURL = null;
        try {
            hostURL = new URL("http://admin:admin@127.0.0.1:4444/wd/hub");
        } catch (MalformedURLException e) {
            //e.printStackTrace();
        }
        return hostURL;
    }
}
