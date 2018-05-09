package pages;

import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import util.PropertyLoader;

import static com.codeborne.selenide.WebDriverRunner.url;

// this class for future
public class Support {
    private String checkedUrl = new String(Configuration.baseUrl = PropertyLoader.loadProperty("site.url"));
    private String urls = new String();



}
