package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class AbstractPage {
    public static final int WAIT_5_SECONDS = 5000;
    public static final int WAIT_10_SECONDS = 10000;


    public void click(SelenideElement element){
        element.waitUntil(visible, WAIT_5_SECONDS);
        element.shouldBe(enabled);
        element.click();
    }

    public void typeText(SelenideElement element, String text) {
        element.shouldBe(visible, enabled).clear();
        element.val(text);
    }

    public void checkVisibleElements(SelenideElement... elements) {
        for (SelenideElement element : elements) {
            element.waitUntil(visible, WAIT_10_SECONDS);
        }
    }

}
